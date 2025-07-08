import java.util.*;

public class Break
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do 
        {
            System.out.println("Enter your number : ");
            int n = sc.nextInt();
            //System.out.println(n);
            if( n % 10 == 0)
            {
                break;
            }
            System.out.println(n);
        }while(true);

    }
}