import java.util.*;

public class Sumfunction {

    public static int calculateSum(int num1, int num2) //paramters or formal parameters
    {
        int sum = num1 + num2;
        //System.out.println("Sum is : " +sum);
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number : ");
        int num2 = sc.nextInt();
        int sum = calculateSum(num1, num2); //arguments or actual parameters
        System.out.println("Sum is : " +sum);




        
    }
}