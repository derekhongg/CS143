class Lecture13 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 13");

        // Self-Check Problems:
        // Section 15.1: Simple ArrayIntList

        // 1. What is the difference between an array list’s size and its capacity?
        // What is the relationship between the two values? (Is one always larger or
        // smaller than the other, for instance?)
        
        /* 
        The size of an ArrayList refers to the number of elements it currently holds, while the capacity
        represents the total number of elements it can hold before needing to resize its internal array.
        The capacity may be larger than the size to accommodate future additions effciently.
        */
        
        // 2. What fields must be included in the ArrayIntList class, and why is each
        // field important? Would the class still work correctly if we removed any of
        // these fields?

        /* 
        The class must include fields for storing the elements (ex. array) and tracking the current size of the list.
        These fields are essential for storing the data and managing the list's state.
        Removing either field would likely result in incorrect functionality. Without the array, there would be nowhere to store the elements,
        and without tracking the size, the class wouldn't know how many elements are currently in the list.
        */
        
        // 3. Why does the list class use a toString method rather than a print method?
        /*  
        The list class uses a toString method rather than a print method to provide a string representation of its elements,
        allowing for flexiblity in how the list's contents are displayed or manipulated.
        */

        // 4. We wrote the class to have public methods called size (to read the number
        // of elements of the list) and get (to access the element value at a specific
        // index).
        // Why is this approach better than declaring the fields (such as size) public?
        
        /* 
        Encapsulating fields and providing public methods like size and get ensures better control over access to the class's internal state, 
        promoting information hiding and reducing the risk of unintended manipulation or dependencies on the internal implementation details.
        */
        
        // 7. An element can be inserted at the beginning, middle, or end of an array
        // list.
        // Which of the three insertion points is the most computationally expensive,
        // and why? Which is the most expensive location to remove an element from the
        // list?

        /* 
        Inserting an element at the beginning of an array list is the most computationally expensive because
        the need to shift all existing elements to make room, resulting O(n) time complextity.
        Similarly, removing an element from the beginning of the list is also the most expensive operation with O(n) time complexity
        */

        // 8. Write methods called min and max that return the smallest and largest
        // values in the list respectively.
        // For example, if a variable called list stores [11, –7, 3, 42, 0, 14], the
        // call of list.min() should return –7 and the call of list.max() should return
        // 42. If the list is empty, the methods should throw an IllegalStateException.
        
        /* 
        See Below
        */
        // Section 15.2: A More Complete ArrayIntList

        // 9. Describe the overall preconditions placed on the list class in this
        // section.
        // What assumptions do we make about how clients will use the list?
        
        /* 
        The overall preconditions placed on the list class assume that clients will use it appropriately by not
        attempting to access elements beyond the list's bounds and by ensureing the list is not empty before calling certain methods.
        */
        
        // 10. What is the purpose of the checkIndex method?
        // Where is it called in the list class? Describe a way that the client can
        // utilize an ArrayIntList that will be caught by checkIndex.
        
        /*
        The 'checkIndex' method ensures that clients do not attempt to access elements at invalid indices
        within the list, catching attempts to access elements at negative indices or indices beyond the list's current size.
        */
        
        // 11. What is the purpose of the checkCapacity method?
        // Where is it called in the list class? Describe a way that the client can
        // utilize an ArrayIntList that will be caught by checkCapacity.

        /* 
        The checkCapacity method ensures that the internal array has enough capacity to accommodate additional elements before adding new elements to the list, 
        preventing potential array index out of bounds exceptions.
        */

        // 12. Once we check thoroughly for preconditions in the code, what data
        // invariants can we now assume about the list?

        /* 
        Once we check thoroughly for preconditions in the code, 
        we can now assume that the list maintains the invariant of ensuring that all index-based operations are 
        within the valid range of indices and that the list's capacity is sufficient for its current size and potential future additions.
        */

        // 13. Why do we bother to add the contains, isEmpty, and remove methods to the
        // list class, when the client can already perform this same functionality with
        // the indexOf, size, and remove methods, respectively?
        /* 
        We add the contains and isEmpty methods to the list class to provide more intuitive and expressive APIs for clients, 
        despite similar functionality being achievable through the indexOf and size methods, respectively.
        */
        
        // Exercises:
        // None
    }

    public int min () {
        if(size == 0) {
            throw new IllegalStateException("The list is empty.");
        }

        int min = elements [0];
        for(int i = 1; i < size; i++) {
            if(elements[i] < min) {
                min = elements[i];
            }
        }
        return min;
    }
    public int max() {
        if(size == 0) {
            throw new IllegalStateException("The list is empty.");
        }
        int max = elements[0];
        for(int = 1; i < size; i++) {
            if(elements[i] > max) {
                max = elements[i];
            }
        }
        return max;
    }
}
