import java.util.*; 

public class Evenodd 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        if(n % 2 == 0)
        {
            System.out.println("The number is EVEN");
        }
        else
        {
            System.out.println("The number is ODD");
        }
        
    }
    
}