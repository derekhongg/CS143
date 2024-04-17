// Derek Hong
// CS143
//

import java.util.ArrayList;

public class ShoppingCart {

    public static final double DISCOUNT_PERCENT = 0.9;

    private ArrayList<ItemOrder> items;
    private boolean discount;

    public ShoppingCart() {
        items = new ArrayList<>();
        discount = false;
    }

    public void add(ItemOrder next) {
        for (ItemOrder order : items) {
            if (order.getItem().equals(next.getItem())) {
                items.remove(order);
                break;
            }
        }
        items.add(next);
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public double getTotal() {
        double total = 0;
        for (ItemOrder itemOrder : items) {
            total += itemOrder.getPrice();
        }
        if (discount) {
            total *= DISCOUNT_PERCENT;
        }
        return total;
    }
}