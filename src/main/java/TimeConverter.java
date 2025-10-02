import java.util.Objects;
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time, hours, minutes, seconds;
        boolean run = true;


        while(run)
        {
            System.out.println("\nConvert time to total seconds ");
            System.out.print("\nEnter hours: ");
            hours = sc.nextInt();
            System.out.print("Enter minutes: ");
            minutes = sc.nextInt();
            System.out.print("Enter seconds: " );
            seconds = sc.nextInt();

            System.out.println("\nTime Conversion:" );
            System.out.println("Input: " + hours +" hour, "+ minutes +" minute, " + seconds + " second"  );
            time = minutes * 60 + hours * 3600 + seconds;
            System.out.println("Total seconds: " + time + " seconds");

            System.out.println("\nCalculation:" );
            System.out.println(hours +" hours x 3600 = " + hours * 3600 + " seconds");
            System.out.println(minutes +" minutes x 60 = " + minutes * 60 + " seconds");
            System.out.println(seconds +" seconds  = " + seconds + " seconds");
            System.out.println("Total: " + time + " seconds");

            System.out.print("\nDo you want to convert another time (y/n): ");
            sc.nextLine();
            String choice = sc.nextLine();
            if (Objects.equals(choice, "n"))
                {
                    run = false;
                    System.out.print("Goodbye!");
                }
            }
        }

        // Requirements:
        // - Prompt for hours, minutes, and seconds
        // - Display conversion results and calculation breakdown
        // - Ask user if they want to convert another time (y/n)
        // - Loop until user chooses to exit
    }
