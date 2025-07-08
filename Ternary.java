import java.util.*;

public class Ternary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();

        String result = ((num%2==0)) ? "Number is EVEN" : "Number is ODD";
        System.out.println(result);
    }
}