// import java.util.*;

// public class Comp {

//     public static void main(String[] args) {

//         List<String> fruits = new ArrayList<>();
//         fruits.add("Apple");
//         fruits.add("Banana");
//         fruits.add("Cherry");
//         fruits.add("Date");

//         // Sorting the list in natural order
//         System.out.println("Natural order: " + fruits);

//         // Sorting the list using a custom comparator
//         Collections.sort(fruits, new FruitLengthComparator());
//         System.out.println("Sorted by length: " + fruits);

//     }
// }

// class FruitLengthComparator implements Comparator<String> {

//     @Override
//     public int compare(String fruit1, String fruit2) {
//         return fruit1.length() - fruit2.length();
//     }
// }
