import java.util.*;

public class TwoDarray {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print("Enter 2D array elements : ");
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
    

}