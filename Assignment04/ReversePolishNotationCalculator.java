// Derek Hong
// CS143
// This program reads a Reverse Polish Notation mathematical Expression
// and evaluates it.  The program will show each step if the user chooses that
// otherwise the program will only print out the end result
//

import java.util.*;

public class ReversePolishNotationCalculator {

    // This gets the remainder of the input out of the Scanner
    // prints that remaining input (and also prints out the current contents of the
    // stack)
    // and then re-loads the remaining input into a new Scanner
    // This means that we can keep Scanning the remainder of the input
    private static Scanner printRemainingExpression(Stack<Double> numbers, Scanner scExpression) {

        String remainderOfExpr = scExpression.nextLine();
        System.out.println("Remaining expression: " + remainderOfExpr + " Stack: " + numbers);
        scExpression.close(); // may as well close out the old one before creating a new replacement
        return new Scanner(remainderOfExpr + "\n");
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        char evalAgain = 'y';
        ShouldWeTryAgain: while (evalAgain == 'y') {
            double nextNumber = 0;
            System.out.println("\nRPN calculator");
            System.out.println("\tSupported operators: + - * /");
            System.out.print("Type your RPN expression in so that it can be evaluated: ");
            String rpnExpr = keyboard.nextLine();
            boolean explain = false;
            System.out.print(
                    "Would you like me to explain how to expression is evaluated? (y or Y for yes, anything else means no) ");
            String szExplain = keyboard.nextLine().trim().toLowerCase();
            if (szExplain.length() == 1 && szExplain.charAt(0) == 'y') {
                System.out.println("We WILL explain the evaluation, step by step");
                explain = true;
            }

            Stack<Double> numbers = new Stack<Double>();
            String operator = ""; // string for operator
            double op1, op2; // operands

            Scanner scExpr = new Scanner(rpnExpr + "\n");
            while (scExpr.hasNext()) {
                if (explain) {
                    scExpr = printRemainingExpression(numbers, scExpr);
                }

                if (scExpr.hasNextDouble()) {
                    nextNumber = scExpr.nextDouble();
                    if (explain) {
                        System.out.println("\tPushing " + nextNumber + " onto the stack of operands (numbers)");
                    }
                    numbers.push(nextNumber);
                } else {
                    operator = scExpr.next();
                    if (operator.length() > 1) {
                        System.err.println(
                                "ERROR! Operator (non-numeric input) contains more than 1 character: " + operator);
                        System.out.println(
                                "Since we can't evaluate that expression we'll ask you for another one to evaluate instead");
                        continue ShouldWeTryAgain;
                    }
                    try {
                        op2 = numbers.pop();
                        op1 = numbers.pop();

                    } catch (EmptyStackException ese) {
                        System.err.println(
                                "ERROR! Expected to find 2 operands (numbers) but we don't have two numbers on the stack!");
                        System.out.println(
                                "Since we can't evaluate that expression we'll ask you for another one to evaluate instead");
                        continue ShouldWeTryAgain;
                    }
                    switch (operator.charAt(0)) {
                        case '+':
                            numbers.push(op1 + op2);
                            break;

                        case '-':
                            numbers.push(op1 - op2);
                            break;

                        case '*':
                            numbers.push(op1 * op2);
                            break;

                        case '/':
                            numbers.push(op1 / op2);
                            break;

                        default:
                            System.err.println("ERROR! Operator not recognized: " + operator);
                            System.out.println(
                                    "Since we can't evaluate that expression we'll ask you for another one to evaluate instead");
                            continue ShouldWeTryAgain; // This line will jump back to the outer loop
                    }

                    if (explain)
                        System.out.println("\tPopping " + op1 + " and " + op2 + " then applying "
                                + operator + " to them, then pushing the result back onto the stack");
                }
            }
            if (numbers.size() > 1) {
                System.err.println("ERROR! Ran out of operators before we used up all the operands (numbers):");
                System.err.println("\t" + numbers);
            } else if (numbers.isEmpty()) {
                System.err.println("ERROR! Ran out of operands (numbers)");
            } else {
                System.out.println("END RESULT is: " + numbers.pop());
            }
            
            System.out.print("\nWould you like to evaluate another expression? (y or Y for yes, anything else to exit) ");
            String repeat = keyboard.nextLine().trim().toLowerCase();

            if (repeat.length() == 1 && repeat.charAt(0) == 'y') {
                evalAgain = 'y';
            } else {
                evalAgain = 'n';
            }
        }
        System.out.println("Thank you.Program ends");
    }

}