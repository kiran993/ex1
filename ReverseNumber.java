public class ReverseNumber {
    public static void main(String[] ars) {
        int num = 12345; // the number to be reversed
        int reversedNum = 0;
        while(num != 0) {
            int digit = num % 10; // get the rightmost digit
            reversedNum = reversedNum * 10 + digit; // add the digit to the reversed number
            num /= 10; // remove the rightmost digit from the original number
        }
        System.out.println("Reversed Number: " + reversedNum); // corrected the error here
    }
}
