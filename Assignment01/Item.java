import java.text.*;

public class Item {
    // You will need to add more instance variables
    private double price;
    private double bulkPrice;
    private NumberFormat formatter;
    private String name;
    private int bulkQuantity;

    public Item(String name, double price) {
        if (price < 0) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.price = price;
    }

    public Item(String name, double price, int bulkQuantity, double bulkPrice) {
        // this(/*WHAT SHOULD YOU PUT HERE?*/);
        this.name = name;
        this.price = price;
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;

    }

    public double priceFor(int quantity) {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        double actual = 0;
        if(quantity < 0) {
            throw new IllegalArgumentException();
        } else {
            if(bulkQuantity != 0) {
                actual = (quantity/bulkQuantity) * bulkPrice + (quantity % bulkQuantity) * price;
            } else {
                actual = quantity * price;
            }
        }
        return actual;
    }

    public String toString() {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        NumberFormat format = (NumberFormat) NumberFormat.getCurrencyInstance();
        format.setMinimumFractionDigits(2);
        format.setMaximumFractionDigits(2);
        String str = "";
        str = name + ", " + format.format(price);
        if(bulkPrice != 0) {
            str += "(" + bulkQuantity + "for" + format.format(bulkPrice) + ")";
        }
        return str;
    }
}
