import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine(); // read the input string from user
        String reversedString = "";

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString += inputString.charAt(i);
        }
        System.out.println("Reversed string: " + reversedString);
    }
}