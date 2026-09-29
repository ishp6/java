import java.util.*;

public class Search_array_element 
{

    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);

    int[] numbers = new int[10];

    for(int i = 0; i < numbers.length; i++)
    {
        System.out.println("Enter number " + (i + 1) + " : ");
        numbers[i] = sc.nextInt();
    }

    System.out.println("Enter the numbers that needs to be searched : ");
    int number = sc.nextInt();
    int count = 0;

    for(int num : numbers)
    {
        if(number == num)
        {
            count++;
        }
    }
    
    if(count > 0)
    {
        System.out.println(number + " is found " + count + " times in the array.");

    }
    else
    {
        System.out.println("Number not found in the array.");
    }
    sc.close();
    
}
}
