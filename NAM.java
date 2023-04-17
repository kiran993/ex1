import java.util.Scanner;

public class NAM {
   
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();
                
                // Declare a final variable
                final int MAX_VALUE = 100;
                
                // Declare a volatile variable
                int volatileVariable = 0;
                
                // Modify the volatile variable based on the input number
                volatileVariable += number;
                
                // Print the values of the variables
                System.out.println("MAX_VALUE: " + MAX_VALUE);
                System.out.println("volatileVariable: " + volatileVariable);
            }
        }
    }
    
