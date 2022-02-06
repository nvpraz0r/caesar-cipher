import java.util.Scanner;

public class Console {

    // Class Scanner object
    private static final Scanner sc = new Scanner(System.in);

    // This method XYZ
    public static String getString(String prompt) {
        // Method variables
        String s = "";
        boolean isValid = false;

        // Input validation loop
        while (!isValid) {
            // Display input prompt
            System.out.println(prompt);

            // Validate input
            if (sc.hasNext("[A-Za-z]*")) {

                // Set string variable to input
                s = sc.next();
                // Set isValid to true to exit loop
                isValid = true;

            } else {
                System.out.println("Error! Invalid string value. Try again.");
            }
            sc.nextLine(); // Discard leftover data
        }
        return s;
    }

    // This method XYZ
    public static int getInt(String prompt) {
        // Method variables
        int i = 0;
        boolean isValid = false;

        // Input validation loop
        while (!isValid) {

            // Display input prompt
            System.out.print(prompt);

            // Validate input
            if (sc.hasNextInt()) {

                // Set integer variable to input
                i = sc.nextInt();
                // Set isValid to true to exit loop
                isValid = true;

            } else {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // Discard leftover data
        }
        return i;
    }
}
