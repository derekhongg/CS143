import java.util.*;

public class Catalog {

    private ArrayList<Item> items;

    public Catalog() {
        this.items = new ArrayList<>();
    }

    public void add(Item next) {
        items.add(next);
    }

    public int size() {
        return items.size();
    }

    public Item get(int index) {
        return items.get(index);
    }

    public String getName() {
        return "Catalog";
    }
}
