import java.util.*;

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        int income = sc.nextInt();
        int tax;

        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax =  (int) (income * 0.2);  // Cast the result after calculation
        } else {
            tax =  (int) (income * 0.3);  // Cast the result after calculation
        }

        System.out.println("Your tax is: " + tax);
        sc.close();  // Close the scanner to avoid resource leak
    }
}
