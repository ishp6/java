import java.util.*;

public class Array_index {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int element[] = new int[n];

        for(int i = 0; i < n; i++)                        //input for array
        {
           System.out.print("Enter array elements : ");
           element[i] = sc.nextInt();

        }

        System.out.print("Enter the element that needs to be searched : "); //element to be searched
        int x = sc.nextInt();

        boolean found = false;
        
        for(int i = 0; i < n; i++)
        {
            if(element[i] == x)
            {
                System.out.println("Element found at index : " + i);
                found = true;
            }
            
        }
        if(!found)
            {
                System.out.print("Element not found.");
            }

        for(int i = 0; i < n; i++)
        {
            System.out.print(element[i] + " ");  //output of array elements
        }
        sc.close();
        

    }
    
}