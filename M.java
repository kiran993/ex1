import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        // Create a mutable copy of the original string
        StringBuilder mutableString = new StringBuilder(originalString);

        // Perform some operations on the mutable string
        mutableString.reverse();
        mutableString.append(" (reversed)");

        // Print the results
        System.out.println("Original string: " + originalString);
        System.out.println("Mutable string: " + mutableString.toString());
    }
}
