// Derek Hong
// CS143

class Lecture11 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 11");

        // Self-Check Problems:
        // Section 13.4: Case Study: Implementing Merge Sort

        // 30. Trace the complete execution of the merge sort algorithm when called on
        // each array below.
        // Show the sub-arrays that are created by the algorithm and show the merging of
        // sub-arrays into larger sorted arrays.

        // A. {29, 17, 3, 94, 46, 8, –4, 12}
        // B. {6, 5, 3, 7, 1, 8, 4, 2}
        // C. {33, 14, 3, 95, 47, 9, –42, 13}
        
        /* 
        A. {29, 17, 3, 94, 46, 8, -4, 12}

        1. {29, 17, 3, 94} {46, 8, -4, 12}
        2. {29, 17}
        3. {17. 29}
        4. {3, 94}
        5. {3, 17, 29, 94}
        6. {46, 8}
        7. {8, 46}
        8. {-4, 12}
        9. {-4, 3, 8, 12, 17, 29, 46, 94}
        */

        /*
        B. {6, 5, 3, 7, 1, 8, 4, 2}
        
        1. {6, 5, 3, 7} {1, 8, 4, 2}
        2. {6, 5} {3, 7} {1, 8} {4, 2}
        3. {6} {5} {3} {7} {1} {8} {4} {2}
        4. {5, 6} {3, 7}
        5. {3, 5, 6, 7}
        6. {1, 8}, {2, 4}
        7. {1, 2, 4, 8}
        8. {1, 2, 3, 4, 5, 6, 7, 8}
        */
        
        /* 
        C. {33, 14, 3, 95, 47, 9, –42, 13}

        1. {33, 14, 3, 95} {47, 9, -42, 13}
        2. {33, 14} {3, 95} {47, 9} {-42, 13}
        3. {33} {14} {3} {95} {47} {9} {-42} {13}
        4. {14, 33} {3, 95} -> {3, 14, 33, 95}
        5. {9, 47}, {-42, 13} -> {-42, 9, 13, 47}
        6. {-42, 3, 9, 13, 14, 33, 47, 95}
        */
        
        // Exercises:

        // 11. Using the following arrays, trace the complete execution of the merge
        // sort algorithm when called on each array.
        // Show the subarrays that are created by the algorithm and show the merging of
        // subarrays into larger sorted arrays.

        // A. int[] numbers3 = {8, 5, –9, 14, 0, –1, –7, 3};
        // B. int[] numbers4 = {15, 56, 24, 5, 39, –4, 27, 10};
        
        /* 
        A. {8, 5, –9, 14, 0, –1, –7, 3};

        1. {8, 5, -9, 14} {0, -1, -7, 3}
        2. {8, 5} {-9, 14}, {0, -1} {-7, 3}
        3. {8} {5} {-9} {14} {0} {-1} {-7} {3}
        4. {5, 8} {-9, 14} {-1, 0} {-7, 3}
        5. {-9, 5, 8, 14} {-7, -1, 0, 3}
        6. {-9, -7, -1, 0, 3, 5, 8, 14}
        */

        /* 
        B. {15, 56, 24, 5, 39, –4, 27, 10};

        1. {15, 56, 24, 5} {39, -4, 27, 10}
        2. {15, 56} {24, 5} {39, -4} {27, 10}
        3. {15} {56} {24} {5} {39} {-4} {27} {10}
        4. {15, 56}, {5, 24}, {-4, 39}, {10, 27}
        5. {5, 15, 24, 56}, {-4, 10, 27, 39}
        6. {-4, 5, 10, 15, 24, 27, 39, 56}
        */

        // 13. Using the following arrays, trace the complete execution of the merge
        // sort algorithm when called on each array.
        // Show the subarrays that are created by the algorithm and show the merging of
        // subarrays into larger sorted arrays.

        // A. int[] numbers5 = {22, 44, 11, 88, 66, 33, 55, 77};
        // B. int[] numbers6 = {–3, -6, -1, -5, 0, -2, -4, -7};

        /*
        A. {22, 44, 11, 88, 66, 33, 55, 77};

        1. {22, 44, 11, 88} {66, 33, 55, 77}
        2. {22, 44} {11, 88} {66, 33} {55, 77}
        3. {22} {44} {11} {88} {66} {33} {55} {77}
        4. {22, 44} {11, 88} {33, 66} {55, 77}
        5. {11, 22, 44, 88} {33, 55, 66, 77}
        6. {11, 22, 33, 44, 55, 66, 77, 88}
        */

        /* 
        B. {–3, -6, -1, -5, 0, -2, -4, -7};

        1. {-3, -6, -1, -5} {0, -2, -4, -7}
        2. {-3, -6} {-1, -5} {0, -2} {-4, -7}
        3. {-3} {-6} {-1} {-5} {0} {-2} {-4} {-7}
        4. {-6, -3} {-5, -1} {-2, 0} {-7, -4}
        5. {-6, -5, -3, -1} {-7, -4, -2, 0}
        6. {-7, -6, -5-, -4, -3, -2, -1, 0}
        */
    }
}
