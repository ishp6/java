import java.util.*;

public class BMICalculator {

    static double calculateBMI(double weight, double height)
    {
        return weight / (height * height);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight (kg) : ");
        double w = sc.nextDouble();
        System.out.println("Enter your height (m) : ");
        double h = sc.nextDouble();

        double bmi = calculateBMI(w,h);

        System.out.println("Your BMI is : " + bmi);

        sc.close();
    }
    
}
