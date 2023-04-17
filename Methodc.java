import java.util.Scanner;

public class Methodc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String output = new StringBuilder(input)
                .append(" is awesome!")
                .reverse()
                .toString();

        System.out.println(output);
        scanner.close();
    }
}
