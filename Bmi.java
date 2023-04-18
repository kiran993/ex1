import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double weightInKg = input.nextDouble();
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = input.nextDouble();
        double heightInM = heightInCm / 100.0;
        double bmi = weightInKg / (heightInM * heightInM);
        System.out.println("Your BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("You are lean.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You are normal.");
        } else {
            System.out.println("You are obese.");
        }
    }
}
