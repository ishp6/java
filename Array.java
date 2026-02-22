import java.util.*;

public class Array {

    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the size of your array : ");
     int n = sc.nextInt();
     int marks[] = new int[n];

     for(int i = 0; i < n; i++)
     {
        System.out.print("Enter array element : ");
        marks[i] = sc.nextInt();
     }

     for(int i = 0; i < n; i++)
     {
        System.out.print(marks[i]);
     }

     sc.close();


    }
    
}
