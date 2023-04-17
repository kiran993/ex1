import java.util.Scanner;

public class Anonymous {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input using an anonymous class
        System.out.print("Enter some text: ");
        String input = scanner.useDelimiter("\n").next();
        
        // Display the input back to the user using an anonymous class
        System.out.println("You entered: ");
        Runnable displayInput = new Runnable() {
            @Override
            public void run() {
                System.out.println(input);
            }
        };
        displayInput.run();
        
        scanner.close();
    }
}
