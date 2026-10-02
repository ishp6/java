import java.util.*;

public class Duplicates_array {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println("Enter number " + (i + 1) + " : ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("---Duplicates in the array : ");

        for(int i = 0; i < numbers.length; i++)
        {
            int count = 1;

            for(int j = i + 1; j < numbers.length; j++)
            {
                if(numbers[i] == numbers[j])
                {
                    count++;
                }
            }
            if(count > 1)
            {
                System.out.println(numbers[i] + " is dupllicate and found " + count + " times.");
            }
        }
        sc.close();
    }
}