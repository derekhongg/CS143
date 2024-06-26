
class Lecture15 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 15");

        // NOTE NOTE NOTE
        // Several problems ask you to draw pictures / images. Here are some ideas for
        // how to do that:
        //
        // Some ideas for how to draw the images:
        // * Draw this out on paper, snap a picture with your phone
        //
        // * Capture a screenshot and then draw on it using MS Paint or MacOS Image
        // Preview, etc
        // (You'll need to Google for how to take the screenshot - it's not hard once
        // you know how, it's just well-hidden)
        //
        // * Use diagram-making software. You can find free online websites that let you
        // do this on the website
        //
        // * If you find other ways please do share! Especially if they're quick and
        // easy! :)

        //
        //
        // Some ideas for how to add the images to this repo:
        //
        // * Add the image files directly to the repo (in which case please name the
        // files
        // Question 5.png, or Answer 6.gif, or 7.jpeg, or whatever)
        //
        // * Embedding them in a Word /.DOC/.DOCX file
        //
        // * Embed them into a .PDF file (this is good for MacOS people - you can create
        // a .pages file, then export to .PDF)
        // (I can't open .pages files reliably on Windows)

        //
        // DO NOT DO THE FOLLOWING:
        //
        // * Do NOT upload to Google Drive / Dropbox / etc and then hand in a link.
        // I want to have copies of the work that you've done even after the quarter
        // ends

        //
        //
        //
        // Self-Check Problems:
        // Section 16.1: Working with Nodes

        // 1. What is the difference between a linked list and an array list? How are
        // they similar?
        
        /*
        A linked list stores elements in nodes linked by pointers, allowing dynamic resizing and efficient insertions/deletions,
        while an array list uses a contiguous block of memory, providing fast random access but slower resizing; both are linear data structures storing a sequence of elements.
        */


        // 2. What is the difference between a linked node and a linked list? How are
        // they related and connected?
        
        /*
        A linked node is an individual element containing data and a reference (link) to the next node,
        whereas a linked list is a collection of linked nodes forming a sequential chain; nodes are the building blocks of a linked list.
        */

        // 3. What value is stored as the next field of the last node of a list? What
        // value will a node’s next field have if none is specified?
        
        /*
        The next field of the last node in a linked list stores a null value,
        indicating the end of the list; similarly, a node's next field will default to null if none is specified.
        */

        // 4. What happens if you or the client try to go past the last element in a
        // linked list? Be specific.

        /*
        Attempting to go past the last element in a linked list typically results in accessing a null reference,
        leading to a runtime error or exception, such as a NullPointerException in languages like Java.
        */

        // QUESTIONS 5- 17:
        // Please put these into a separate file(s), as described in this file above

        // Section 16.2: A Linked List Class
        // 18. What are the two ways to change the contents of a linked list?
        /*
        The contents of a linked list can be changed by either inserting or removing nodes at specified positions within the list.
        */
        // 19. An element can be inserted at or removed from the beginning, middle, or
        // end of a linked list.
        // Which of the three locations is the most computationally expensive, and why?
        // How does this compare against the result for an array list?
        
        /*
        Inserting or removing an element at the end of a linked list is the most computationally expensive if the list is singly linked and lacks a tail pointer,
        due to needing to traverse the entire list to reach the end; in contrast,
        these operations are more computationally expensive at the beginning of an array list because all subsequent elements need to be shifted.
        
        */
        // 20. When you add or remove the element found at index i of a list, you must
        // create a temporary current node reference and advance it through the list.
        // At which index’s node should the loop stop, relative to i?
        
        /*
        When adding or removing the element at index i, the loop should stop at the node just before index i (i.e., at index i-1) to properly link or unlink the nodes.
        */
        
        // 21. In an array list, it is possible to overrun the capacity of the array, at
        // which point the list must be resized to fit.
        // Is resizing necessary on a linked list? What limits the number of elements
        // that a linked list can have?
        /*
        Resizing is not necessary on a linked list as it does not have a predefined capacity; the number of elements it can contain is limited primarily by the system's available memory.
        */
        // QUESTIONS 21-24:
        // Please put these into a separate file(s), as described in this file above

        // Exercises:
        // None

    }
}
