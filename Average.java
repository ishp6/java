import java.util.*;
public class Average 
{
    public static void main(String[] args) {
        /*In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
        (Hint : Average of N numbers is sum of those numbers divided by N) */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A:");
        int A = sc.nextInt();
        System.out.println("Enter the value of B");
        int B = sc.nextInt();
        System.out.println("Enter the value of C:");
        int C = sc.nextInt();
        int average = (A+B+C)/3;
        System.out.println("Average is  : "+ average);

    }
}