public class ItemOrder {
    private Item item;

    public ItemOrder(Item item, int quantity) {

    }

    public double getPrice() {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        return Double.MIN_VALUE;
    }

    public Item getItem() {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        return null;
    }
}
