import java.util.*;

public class TwoDarray_search {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of rows : ");
    int rows = sc.nextInt();
    System.out.print("Enter the number of colums : ");
    int cols = sc.nextInt();

    int[][] numbers = new int[rows][cols];

    for(int i = 0; i < rows; i++)
    {
        for(int j = 0; j < cols; j++)
        {
            System.out.print("Enter array element : ");
            numbers[i][j] = sc.nextInt();
        }
    }

    System.out.print("Enter the element that needs to be found : ");
    int x = sc.nextInt();

    boolean found = false;

    for(int i = 0; i < rows; i++)
    {
        for(int j = 0; j < cols; j++)
        {
            if(numbers[i][j] == x)
            {
                System.out.println("Element " + x + " found at index [" + i + "][" + j + "]");
                found = true;
            }
            
        }
        
    }
    if(!found)
    {
        System.out.print("Element not found!");
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
