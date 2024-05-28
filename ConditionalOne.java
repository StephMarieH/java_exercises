/*
 * Write an if statement that based on a number between 1 and 7 prints out if today is a 
weekday or a weekend.
 */

import java.util.Scanner; // Importing input method.

public class ConditionalOne {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Creates Scanner object.
        System.out.println("1 = Monday");
        System.out.println("2 = Tuesday");
        System.out.println("3 = Wednesday");
        System.out.println("4 = Thursday");
        System.out.println("5 = Friday");
        System.out.println("6 = Saturday");
        System.out.println("7 = Sunday");
        System.out.println("Enter the number relating to which day of the week it is today: ");
        
        String userInput = myObj.next();
        System.out.println("You entered: " + userInput); // Output user input.
        
        if (userInput.equals("1")) {
            System.out.println("Today is a weekday");
        } else if (userInput.equals("2")) {
            System.out.println("Today is a weekday");
        } else if (userInput.equals("3")) {
            System.out.println("Today is a weekday");
        } else if (userInput.equals("4")) {
            System.out.println("Today is a weekday");
        } else if (userInput.equals("5")) {
            System.out.println("Today is a weekday");
        } else if (userInput.equals("6")) {
            System.out.println("Today is the weekend");
        } else if (userInput.equals("7")) {
            System.out.println("Today is the weekend");
        } else {
            System.out.println("ERROR: Please enter a number between 1 - 7");
        }
    }
}
