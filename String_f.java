import java.util.*;

public class String_f {

    public static String calculateString(String name)
    {
        if(name.length() >= 2 && name.charAt(0) == 'P' && name.charAt(1) == 'y' )
        {
            return name;
        }
        else if(name.length() >=2)
        {
            return name.substring(2);
        }
        else 
        {
            return name;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String name = sc.nextLine();
        String result = calculateString(name);
        System.out.print("Your entered string is : " + result);
        sc.close();
    }
    
}
