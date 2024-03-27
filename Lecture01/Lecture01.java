//Derek Hong
//CS 143

import java.util.Scanner;

class Lecture01 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 01");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // Put your answer for #1 here:
        // Hello from lecture 01

        // Copy and paste the output from when you first cloned (downloaded) and ran
        // this program
        // (in other words, when you run this program, what does it print?
        // Copy that output into this file, right here, in a comment

        // Where in the textbook are the main topics for this question covered?

        // Put your answer for #2 here:
        // Where in the textbook are the main topics for this question covered?
        /*
            for(int i = 1; i <= 100; i++) {
                System.out.println(i);
            }

            I chose a for loop because it's fairly simple and paints everything out
        */
        // Put your answer for #3 here:
        // Where in the textbook are the main topics for this question covered?

        /*
            for(int i = 1; i <= 5; i++){
                for(int j = i; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        */
        // Put your answer for #4 here:
        // Where in the textbook are the main topics for this question covered?
        /*
            for(int i = 0; i <= n; i++) {
                for(int j = i; j < n; j++) {
                    System.out.print(n);
                }
                System.out.println();
            }
        */
        // Put your answer for #5 here:
        // Where in the textbook are the main topics for this question covered?

        /*
            See below
        */

        // Put your answer for #6 here:
        // Where in the textbook are the main topics for this question covered?
        // NOTE: The definition of the Food class should go OUTSIDE the Lecture01
        // class. A good place to put this is at the end of the file.
        // NOTE 2: Make sure that you create a couple of Food objects here in main()

    }
    public class AverageGrades {
        public static void main (String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("How many grades would you like to store? ");
            int numGrades = input.nextInt();

            double[] grades = new double[numGrades];
            for(int i = 0; i < numGrades; i++) {
                System.out.print("Next grade? ");
                grades[i] = input.nextDouble();
            }

            double sum = 0;
            for(int i = 0; i < grades.length; i++) {
                sum += grades[i];
            }

            double avg = sum / numGrades;
            System.out.println("The average of your grades is: " + avg);
            input.close();
        }
    }
}

// Placing the Food class below this line is a good place for it