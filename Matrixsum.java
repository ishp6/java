import java.util.*;

public class Matrixsum {

    public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in);

        int[][] numbers = new int[3][3];

        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = 0; j < numbers[i].length; j++)
            {
                System.out.print("Enter array elements for row " + (i + 1) + " and column " + (j + 1) + " : ");
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

        for(int i = 0; i < numbers.length; i++)
        {
            int sum = 0;

            for(int j = 0; j < numbers[i].length; j++)
            {
                sum += numbers[i][j];
            }
            System.out.println("Sum of elements in row " + (i + 1) + " : " + sum);
        }

        for(int j = 0; j < numbers[0].length; j++)
        {
            int cols = 0;

            for(int i = 0; i < numbers.length; i++)
            {
                cols += numbers[i][j];
            }
            System.out.println("Sum of elements in column " + (j + 1) + " : " + cols);

        }
        sc.close();

    }
    



    



    
}
