package Ejercicio1;

import Ejercicio1.Modelo.*;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        BigDecimal price1 = new BigDecimal("52.99");
        BigDecimal weight1 = new BigDecimal("0.395");

        BigDecimal price2 = new BigDecimal("52.99");
        BigDecimal weight2 = new BigDecimal("1758.95");

        Item item1 = new Item("Western Digital Unidad interna de estado sólido SSD WD SN580 NVMe azul de 1 TB\n"
        , weight1, price2);

        Item item2 = new Item("Apple MacBook Pro M1 Pro\n", price2, weight2);

        OrderDetail orderDetail1 = new OrderDetail(3, TaxType.GENERAL, item1);
        OrderDetail orderDetail2 = new OrderDetail(2, TaxType.REDUCED, item2);

        Order order1 = new Order(LocalDate.now(), Status.COMPLETE, orderDetail1);
        Order order2 = new Order(LocalDate.now(), Status.COMPLETE, orderDetail2);

        System.out.println("ORDER1 VAT:" + order1.calcVAT());
        System.out.println("ORDER1 net:" + order1.calcNetTotal());
        System.out.println("ORDER1 gross:" + order1.calcGrossTotal());

    }


}
