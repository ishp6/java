import java.util.*;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the array size
        System.out.println("Enter the length of the array: ");
        int n = scanner.nextInt();
        
        // Input the array elements
        int[] array = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Reverse the array
        reverseArray(array);
        
        // Calculate the sum of elements at even indices
        int evenSum = calculateEvenIndexSum(array);
        
        // Output the result
        System.out.println("Sum of elements at even indices after reversing the array: " + evenSum);
        
        scanner.close();
    }
    
    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            // Swap the elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
            // Move the pointers
            start++;
            end--;
        }
    }
    
    // Method to calculate the sum of elements at even indices
    public static int calculateEvenIndexSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) { // Check for even index
                sum += array[i];
            }
        }
        return sum;
    }
}
