import java.util.*;

public class Product
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of p : ");
        int p = sc.nextInt();
        System.out.println("Enter the value of q : ");
        int q = sc.nextInt();
        int prod = (p * q);
        System.out.println("The product of :\n" + p +  " and "  + q + " = " +prod);
        //System.out.println(prod);
    }
}