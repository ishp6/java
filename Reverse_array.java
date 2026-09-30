import java.util.*;

public class Reverse_array {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println("Enter number " + (i + 1) + " : ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("---Original Array---");

        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("---Reversed Array---");

        for(int i = numbers.length - 1; i >= 0; i--)
        {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}