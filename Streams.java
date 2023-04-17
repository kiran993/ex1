import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        // Define a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter out the even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // Square each number and sum them up
        int sumOfSquares = numbers.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println("Sum of squares: " + sumOfSquares);

        // Find the maximum number
        int maxNumber = numbers.stream()
                .max(Integer::compare)
                .orElse(0);
        System.out.println("Maximum number: " + maxNumber);
    }
}
