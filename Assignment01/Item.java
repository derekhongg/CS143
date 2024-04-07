import java.text.*;

public class Item {
    private String name;
    private double price;
    private double bulkPrice;
    private int bulkQuantity;
    private NumberFormat formatter;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.formatter = NumberFormat.getCurrencyInstance();
    }

    public Item(String name, double price, int bulkQuantity, double bulkPrice) {
        this(name, price);
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;
    }

    public double priceFor(int quantity) {
        if (bulkQuantity != 0 && bulkPrice != 0 && quantity >= bulkQuantity) {
            int bulkUnits = quantity / bulkQuantity;
            int remainder = quantity % bulkQuantity;
            return (bulkUnits * bulkPrice) + (remainder * price);
        } else {
            return quantity * price;
        }
    }

    @Override
    public String toString() {
        return name + ": " + formatter.format(price);
    }
}
