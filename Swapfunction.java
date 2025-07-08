import java.util.*;

public class Swapfunction {

public static void swap(int a, int b)
{
    int temp = a;
    a = b;
    b = temp;

    System.out.println("Value of a : " + a );
    System.out.println("Value of b : " + b);
}

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a : ");
    int a = sc.nextInt();
    System.out.println("Enter the value of b : ");
    int b = sc.nextInt();
    //int temp;
    swap(a,b);

}
}
