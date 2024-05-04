import java.util.*;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <=5; i++) {
            list.add(i);
        }
        int size = list.size();
        for(int i = 0; i < size; i++) {
            list.add(24);
        }
        System.out.println(list);
    }

    public static void mystery(List<String> list) {
        Set<String> result = new TreeSet<>();
        for (String element : list) {
            if (element.compareTo(list.get(0)) < 0) {
                result.add(element);
            } else {
                result.clear();
            }
        }
        System.out.println(result);
    }
}