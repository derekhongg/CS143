public class Example {
    public static void main (String[] args) {
        System.out.println(0%2);
        mystery(321);
    }
    public static void mystery(int n) {
        System.out.print(n);
        if(n >= 3) {
            mystery(n/10);
        }

        if(n%2 != 0) {
            System.out.print("+");
        } else {
            System.out.print("-");
        }
    }
}