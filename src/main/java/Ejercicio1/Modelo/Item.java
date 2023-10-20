package Ejercicio1.Modelo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Item {
    public String description;
    private BigDecimal weight;
    private BigDecimal price;

    public Item(String description, BigDecimal weight, BigDecimal price) {
        this.description = description;
        this.weight = weight;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }

    //netTotal es el importe total del pedido (Order) sin considerar los impuestos (VAT).


    //grossTotal es el importe total del pedido (Order) incluyendo los impuestos (VAT).

    /**
     * General: 21%
     * Reduced: 10%
     * Superreduced: 4%
     */

}
