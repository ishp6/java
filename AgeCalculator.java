import java.util.*;
import java.time.LocalDate;

public class AgeCalculator {

    static int calculateAge(int birthYear, int currentYear)
    {
        return currentYear - birthYear;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int currentYear = LocalDate.now().getYear();

        System.out.print("Enter your birth year : ");
        int birthYear = sc.nextInt();

        int age = calculateAge(birthYear, currentYear);
        System.out.println("Your age is : " + age + " years.");

        sc.close();
    }
    
}
