import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double miles, kilometers;
        boolean run = true;
        while (run) {
            System.out.println("\nChoose conversion direction: ");
            System.out.println("1. Convert Miles to Kilometers");
            System.out.println("2. Convert Kilometers to Miles");
            System.out.println("3. Exit");

            System.out.print("\nEnter your choice (1, 2, or 3): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter distance in miles: ");
                    miles = sc.nextDouble();
                    System.out.println("\nConversion Results:");
                    System.out.println("Miles: " + miles);
                    miles *= 1.60935;
                    kilometers = miles;
                    System.out.println("km Kilometers: " + kilometers);
                    break;

                case 2:
                    System.out.print("Enter distance in kilometers: ");
                    kilometers = sc.nextDouble();
                    System.out.println("\nConversion Results:");
                    System.out.println("Kilometers " + kilometers);
                    kilometers /= 1.60935;
                    miles = kilometers;
                    System.out.println("Miles: " + miles);
                    break;

                case 3:
                    run = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } System.out.println("Goodbye!");
        // Requirements:
    // - Menu with options: 1. Convert Miles to Kilometers, 2. Convert Kilometers to Miles, 3. Exit
    // - Loop until user chooses to exit
    // - Use conversion factor: 1 mile = 1.60935 kilometers
    // - Display conversion results
    // - Handle invalid menu choices
}
}