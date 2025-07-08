import java.util.*;
public class Sum
{
    public static void main(String[] args) {
        
    //This code is to calculate sum of two numbers taking input from user
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the value of first number:");
     int num1 = sc.nextInt();
     System.out.println("Enter the value of second number:");
     int num2 = sc.nextInt();
     int sum = num1 + num2;
     System.out.println("The sum of " +num1+ " and " +num2 + "is :" +sum);
     System.out.println(sum);

    }

}