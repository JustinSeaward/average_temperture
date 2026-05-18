import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class AverageTemperature {
    public static void main() {
        // Scanner for user inputs
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Average Temperature ===");
        System.out.println("\n Enter number of days: ");

        // user number of days input
        int days = scanner.nextInt();

        // int array with user input as length of array
        int[] temp = new int[days];

        // Test print
        // System.out.println("\n Number of days are: " + temp.length);

        System.out.println("Enter the temperature of each day ");

        // for loop to enter temperature for the number of days entered
        for(int i = 0; i < temp.length; i++){
            System.out.println("\nTemperature of day " + (i+1) + ": ");
            int tempOfDay = scanner.nextInt();
            temp[i] = tempOfDay;
        }

        // Test print
        // System.out.println(Arrays.toString(temp));

        OptionalDouble averageTemp = Arrays.stream(temp).average();
        System.out.println("\nThe average temperature is: " + averageTemp.getAsDouble() + " degrees.\n");

        double average = averageTemp.getAsDouble();
        int count = 0;

        // for loop to check if average temp is lower than a day then print which day had a higher temp
        for(int i = 0; i < temp.length; i++ ){
            if(average < temp[i] ){
                System.out.println("Day " + (i + 1) + " temperature was higher than the average.");
                count++;
            }
        }
        // Displays numbers of day that were higher than average temp
        System.out.println("\n" +count + " day(s) had a higher than average temperature.");
    }
}
