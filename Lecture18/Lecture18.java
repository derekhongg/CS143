import java.util.*;

class Lecture18 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 18");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // Put your answer for #26 here:

        // Put your answer for #27 here:

        // EXERCISES:

        // Put your answer for #21 here:
        
        /* 
            See below
        */
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
}
