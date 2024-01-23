import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int userSelection;
        float units;
        char exitProgram = 'n';

        // While user input is in range
        while (exitProgram == 'n' || exitProgram == 'N') {
            // Ask what the user would like to convert
            System.out.println("What would you like to convert?\n \t"
                    + "1) km to Mi\n \t"
                    + "2) Mi to km\n \t"
                    + "3) ft to m\n \t"
                    + "4) in to cm\n \t"
                    + "5) in to mm\n \t");

            // Require user input
            if (scanner.hasNextInt()) {
                userSelection = scanner.nextInt();

                // If statement for option 1
                if (userSelection >= 1 && userSelection <= 5) {
                    System.out.println("Enter the value to convert:");

                    // Check if the next input is a valid float
                    if (scanner.hasNextFloat()) {
                        units = scanner.nextFloat();
                        switch (userSelection) {
                            case 1:
                                System.out.println(units / 1.6093445); // Unit conversion
                                break;
                            case 2:
                                System.out.println(units / 0.62137); // Unit conversion
                                break;
                            case 3:
                                System.out.println(units / 3.28084); // Unit conversion
                                break;
                            case 4:
                                System.out.println(units * 2.54); // Unit conversion
                                break;
                            case 5:
                                System.out.println(units * 25.4); // Unit conversion
                                break;
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a number."); // Error message for non-numeric input
                        scanner.next(); // Consume the invalid input to avoid an infinite loop
                    }
                } else {
                    System.out.println("Incorrect value entered."); // Incorrect value flag
                }
            } else {
                System.out.println("Invalid input. Please enter a number."); // Error message for non-numeric input
                scanner.next(); // Consume the invalid input to avoid an infinite loop
            }

            System.out.println("Would you like to close the program? Enter 'n' to continue, or anything else to exit");
            exitProgram = scanner.next().charAt(0);
        }
    }
}