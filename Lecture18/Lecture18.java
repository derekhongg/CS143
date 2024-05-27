import java.util.*;

class Lecture18 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 18");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // Put your answer for #26 here:
        
        /* 
            When converting the tree to store type E, add a type parameter to the class header, 
            ensuring it is Comparable. In methods like add or contains, 
            use compareTo to determine if an element is too small or large, as < and > do not work with objects.
        */
        
        // Put your answer for #27 here:
        /*
        To add a tree iterator, each node needs a reference to the "next" node for left-to-right traversal. 
        Alternatively, nodes could reference their parents, allowing the iterator to traverse back up the tree as needed.
        */
        // EXERCISES:

        // Put your answer for #21 here:
        
        /* 
            See below
        */
    }
}

public class IntTree {
    private IntTreeNode overallRoot;
}

public int matches(IntTree other) {
    return matches(overallRoot, other.overallRoot);
}

private int matches(IntTreeNode root1, IntTreeNode root2) {
    if (root1 == null || root2 == null) {
        return 0;
    } else {
        int sum = matches(root1.left, root2.left) + matches(root1.right, root2.right);
        if (root1.data == root2.data) {
            return 1 + sum;
        } else {
            return sum;
        }
    }
}
