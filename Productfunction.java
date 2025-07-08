import java.util.*;

public class Productfunction {

    public static void product(int a, int b)
    {
        int prod = (a * b);
        //return prod;

        System.out.println("Product of a and b is : " + prod);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        product(a, b);
        //System.out.println("Product of a and b is : " + prod);

    }
}