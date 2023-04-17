import java.util.*;
import java.util.stream.*;

public class Stre {

    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Example of filter() method to get even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // Example of map() method to convert integers to their squares
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        // Example of forEach() method to print each element of the stream
        numbers.stream()
                .forEach(System.out::println);

        // Example of reduce() method to get the sum of all numbers
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);

        // Example of sorted() method to get numbers in ascending order
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted numbers: " + sortedNumbers);

        // Example of distinct() method to get distinct numbers
        List<Integer> distinctNumbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5, 5);
        List<Integer> uniqueNumbers = distinctNumbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique numbers: " + uniqueNumbers);
    }
}
