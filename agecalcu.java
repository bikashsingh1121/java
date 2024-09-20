package classtest;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class agecalcu {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input year, month, and day of birth
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        
        System.out.print("Enter your birth month: ");
        int birthMonth = scanner.nextInt();
        
        System.out.print("Enter your birth day: ");
        int birthDay = scanner.nextInt();
        
        // Get current date
        LocalDate currentDate = LocalDate.now();
        
        // Get birth date from input
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        
        // Calculate age using Period class
        Period age = Period.between(birthDate, currentDate);
        
      
        System.out.println("You are " + age.getYears() + " years, " + 
                           age.getMonths() + " months, and " + 
                           age.getDays() + " days old.");
      
        scanner.close();
    }
}
