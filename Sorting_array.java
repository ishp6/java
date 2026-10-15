import java.util.*;

public class Sorting_array {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        // Print original array
        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        //Sorting the array 

        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(arr[i] > arr[j])
                    {

                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                
            }
            
        }

       // Print sorted array
        System.out.print("\nSorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
    
}
