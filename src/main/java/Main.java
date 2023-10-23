/* "Your name"
 * "Class and period"
 * "Date"
 */

package main.java;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // Creates a scanner to read inputs

        boolean run = true;
        while (run) {
            System.out.println("\nWelcome to my Application!");
            System.out.println("Please select an option:");
            System.out.println("1. Print 'Hello World'");
            System.out.println("2. Quit\n");

            String option = scanner.nextLine();     // Takes input from user
            switch(option) {        // Switch statement for options
                case "1":
                    printHelloWorld();
                    break;
                case "2":
                    System.out.println("Application is closing now. Bye!");
                    run = false;
                    break;
                default:
                    System.out.println("Option is invalid. Try again");
            }
        }

        scanner.close();        // Closes scanner to prevent memory leak
    }

    public static void printHelloWorld() {
        System.out.println("Hello World!");
    }
}