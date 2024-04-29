import java.util.*;

class Lecture04 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 04");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // 1. When should you use a LinkedList instead of an ArrayList?
            /*
            1. When there are frequent insertions or deletions of elements or changes
            2. When the primary operation is iterating over elements
            3. When there is limited memory available
            4. Maintaining the order of elements is important
            */
        // 2. Would a LinkedList or an ArrayList perform better when run on the
        // following code? Why?
        // public static int min(List<Integer> list) {
        // int min = list.get(0);
        // for (int i = 1; i < list.size(); i++) {
        // if (list.get(i) < min) {
        // min = list.get(i);
        // }
        // }
        // return min;
        // }

        /*
            An ArrayList would be better in this case. The code uses indexes and the get method is used multiple times to retrieve elements
        */

        // 3. What is an iterator? Why are iterators often used with linked lists?
            /*
            An iterator is an object used to go through over the elements of a collection.
            They are often used with Linked Lists because they don't offer direct access by indexes
            You have to traverse through the nodes in sequence
            */
        // 4. Write a piece of code that counts the number of duplicate elements in a
        // linked list.
        // That is, the number of elements whose values are repeated at an earlier index
        // in the list. Assume that all duplicates in the list occur consecutively. For
        // example, the list [1, 1, 3, 5, 5, 5, 5, 7, 7, 11] contains five duplicates:
        // one duplicate of element value 1, three duplicates of element value 5, and
        // one duplicate of element value 7.

        /*
        public class LinkedListDuplicates {

            public static int countDuplicates(LinkedList<Integer> list) {
                int count = 0;
                Integer previous = null;

                for (Integer current : list) {
                    if (current.equals(previous)) {
                        count++;
                    }
                    previous = current;
                }
                return count;
            }

            public static void main(String[] args) {
                LinkedList<Integer> list = new LinkedList<>();
                list.add(1);
                list.add(1);
                list.add(3);
                list.add(5);
                list.add(5);
                list.add(5);
                list.add(5);
                list.add(7);
                list.add(7);
                list.add(11);

                int duplicates = countDuplicates(list);
                System.out.println("Number of duplicates: " + duplicates);
            }
        }
        */

        // 5. Write a piece of code that inserts a String into an ordered linked list of
        // Strings, maintaining sorted order.
        // For example, for the list ["Alpha", "Baker", "Foxtrot", "Tango", "Whiskey"],
        // inserting "Charlie" in order would produce the list ["Alpha", "Baker",
        // "Charlie", "Foxtrot", "Tango", "Whiskey"].
            /*
                public class OrderedLinkedList {

                    public static void insertInOrder(LinkedList<String> list, String element) {
                        int index = 0;
                        while (index < list.size() && element.compareTo(list.get(index)) > 0) {
                            index++;
                        }
                        list.add(index, element);
                    }
                    public static void main(String[] args) {
                        LinkedList<String> list = new LinkedList<>();
                        list.add("Alpha");
                        list.add("Baker");
                        list.add("Foxtrot");
                        list.add("Tango");
                        list.add("Whiskey");

                        String elementToInsert = "Charlie";
                        insertInOrder(list, elementToInsert);
                        System.out.println(list);
                    }
                }
            */
        // From Section 11.2: Sets
        // 10. A List has every method that a Set has, and more. So why would you use a
        // Set rather than a List?
            /*
                1. Every element is unique and is required to be unique
                2. Order of elements are not important
            */
        // 11. When should you use a TreeSet, and when should you use a HashSet?
                /*
                Use TreeSets when you need elements to be sorted in natural order
                Use HashSets when you don't need an order
                */
        // 12. A Set doesn’t have the get and set methods that an ArrayList has. How do
        // you examine every element of a Set?
            /*
                Can use a for loop or while loop, use the hasNext()
            */

        // 13. What elements are contained in the following set after this code
        // executes?

        // Set<Integer> set = new HashSet<>();
        // set.add(74);
        // set.add(12);
        // set.add(74);
        // set.add(74);
        // set.add(43);
        // set.remove(74);
        // set.remove(999);
        // set.remove(43);
        // set.add(32);
        // set.add(12);
        // set.add(9);
        // set.add(999);
            // 12, 32, 9
        // 14. How do you perform a union operation on two sets? An intersection? Try to
        // give an answer that doesn’t require any loops.
            /*
            You can use the addAll() method on union operation
            You can use the retainAll() method on intersection operations
            */
        // 15. Write the output produced when the following method is passed each of the
        // following lists:

        // public static void mystery(List<String> list) {
        // Set<String> result = new TreeSet<>();
        // for (String element : list) {
        // if (element.compareTo(list.get(0)) < 0) {
        // result.add(element);
        // } else {
        // result.clear();
        // }
        // }
        // System.out.println(result);
        // }
        // [marty, stuart, helene, jessica, amanda]
        // [sara, caitlin, janette, zack, riley]
        // [zorah, alex, tyler, roy, roy, charlie, phil, charlie, tyler]
            /*
                1.[marty, helene, jessica, amanda]
                2.[sara, caitlin, janette, zack, riley]
                3.[zorah, alex, tyler, roy, roy, charlie, phil, charlie, tyler]
            */
        // Exercises:
        // 2. Write a method called alternate that accepts two Lists as its parameters
        // and returns a new List containing alternating elements from the two lists, in
        // the following order:

        // First element from first list
        // First element from second list
        // Second element from first list
        // Second element from second list
        // Third element from first list
        // Third element from second list
        // . . .
        // If the lists do not contain the same number of elements, the remaining
        // elements from the longer list should be placed consecutively at the end. For
        // example, for a first list of [1, 2, 3, 4, 5] and a second list of [6, 7, 8,
        // 9, 10, 11, 12], a call of alternate(list1, list2) should return a list
        // containing [1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12].

        /* Review code */

        // 9. Write a method hasOdd that accepts a set of integers as a parameter and
        // returns true if the set contains at least one odd integer and false
        // otherwise.
        // If passed the empty set, your method should return false.
        /* Review Code */
    }
    public class AlternateLists {
        public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
            List<Integer> result = new ArrayList<>();
            int size1 = list1.size();
            int size2 = list2.size();
            int maxSize = Math.max(size1, size2);
    
            for (int i = 0; i < maxSize; i++) {
                if (i < size1) {
                    result.add(list1.get(i));
                }
                if (i < size2) {
                    result.add(list2.get(i));
                }
            }
            return result;
        }
    
        public static void main(String[] args) {
            List<Integer> list1 = List.of(1, 2, 3, 4, 5);
            List<Integer> list2 = List.of(6, 7, 8, 9, 10, 11, 12);
    
            List<Integer> result = alternate(list1, list2);
            System.out.println("Results for AlternateLists: " + result);
        }
    }
    public class SetOperations {
        public static boolean hasOdd(Set<Integer> set) {
            for (int num : set) {
                if (num % 2 != 0) {
                    return true;
                }
            }
            return false;
        }
    
        public static void main(String[] args) {
            Set<Integer> set1 = Set.of(2, 4, 6, 8, 10);
            Set<Integer> set2 = Set.of(1, 2, 3, 4, 5);
            Set<Integer> set3 = Set.of();
    
            System.out.println(hasOdd(set1));
            System.out.println(hasOdd(set2));
            System.out.println(hasOdd(set3));
        }
    }
}
