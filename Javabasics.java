import java.util.*;

public class Javabasics 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if (age >= 18)
        {
            System.out.println("This candidate is an adult");
        }
        else  if (age > 13 && age <=17)
        {
            System.out.println("The candidate is teenager");
        }
        else 
        {
            System.out.println("The candidate is not an adult");
        }

    }
}