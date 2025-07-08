import java.util.*;

public class Largestof3 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the value of Second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the value of third number : ");
        int num3 = sc.nextInt();

        if(num1>=num2 && num1>=num3)
        {
            System.out.println("Num1 is largest number : " +num1);
        }
        else if (num2>=num3)
        {
            System.out.println("Num2 is largest number : " +num2);
        }
        else
        {
            System.out.println("Num3 is largest number : " +num3);
        }
    }
}