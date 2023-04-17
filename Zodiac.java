// import java.util.Scanner;

// public class Zodiac{
//    public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);
//       System.out.print("Enter your birthdate in MM/DD/YYYY format: ");
//       String birthdate = input.nextLine();
      
//       // Extract month and day from birthdate string
//       int month = Integer.parseInt(birthdate.substring(0,2));
//       int day = Integer.parseInt(birthdate.substring(3,5));
      
//       // Determine Zodiac sign based on month and day
//       String zodiacSign = "";
//       if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
//          zodiacSign = "Aries";
//       } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
//          zodiacSign = "Taurus";
//       } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
//          zodiacSign = "Gemini";
//       } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
//          zodiacSign = "Cancer";
//       } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
//          zodiacSign = "Leo";
//       } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
//          zodiacSign = "Virgo";
//       } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
//          zodiacSign = "Libra";
//       } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
//          zodiacSign = "Scorpio";
//       } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
//          zodiacSign = "Sagittarius";
//       } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
//          zodiacSign = "Capricorn";
//       } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
//          zodiacSign = "Aquarius";
//       } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
//          zodiacSign = "Pisces";
//       }
      
//       // Display Zodiac sign to the user
//       System.out.println("Your Zodiac sign is " + zodiacSign);
//    }
// }
