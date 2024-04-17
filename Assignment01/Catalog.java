import java.util.*;

public class Catalog {

    private ArrayList<Item> items;
    private String name;

    public Catalog(String name) {
        this.items = new ArrayList<>();
        this.name = name;
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
        return name;
    }
}
