import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Agecal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your birthdate (dd/mm/yyyy): ");
    String dateString = input.nextLine();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate birthdate = LocalDate.parse(dateString, formatter);
    LocalDate today = LocalDate.now();
    Period period = Period.between(birthdate, today);
    System.out.println("Your age is " + period.getYears() + " years, " + period.getMonths() + " months, and " + period.getDays() + " days old.");
  }
}
