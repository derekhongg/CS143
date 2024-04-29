import java.util.*;

public class Example {
    public static void main(String[] args) {
        // ArrayList <String> list = new ArrayList<>();
        // list.add("marty");
        // list.add("stuart");
        // list.add("helene");
        // list.add("jessica");
        // list.add("amanda");
        // mystery(list);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 5; i >= 1; i--) {
            list.add(i);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.add(i, 24);
        }
        System.out.println(list);

        Map<String, String> map = new TreeMap<>();
        map.put("two", "deux");
        map.put("five", "cinq");
        map.put("one", "un");
        map.put("three", "trois");
        map.put("four", "quatre");

        mystery(map);
    }

    public static void mystery(Map<String, String> map) {
        Map<String, String> result = new TreeMap<>();
        for (String key : map.keySet()) {
            if (key.compareTo(map.get(key)) < 0) {
                result.put(key, map.get(key));
            } else {
                result.put(map.get(key), key);
            }
        }
        System.out.println(result);
    }
}