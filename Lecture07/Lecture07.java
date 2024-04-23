class Lecture07 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 07");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // Put your answer for #8 here:
            /*
            - A call stack is a data structure used to keep track of functions, methods and procedures in a program.
            - It organizes inforation about the active routines of a program and is needed to manage the execution of fuction calls
            - It relates to recursion because recursion relies on the call stack to keep track of the different states of the recursive function calls
            - Each recursive call adds a layer to the stack, and each return peels a layer off
            */
        // Put your answer for #9 here:
            /*
            - The output would just return in the same order, no changes
            */
        // Put your answer for #10 here:
            /*
            - Infinite loop because it calls itself before reading the next line
            */
        // Put your answer for #11 here:
            /*
            - There is no base case
            - Can be an issue if y is 0
            */
        // Put your answer for #17 here:
            /*
            - Need to change it to < 10 in the base case
            - This will keep running forever in the case that it is less than 10
            */
        // EXERCISES:

        // Put your answer for #1 here:
            // See below
        // Put your answer for #2 here:
            // See below
        // Put your answer for #3 here:
            // See below
        // Put your answer for #10 here:
            // See below
        // Put your answer for #12 here:
            // See below

    }
    public static void starString (int n) {
        if(n < 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        } else if(n == 0) {
            System.out.print("*");
        } else {
            starString(n-1);
            starString(n-1);
        }
    }

    public static void writeNums(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Please enter a number 1 or greater");
        } else if(n == 1) {
            System.out.print("1");
        } else {
            writeNums(n - 1);
            System.out.print("," + n);
        }
    }

    public static void writeSequence(int n) {
        if(n < 1) {
            throw new IllegalArgumentException("Please enter a number greater than 1");
        } else if (n == 1) {
            System.out.print("1");
        } else if (n == 2) {
            System.out.print("1 1");
        } else {
            int firstNum = (n + 1) / 2;
            System.out.print(firstNum + " ");
            writeSequence(n - 2);
            System.out.print(" " + firstNum);
        }
    }
    public static int digitMatch (int n1, int n2) {
        if(n1 == 0 && n2 == 0) {
            return 1;
        }
        if (n1 == 0 || n2 == 0) {
            return 0;
        }
        int lastDigit1 = n1 % 10;
        int lastDigit2 = n2 % 10;

        if(lastDigit1 == lastDigit2) {
            return 1 + digitMatch(n1/10, n2/10);
        } else {
            return digitMatch(n1/10, n2/10);
        }
    }
    public static boolean isReverse(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() <= 1 && str2.length() <= 1) {
            return str1.equals(str2);
        }

        if(str1.length() != str2.length()) {
            return false;
        }

        if(str1.charAt(0) != str2.charAt(str2.length()-1)) {
            return false;
        }
        return isReverse(str1.substring(1), str2.substring(0, str2.length() - 1));
    }
}
