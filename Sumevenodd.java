import java.util.*;

public class Sumevenodd {

    public static void main(String[] args) {
        int Evensum = 0;
        int Oddsum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        for(int i = 0 ; i<=n ; i++)
        {
             if(n % 2 == 0)
             {
                Evensum = Evensum + i;
                //System.out.println("Sum of even numbers is : " + Evensum);
             }
             else
             {
                Oddsum = Oddsum + i;
                //System.out.println("Sum of odd numbers is : " + Oddsum);
             }
        }
        System.out.println("Sum of even numbers is : " + Evensum);
        
        System.out.println("Sum of odd numbers is : " + Oddsum);
        

    }
}