import java.util.Scanner;

/*******************************************************
 * Speed of Sound Calculator                            *
 * This program calculates the time it takes for sound *
 * to travel through air, water, or steel, based on    *
 * the distance input by the user.                     *
 *******************************************************/

public class SpeedOfSound {

    //***********************************************
    // Main Method                                   *
    // Prompts user to select medium and enter       *
    // distance, then calculates and displays the    *
    // time for sound to travel in the specified     *
    // medium.                                       *
    //***********************************************
    public static void main(String[] args) {
        // Create a scanner object for keyboard input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the distance (in feet): ");
        double distance = scanner.nextDouble();

        // Display the menu and prompt the user
        System.out.println("Select the medium (air, water, steel): ");
        String medium = scanner.nextLine().toLowerCase();

        double speed = 0;

        //***********************************************
        // Input Validation                              *
        // Ensures distance is non-negative              *
        //***********************************************
        if (distance < 0) {
            System.out.println("Distance must be a non-negative number.");
        } else {
            //***********************************************
            // Medium Selection                             *
            // Determines the speed based on the medium     *
            //***********************************************
            switch (medium) {
                case "air":
                    speed = 1100;
                    break;
                case "water":
                    speed = 4900;
                    break;
                case "steel":
                    speed = 16400;
                    break;
                default:
                    System.out.println("Invalid medium selected.");
                    System.exit(0);
            }

            //***********************************************
            // Calculation and Output                        *
            // Computes the time and displays the result    *
            //***********************************************
            double time = distance / speed;
            System.out.println("Time for sound to travel: " + time + " seconds");
        }

        // Close the scanner
        scanner.close();

        //***********************************************
        // Developer Credit                              *
        //***********************************************
        System.out.println();
        System.out.println("Developed by: Nikita Baiborodov");

        System.exit(0);
    }
}

