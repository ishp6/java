import java.util.*;

public class Prime {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();

        if(n==2)
        {
            System.out.println("Number is prime");
        }

        boolean isPrime = true;

        for(int i=2; i<=n-1; i++)
        {
            if(n % i == 0)
            {
                 isPrime = false;
            }


        }
        if(isPrime == true)
        {
            System.out.println("Number is prime :" + n );
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
}