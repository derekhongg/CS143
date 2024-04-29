//Derek Hong
//CS 143
import java.util.*;

class Lecture02 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 02");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // Put your answer for #1 here:
        // 1. What is an ArrayList? In what cases should you use an ArrayList rather
        // than an array?
            /* 
            An array list is a collection of data stored in an order of sequenced elements
            - Some ways you would need to use an ArrayList over an array is if you need dynamic sizing requirements that require you to add or subtract from the array
            - ArrayLists provide easier methods to work with than Arrays. Such as sorting, searching, or modifying. 
             */
        // Put your answer for #3 here:
        // 3. Write the code to declare an ArrayList containing these elements. What is
        // the size of the list? What is its type?
        ArrayList<String> list = new ArrayList<String>();
        list.add("It");
        list.add("was");
        list.add("a");
        list.add("stormy");
        list.add("night");

        System.out.println("The size of the list is: " + list.size());
        /* 
            The type of the list is an ArrayList
        */
        // Put your answer for #4 here:
        // 4. Write code to insert two additional elements, "dark" and "and", at the
        // proper places in the list to produce the following ArrayList as the result:
        // ["It", "was", "a", "dark", "and", "stormy", "night"]
        list.add(3, "dark");
        list.add(4, "and");
        // Put your answer for #5 here:
        // 5. Write code to change the second element’s value to "IS", producing the
        // following ArrayList as the result:
        // ["It", "IS", "a", "dark", "and", "stormy", "night"]
        list.set(1, "IS");
        System.out.println(list);
        // Put your answer for #7 here:
        // 7. Write code to declare an ArrayList holding the first 10 multiples of 2: 0,
        // 2, 4,..., 18. Use a loop to fill the list with the proper elements.
        ArrayList<Integer> numsList = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++) {
            numsList.add(i * 2);
        }

        System.out.println(numsList);
        // Put your answer for #9 here:
        // 9. Write code to print out whether or not a list of Strings contains the
        // value "IS". Do not use a loop.
        boolean containString = list.contains("IS");
        System.out.println("Does the String list contain 'IS'? " + containString);
        // Put your answer for #14 here:
        // 14. What is a wrapper class? Describe the difference between an int and an
        // Integer.
            /* 
            A wrapper is an object whose purpose is to hold a primative value (ex. int - Integer, double -> Double, char -> Character, boolean -> Boolean)
            Integer allows more functionality
            */
        // Put your answer for #13 here:
        // 13. The code that follows does not compile. Why not? Explain how to fix it.
            /* 
            the <int> doesn't allow it to compile. You'll need to change it to <Integer>
             */
        // ArrayList<int> numbers = new ArrayList<>();
        // numbers.add(7);
        // numbers.add(19);
        // System.out.println(numbers);

        // Put your answer for #15 here:
        // 15. Write the output produced when the following method is passed each of the
        // following lists:

        // A. [2, 6, 1, 8]
        // B. [30, 20, 10, 60, 50, 40]
        // C. [-4, 16, 9, 1, 64, 25, 36, 4, 49]

        /* 
        A. [1, 2, 6, 8]
        B. [10, 30, 40, 20, 60, 50]
        C. [-4, 1, 25, 4, 16, 9, 64, 36, 49]
        */
    }
}
