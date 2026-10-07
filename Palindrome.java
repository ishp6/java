import java.util.*;

public class Palindrome {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string : ");
        String str = sc.nextLine();

        int start = 0;
        int end = str.length() - 1;

        boolean Palindrome = true;


        while(start < end)
        {
            if(str.charAt(start) != str.charAt(end))
            {
                Palindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(Palindrome)
        {
            System.out.println("The string is a palindrome : " + str);
        }
        else
        {
            System.out.println("The string is not a palindrome");
        }
        sc.close();
    }
    
}
