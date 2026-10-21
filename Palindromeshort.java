import java.util.*;

public class Palindromeshort {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String word = sc.nextLine().toLowerCase();

        String reversed = new StringBuilder(word).reverse().toString();

        if(word.equals(reversed))
        {
            System.out.println(word + " is a palindrome");
        }
        else
        {
            System.out.println(word + " is not a palindrome ");
        }
        sc.close();


    }
    
}
