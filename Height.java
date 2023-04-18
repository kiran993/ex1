import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        // double heightInCm = input.nextDouble(); value is stored as double int from the user
        double heightInCm = input.nextDouble();
        double heightInInches = heightInCm / 2.54;
        int feet = (int) (heightInInches / 12);
        int inches = (int) (heightInInches % 12);
        System.out.println("Your height is " + feet + " feet " + inches + " inches.");
    }
}
