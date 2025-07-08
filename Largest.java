import java.util.*;

public class Largest 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A : ");
        int A = sc.nextInt();
        System.out.println("Enter the value of B : ");
        int B = sc.nextInt();

        if (A > B)
        {
            System.out.println("A is largest of 2!");
        }
        else 
        {
            System.out.println("B is largest of 2!");
        }
    }
}