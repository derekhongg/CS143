// This program creates a list of students and allows the user to 
// lookup information about a student given the ID number.
// This is meant to loosely simulate what happens at the Student
// Services desk (Kodiak Corner here at Cascadia College).
//
// In real life when a student scans their Student ID card
// the computer reads their Student ID Number from the bar code
// The computer then looks up the information about the student
// and allows the employee to look and and modify the information.
//

import java.util.*;

public class Student_Services_Desk {

    private static int nextSID = 22; // must be greater than any of the Students' IDs that we pre-load

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Map<Integer, Student> studentInfo = new TreeMap<Integer, Student>();
        studentInfo.put(21, new Student(21, "Zog", "TheDestroyer",
                new ArrayList<String>(List.of("BIT 143", "MATH 411", "ENG 120"))));
        studentInfo.put(20,
                new Student(20, "Mary", "Sue", new ArrayList<String>(List.of("BIT 142", "MATH 142", "ENG 100"))));
        studentInfo.put(1,
                new Student(1, "Joe", "Bloggs", new ArrayList<String>(List.of("BIT 115", "MATH 141", "ENG 101"))));

        char choice = 'L'; // anything but 'q' is fine
        while (choice != 'q') {
            System.out.println("\nWhat would you like to do next? ");
            System.out.println("F - Find a specific student");
            System.out.println("L - List all the students (for debugging purposes)");
            System.out.println("A - Add a new student");
            System.out.println("D - Delete an existing student");
            System.out.println("M - Modify an existing student");
            System.out.println("Q - Quit (exit) the program");
            System.out.print("What is your choice?\n(type in the letter & then the enter/return key) ");
            choice = keyboard.nextLine().trim().toLowerCase().charAt(0);
            System.out.println();

            switch (choice) {
                case 'f':
                    System.out.println("Find a student (based on their ID number):\n");
                    // IMPORTANT NOTE: If you call keyboard.nextInt() (or .next(), or anything
                    // except nextLine() )
                    // then you should call keyboard.nextLine() to remove the newline (enter/return
                    // key) that nextInt()
                    // left on the input stream
                    // More info:
                    // https://hyunjileetech.github.io/java/2019/02/27/scan-nextLine()-after-scan-nextInt().html
                    // https://stackoverflow.com/a/11465208/250610
                    //
                    System.out.print("What is the ID number of the student to find? ");
                    System.out.printf("%s, %s (SID=%d)\nClasses:\n", "PLACEHOLDER", "PLACEHOLDER", 0);
                    System.out.println("\t" + "PLACEHOLDER");
                    System.out.println("Didn't find a student with ID # " + "PLACEHOLDER");
                    break;

                case 'l':
                    System.out.println("The following students are registered:");
                    break;
                case 'a':
                    System.out.println("Adding a new student\n");
                    System.out.println("Please provide the following information:");
                    System.out.print("Student's first name? ");
                    System.out.print("Student's last name? ");

                    System.out
                            .println("Type the name of class, or leave empty to stop.  Press enter/return regardless");
                    break;
                case 'd':
                    System.out.println("Deleting an existing student\n");
                    System.out.print("What is the ID number of the student to delete? ");
                    System.out.println("Student account found and removed from the system!");
                    System.out.println("Didn't find a student with ID # " + "PLACEHOLDER");
                    break;
                case 'm':
                    System.out.println("Modifying an existing student\n");
                    System.out.print("What is the ID number of the student to modify? ");
                    System.out.println(
                            "Student account found!\nFor each of the following type in the new info or leave empty to keep the existing info.  Press enter/return in both cases.");
                    System.out.print("Student's first name: " + "PLACEHOLDER" + " New first name? ");
                    System.out.print("Student's last name: " + "PLACEHOLDER" + " New last name? ");
                    System.out.println("Updating class list");
                    System.out.println("Here are the current classes: " + "PLACEHOLDER");
                    System.out.println("This program will go through all the current classes.");
                    System.out.println(
                            "For each class it will print the name of the class and then ask you if you'd like to delete or keep it.");

                    System.out.println(
                            "PLACEHOLDER" + "\nType d<enter/return> to remove, or just <enter/return> to keep ");
                    System.out.println("Removing " + "PLACEHOLDER" + "\n");
                    System.out.println("Keeping " + "PLACEHOLDER" + "\n");
                    System.out.println(
                            "Type the name of the class you'd like to add, or leave empty to stop.  Press enter/return regardless");

                    System.out.println("Here's the student's new, updated info: " + "PLACEHOLDER");
                    break;
                case 'q':
                    System.out.println("Thanks for using the program - goodbye!\n");
                    break;
                default:
                    System.out.println("Sorry, but I didn't recognize the option " + choice);
                    break;
            }

        }
    }
}
