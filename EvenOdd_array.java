import java.util.*;

public class EvenOdd_array {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];


        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println("Enter number " + (i + 1) + " : ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Numbers of even-odd in array : ");

        int evenCount = 0;
        int oddCount = 0;

        for(int num : numbers)
        {
            if(num % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;

            }
        }
        System.out.println("Even numbers count : " + evenCount);
        System.out.println("Odd numbers count : " + oddCount);

        sc.close();
    }
    
}
