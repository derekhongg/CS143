//Derek Hong
//CS143

class Lecture17 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 17");

        // Self-Check Problems:
        // Section 17.2: Tree Traversals

        // 9. Write a method called printMirror that could be added to the IntTree class
        // and that prints a backward inorder traversal of the tree.
        // That is, for a given node, it examines the right subtree, then the node
        // itself, then the left subtree.

        /* 
        public void printMirror(IntTree) {
            if(node != null) {
                printMirror(node.right);
                System.out.print(node.data + " ");
                printMirror(node.left);
            }
        }
        */



        // Section 17.3: Common Tree Operations

        // 10. Why do many recursive tree methods use a public/private pair?
        // What is the difference between the header of the public method and that of
        // the private method?
        
        /* 
        Many recursive tree methods use a public/private pair to provide a simple public interface for 
        users while managing the recursive logic internally, with the public method typically lacking parameters and the private
        method including parameters necessary for recursion
        */
        
        // 11. Write a method called size that could be added to the IntTree class and
        // that returns the total number of nodes in the tree.

        /* 
        private int size(IntTreeNode node) {
            if(node == null) {
                return 0;
            } else {
                return 1 + size(node.left) + size(node.right);
            }
        }
        */

        // 12. Write methods called min and max that could be added to the IntTree class
        // and that return the smallest and largest values in the tree, respectively.
        // For example, if a variable called tree stores the values shown in Self-Check
        // Problem 5, the call of tree.min() should return –2 and the call of tree.max()
        // should return 94. If the tree is empty, the methods should throw an
        // IllegalStateException.
        /* 
        public int min() {
            if(overallRoot == null) {
                throw new IllegalStateException("Tree is empty.");
            }
            return min(overallRoot);
        }
        private int min (IntTreeNode node) {
            if(node.left == null) {
                return node.data;
            } else {
                return min(node.left);
            }
        }
        public int max() {
            if (overallRoot == null) {
                throw new IllegalStateException("Tree is empty");
        }
            return max(overallRoot);
        }

        private int max(IntTreeNode node) {
            if (node.right == null) {
                return node.data;
            } else {
                return max(node.right);
            }
        }
        */

        // Section 17.4: Binary Search Trees

        // 14. What is the difference between a regular binary tree and a binary search
        // tree?
        /* 
        A regular binary tree has no specific order for the placement of nodes
        Binary search trees maintains a specific order where each node's left subtree contains only nodes with
        values less than the node's value, and the right subtree contains only nodes with values greater than the node's value
        */
        // 16.  What will be true about the results of an inorder traversal of a binary
        // search tree?
        
        /* 
        The results of an inorder traversal of a binary search tree will be a sequence of node values in ascending order
        */

        // For each of the next four problems, draw the binary search tree that would
        // result if the given elements were added to an empty binary search tree in the
        // given order. Then write the elements of the tree in the order that they would
        // be visited by each kind of traversal (preorder, inorder, and postorder).

        // 17. Leia, Boba, Darth, R2D2, Han, Luke, Chewy, Jabba
        /* 
            Preorder: Leia, Boba, Darth, Chewy, Han, R2D2, Luke, Jabba
            Inorder: Boba, Chewy, Darth, Han, Leia, Luke, Jabba, R2D2
            Postorder: Chewy, Han, Darth, Boba, Jabba, Luke, R2D2, Leia
        */
        // 18. Meg, Stewie, Peter, Joe, Lois, Brian, Quagmire, Cleveland
        
        /*  
            Preorder: Meg, Peter, Joe, Brian, Cleveland, Lois, Quagmire, Stewie
            Inorder: Brian, Cleveland, Joe, Lois, Peter, Quagmire, Meg, Stewie
            Postorder: Cleveland, Brian, Lois, Joe, Quagmire, Peter, Stewie, Meg
        */

        // 19. Kirk, Spock, Scotty, McCoy, Chekov, Uhuru, Sulu, Khaaaan!
        /* 
            Preorder: Kirk, Chekov, Spock, Scotty, McCoy, Khaaaan!, Uhuru, Sulu
            Inorder: Chekov, Kirk, Khaaaan!, McCoy, Scotty, Spock, Sulu, Uhuru
            Postorder: Khaaaan!, McCoy, Scotty, Sulu, Uhuru, Spock, Chekov, Kirk
        */
        // 20. Lisa, Bart, Marge, Homer, Maggie, Flanders, Smithers, Milhouse
        
        /*  
            Preorder: Lisa, Bart, Marge, Homer, Flanders, Smithers, Milhouse, Maggie
            Inorder: Bart, Lisa, Flanders, Homer, Marge, Maggie, Milhouse, Smithers
            Postorder: Bart, Flanders, Homer, Maggie, Milhouse, Smithers, Marge, Lisa
        */

        // 22. What is the x = change(x) pattern, and how is it used with binary trees?
            /* 
            The 'x = change(x)' pattern is used in recurisive binary tree operations to update node references
            Ensuring that any structural changes (like insertion or deletion) are properly reflected in the parent nodes.
            This pattern allows the tree to maintain its correct structure after modifications.
            */
        // 23. How many nodes at most would be examined in a call to contains on a
        // perfect binary search tree of height N?
            /* 
            In a perfect binary search tree of height N, at most N+1 nodes would be examined in a call to
            'containts'. This is because in the worst case, the search traverses from the root to a leaf node
            examining one node at each level
            */
        // 24. Consider the following implementation of the contains method.

        // How does it differ from the one we showed in Section 17.4? Is it better or
        // worse, and why?

        /* 
            This version of contains is less efficient than the chapter's version. It searches both left and right recursively, 
            ignoring the tree's sortedness, resulting in a linear O(N) runtime instead of the desired O(log N).
        */

        // private boolean contains(IntTreeNode root, int value) {
        //     if (root == null) {
        //         return false;
        //     } else if (value == root.data) {
        //         return true;
        //     } else {
        //         return contains(root.left, value) || contains(root.right, value);
        //     }
        // }

        // 25. Rewrite the min and max methods from Self-Check Problem 12 so that they
        // will work on a binary search tree.
        // The methods should take advantage of the fact that the tree is sorted and
        // should not examine nodes unless necessary.

        /* 
        public int min() {
            if (overallRoot == null) {
                throw new IllegalStateException("Tree is empty");
            }
            return min(overallRoot);
        }

    
        private int min(IntTreeNode node) {
            while (node.left != null) {
                node = node.left;
            }
            return node.data;
        }

        public int max() {
            if (overallRoot == null) {
                throw new IllegalStateException("Tree is empty");
            }
            return max(overallRoot);
        }

        private int max(IntTreeNode node) {
            while (node.right != null) {
                node = node.right;
            }
            return node.data;
        }
        */

        // Exercises:

        // None
    }
}
