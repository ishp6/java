import java.util.*;

public class Positive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();

        if(num>0)
        {
            System.out.println("The number is positive");
        }
        else if(num<0)
        {
            System.out.println("The number is negative");
        }
        else 
        {
            System.out.println("The number is zero");
        }
    }
}