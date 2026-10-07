import java.util.*;

public class MethodAddition {

    static int add(int a, int b)
    {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2 : " + " ");
        int num2 = sc.nextInt();

        int result = add(num1, num2);

        System.out.println("Addition of two numbers : " + result);
        sc.close();
    }
    
}
