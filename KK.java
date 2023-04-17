import java.util.Scanner;

public class KK {
    public static void main(String[] args) {
        // create scanner object to get user input
        Scanner input = new Scanner(System.in);

        // get first string
        System.out.print("Enter the first string: ");
        String first = input.nextLine();

        // get second string
        System.out.print("Enter the second string: ");
        String second = input.nextLine();

        // append the two strings
        String result = first + second;

        // print the result
        System.out.println("The result of appending the two strings is: " + result);
    }
}
