import java.util.Scanner;

public class Im {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();
        
        // Create an immutable copy of the original string
        String immutableString = originalString.intern();
        
        // Perform some operations on the immutable string
        String upperCaseString = immutableString.toUpperCase();
        String reversedString = new StringBuilder(immutableString).reverse().toString();
        
        // Print the results
        System.out.println("Original string: " + originalString);
        System.out.println("Immutable string: " + immutableString);
        System.out.println("Uppercase string: " + upperCaseString);
        System.out.println("Reversed string: " + reversedString);
    }
}
