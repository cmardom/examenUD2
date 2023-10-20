package Ejercicio1.Modelo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.time.LocalDate;

import static Ejercicio1.Modelo.TaxType.GENERAL;
import static Ejercicio1.Modelo.TaxType.REDUCED;
import static java.lang.String.valueOf;

public class Order {
    public LocalDate date;
    public Status status;

    public OrderDetail orderDetail;

    public Order(LocalDate date, Status status, OrderDetail orderDetail) {
        this.date = date;
        this.status = status;
        this.orderDetail = orderDetail;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    @Override
    public String toString() {
        return "Order{" +
                "date=" + date +
                ", status=" + status +
                ", orderDetail=" + orderDetail +
                '}';
    }

    public BigDecimal calcNetTotal(){
        final MathContext MATH_CONTEXT = new MathContext(2, RoundingMode.HALF_UP);
        return this.orderDetail.getItem().getPrice().multiply(new BigDecimal(BigInteger.valueOf(this.orderDetail.getQuantity()), MATH_CONTEXT));
    }

    public BigDecimal calcGrossTotal(){
        BigDecimal netTotal = calcNetTotal();
        BigDecimal VAT = calcVAT();

        return netTotal.multiply(VAT);

    }

    public BigDecimal calcVAT(){
        BigDecimal VAT = new BigDecimal (valueOf(0));
        if (this.orderDetail.getTaxType().equals(GENERAL)){
            VAT = calcNetTotal().multiply(new BigDecimal(valueOf(0.21)));
        } else if (this.orderDetail.getTaxType().equals(REDUCED)){
            VAT = calcNetTotal().multiply(new BigDecimal(valueOf(0.10)));

//        } else if (this.orderDetail.getTaxType().equals(SUPERRREDUCED)){
//            VAT = calcNetTotal().multiply(new BigDecimal(valueOf(0.10)));
        }
        return VAT;
    }
}
