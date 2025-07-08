import java.util.*;

public class Primeagain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if(n == 2)
        {
            System.out.println("Number is prime");
        }


        boolean isPrime2 = true;

        

        for(int i=2; i<=Math.sqrt(n); i++) //code optimatization which will reduce time complexity for higher numbers
        {
            if(n % i == 0)
            {
                 isPrime2 = false;
            }
        }
        if( isPrime2 == true)
        {
            System.out.println("Number is prime : " + n);
        }
        else
        {
            System.out.println("Number is not prime ");
        }
    }
}