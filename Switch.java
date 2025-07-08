import java.util.*;

public class Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int number = sc.nextInt();

        switch(number)
        {
            case 1 : System.out.println("Bread");
                     break;
            case 2 : System.out.println("Butter");
                     break;
            case 3 : System.out.println("Jam");
                     break;
            default : System.out.println("Wake up!");         
        }
    }
}