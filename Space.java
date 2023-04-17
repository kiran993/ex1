import java.util.Scanner;

public class Space {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            
            // Print the string with spaces between each character
            for (int i = 0; i < input.length(); i++) {
                System.out.print(input.charAt(i) + " ");
            }
        }
    }
}
