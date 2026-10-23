import java.util.*;

public class RegistrationValidator {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine().trim();
        System.out.println("Enter your email : ");
        String email = sc.nextLine().trim();
        System.out.println("Enter your password : ");
        String pwd = sc.nextLine().trim();

        if(name.isEmpty())
        {
            System.out.println("Name cannot be empty");
        }
        else if(!email.contains("@"))
        {
            System.out.println("Email is invalid");
        }
        else if(pwd.length() < 8)
        {
            System.out.println("Password must be at least 8 characters long");
        }
        else
        {
            System.out.println("Registration successful and validated.");
        }
        sc.close();
        }
    }
