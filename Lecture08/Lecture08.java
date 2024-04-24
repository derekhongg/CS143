import java.util.*;

class Lecture08 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 08");
        int[] numbers = { -4, 2, 7, 10, 15, 20, 22, 25, 30, 36, 42, 50, 56, 68, 85, 92, 103 };
        System.out.println(Arrays.binarySearch(numbers, 66));
        // SELF-CHECK PROBLEMS:
        // Section 13.1: Searching and Sorting in the Java Class Libraries
        // 3. Should you use a sequential or binary search on an array of Point objects,
        // and why?

        /*
         * - Use binary search for efficiency
         */

        // 4. Under what circumstances can the Arrays.binarySearch and
        // Collections.binarySearch methods be used successfully?
        /*
         * 1. The array or collection are already sorted
         * 2. Elements must be comparable
         * 3. For collections the method expects a 'List' that supports random access by
         * index
         */
        // 5. In what order does the Collections.sort method arrange a list of strings?
        // How could you arrange them into a different order?
        /*
         * The Collections.sort method sorts a list of strings ascending in
         * lexographical order.
         * To sort things in a different order, you can pass a custom 'compartor' to
         * 'Collections.sort'
         */
        // Section 13.2: Program Complexity
        // 9. Approximate the runtime of the following code fragment listed in Canvas
        /*
         * O(logN)
         */
        // 10. Approximate the runtime of the following code fragment listed in Canvas
        /*
         * O(N) - loop only runs one time
         */
        // 11. Approximate the runtime of the following code fragment listed in Canvas
        /* O(N^2) */

        // Section 13.3: Implementing Searching and Sorting Algorithms
        // 16. What is the runtime complexity class of a sequential search on an
        // unsorted array?
        // What is the runtime complexity class of the modified sequential search on a
        // sorted array?
        /*
         * Sequential Search: O(N)
         * 
         * Modified Sequential Search: O(N)
         */
        // 17. Why does the binary search algorithm require the input to be sorted?
        /*
         * The binary search algorithm relies on the principle of divide and conquer to
         * locate it's target
         * 
         */
        // 18. How many elements (at most) does a binary search examine if the array
        // contains 60 elements?

        /*
         * Log2(60) = 5.9069
         * 
         * Round up to 6 - So the worst case scenario we'd assume is 7.
         */

        // 19. What indexes will be examined as the middle element by a binary search
        // for the target value 8 when the search is run on the following input arrays?
        // What value will the binary search algorithm return?

        // A. int[] numbers = {1, 3, 6, 7, 8, 10, 15, 20, 30};
        /* 4 */
        // B. int[] numbers = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        /* 6 */
        // C. int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        /* 7 */
        // D. int[] numbers = {8, 9, 12, 14, 15, 17, 19, 25, 31};
        /* 0 */
        // 20. What indexes will be examined as the middle element by a binary search
        // for the target value 8 when the search is run on the following input array?
        // Notice that the input array isn’t in sorted order. What can you say about the
        // binary search algorithm’s result?

        // int[] numbers = {6, 5, 8, 19, 7, 35, 22, 11, 9};
        /* -4 */
        // 23. What modifications would you have to make to the selectionSort method to
        // cause it to sort an array of double values rather than one of integer values?
        /*
         * Make the array parameter to take doubles instead of int
         * Update any local variables to make sure they are doubles
         */
        // 24. Consider the following array:

        // int[] numbers = {29, 17, 3, 94, 46, 8, –4, 12};
        // After a single pass of the selection sort algorithm (a single swap), what
        // would be the state of the array?

        // A. {–4, 29, 17, 3, 94, 46, 8, 12}
        // B. {29, 17, 3, 94, 46, 8, 12}
        // C. {–4, 29, 17, 3, 94, 46, 8, –4, 12}
        // D. {–4, 17, 3, 94, 46, 8, 29, 12}
        // E. {3, 17, 29, 94, –4, 8, 46, 12}

        /* D */

        // 25. Trace the execution of the selection sort algorithm as shown in this
        // section when run on the following input arrays.
        // Show each element that will be selected by the algorithm and where it will be
        // moved, until the array is fully sorted.

        // A. {29, 17, 3, 94, 46, 8, –4, 12}
        /*
         * - Select and move `-4` to index 0: `-4, 17, 3, 94, 46, 8, 29, 12`
         * - Select and move `3` to index 1: `-4, 3, 17, 94, 46, 8, 29, 12`
         * - Select and move `8` to index 2: `-4, 3, 8, 94, 46, 17, 29, 12`
         * - Select and move `12` to index 3: `-4, 3, 8, 12, 46, 17, 29, 94`
         * - Select and move `17` to index 4: `-4, 3, 8, 12, 17, 46, 29, 94`
         * - Select and move `29` to index 5: `-4, 3, 8, 12, 17, 29, 46, 94`
         * - Select and move `46` to index 6: `-4, 3, 8, 12, 17, 29, 46, 94`
         */
        // B. {33, 14, 3, 95, 47, 9, –42, 13}
        // C. {7, 1, 6, 12, –3, 8, 4, 21, 2, 30, –1, 9}
        // D. {6, 7, 4, 8, 11, 1, 10, 3, 5, 9}

        /*  */
    }
}
