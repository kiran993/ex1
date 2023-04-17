import java.util.Calendar;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        // Get the current year from the system clock
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        // Calculate the age
        int age = currentYear - birthYear;

        // Output the result
        System.out.println("Your age is " + age);
    }
}
