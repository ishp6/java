import java.util.*;

public class StringPassword_checker {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password : ");
        String pwd = sc.nextLine();

        int score = 0;

        if(pwd.length() >= 8)
        {
            score++;
        }

        boolean hasDigit = false;
        boolean hasUppercase = false;
        boolean hasLowercase = false;

        for(int i = 0; i < pwd.length(); i++)
        {
            char ch = pwd.charAt(i);

            if(Character.isDigit(ch))
            {
                hasDigit = true;
            }
            else if(Character.isUpperCase(ch))
            {
                hasUppercase = true;
            
            }
            else if(Character.isLowerCase(ch))
            {
                hasLowercase = true;
            }
        }

        if(hasDigit)
        {
            score ++;
        }
        if(hasUppercase)
        {
            score++;
        }
        if(hasLowercase)
        {
            score++;
        }

        String strength = (score <=1 ) ? "Weak" : (score <=3) ? "Moderate" : "Strong";
        System.out.println("Password strength : " + strength);

        sc.close();
    }
    
}
