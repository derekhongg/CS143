//Derek Hong
// CS143

import java.util.*;

class Lecture03 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 03");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // 21. Consider the following variable declarations:
        Integer n1 = 15;
        Integer n2 = 7;
        Integer n3 = 15;
        String s1 = "computer";
        String s2 = "soda";
        String s3 = "pencil";

        // Indicate whether the result of each of the following comparisons is positive,
        // negative, or 0:

        // A: positive
        // System.out.println(n1.compareTo(n2));
        // B: 0
        // n3.compareTo(n1)
        // C: negative
        // n2.compareTo(n1)
        // D: negative
        System.out.println("s1 compareTo s2: " + s1.compareTo(s2));
        // E: positive
        System.out.println(s3.compareTo(s1));
        // F: 0
        // s2.compareTo(s2);

        // 22. Use the compareTo method to write code that reads two names from the
        // console and prints the one that comes first in alphabetical order. For
        // example, the program’s output might look like the following:

        // Type a name: Tyler Durden
        // Type a name: Marla Singer
        // Marla Singer goes before Tyler Durden
        // Review code below

        // 23. Write code to read a line of input from the user and print the words of
        // that line in sorted order, without removing duplicates. For example, the
        // program output might look like the following:
        // Review code below

        // Type a message to sort:  to be or not to be that is the question
        // Your message sorted: be be is not or question that the to to

        // EXERCISES:
        // Review Code Below
        // None
    }

    public class inOrder {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Type a name: ");
            String n1 = input.nextLine();

            System.out.print("Type second name: ");
            String n2 = input.nextLine();

            int compare = n1.compareTo(n2);

            if (compare < 0) {
                System.out.println(n1 + " goes before " + n2);
            } else if (compare > 0) {
                System.out.println(n2 + " goes before " + n1);
            } else {
                System.out.println("Both names are the same");
            }
        }
    }

    public class AlphabeticalOrder {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Type a message to sort: ");
            String text = input.nextLine();

            ArrayList<String> list = new ArrayList<>();
            Collections.sort(list);

            System.out.print("Your message sorted: ");
            for (String words : list) {
                System.out.print(words + " ");
            }
        }
    }

    public class CalendarDate implements Comparable<CalendarDate> {
        private int month;
        private int day;
        private int year;

        public CalendarDate(int month, int day, int year) {
            this.month = month;
            this.day = day;
            this.year = year;
        }

        // Compares this calendar date to another date.
        // Dates are compared by month and then by day.
        public int compareTo(CalendarDate other) {
            if (year != other.year) {
                return year - other.year;
            } else if (month != other.month) {
                return month - other.month;
            } else {
                return day - other.day;
            }
        }
        public int getYear() {
            return year;
        }
        public int getMonth() {
            return month;
        }
        public int getDay() {
            return day;
        }
        public String toString() {
            return year + "/" + month + "/" + day;
        }
    }

}
