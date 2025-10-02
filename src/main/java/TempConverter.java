import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int choice;
                double fahrenheit, celsius;
                boolean run = true;
                while (run) {
                    System.out.println("\nChoose conversion direction: ");
                    System.out.println("1. Convert Fahrenheit to Celsius");
                    System.out.println("2. Convert Celsius to Fahrenheit");
                    System.out.println("3. Exit");

                    System.out.print("\nEnter your choice (1, 2, or 3): ");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter temperature in Fahrenheit: ");
                            fahrenheit = sc.nextDouble();
                            System.out.println("\nConversion Results:");
                            System.out.println("Fahrenheit: " + fahrenheit);
                            fahrenheit = (fahrenheit -32) * 5/9;
                            celsius = fahrenheit;
                            System.out.println("Celsius: " + celsius);
                            break;

                        case 2:
                            System.out.print("Enter temperature in Celsius: ");
                            celsius = sc.nextDouble();
                            System.out.println("\nConversion Results:");
                            System.out.println("Celsius " + celsius);
                            celsius = celsius * 9/5 + 32;
                            fahrenheit = celsius;
                            System.out.println("Fahrenheit: " + fahrenheit);
                            break;

                        case 3:
                            run = false;
                            break;

                        default:
                            System.out.println("Invalid choice. \nPlease enter 1, 2, or 3.");
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