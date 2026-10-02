 import java.util.*;

 public class Sum_2D_array {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int[][] numbers = new int[3][3];

        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = 0; j < numbers[i].length; j++)
            {
                System.out.print("Enter array element for row " + (i + 1) + " and column " + (j + 1) + "  ");
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = 0; j < numbers[i].length; j++)
            {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;

        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = 0; j < numbers[i].length; j++)
            {
                sum += numbers[i][j];
            }
        }

        System.out.println("Sum of all elements in the 2D array : " + sum);
        sc.close();
    }
}
        
    
