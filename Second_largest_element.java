import java.util.*;

public class Second_largest_element {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println("Enter number " + (i + 1) + " : ");
            numbers[i] = sc.nextInt();
        }

        int largest = numbers[0];

        for(int num : numbers)
        {
            if(num > largest)
            {
                largest = num;
            }
        }

        System.out.println("The largest number in the array is : " + largest);

        int secondLargest = numbers[0];

        for(int num : numbers)
        {
            if(num < largest && num > secondLargest)
            {
                secondLargest = num;
            }
        }

        System.out.println("The second largest number in the array is : " + secondLargest);

        sc.close();
    }
    
}
