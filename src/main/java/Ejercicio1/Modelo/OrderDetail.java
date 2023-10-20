package Ejercicio1.Modelo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import Ejercicio1.Modelo.TaxType;

public class OrderDetail {
    public int quantity;
    public TaxType taxType;

    public Item item;

    public OrderDetail(int quantity, TaxType taxType, Item item) {
        this.quantity = quantity;
        this.taxType = taxType;
        this.item = item;
    }



    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public TaxType getTaxType() {
        return taxType;
    }

    public void setTaxType(TaxType taxType) {
        this.taxType = taxType;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "quantity=" + quantity +
                ", taxType=" + taxType +
                '}';
    }

    //El resultado de los métodos de  SubTotal y Total de la clase Order debe redondearse a 2 decimales.
    public BigDecimal calcSubTotal(){
        final MathContext MATH_CONTEXT = new MathContext(2, RoundingMode.HALF_UP);

        return this.item.getPrice().multiply(new BigDecimal(BigInteger.valueOf(getQuantity()), MATH_CONTEXT));


    }

    //El resultado de calcWeight() debe redondearse a 3 decimales.

    public BigDecimal caclWeight(){
        final MathContext MATH_CONTEXT = new MathContext(3, RoundingMode.HALF_UP);

        return this.item.getWeight().multiply(new BigDecimal(BigInteger.valueOf(getQuantity()), MATH_CONTEXT));

    }
}
