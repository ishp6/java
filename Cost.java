import java.util.*;

public class Cost 
{
    public static void main(String[] args) {
        
        /* Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
        (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pencil : ");
        float pencil = sc.nextFloat();
        System.out.println("Enter the cost of pen : ");
        float pen = sc.nextFloat();
        System.out.println("Enter the cost of eraser : ");
        float eraser = sc.nextFloat();
        float totalcost = (pencil+pen+eraser);
        System.out.println("Total cost :"  +totalcost);

        //Bill with 18% tax
        float newTotal = totalcost + (0.18f * totalcost);
        System.out.println("Bill with 18% GST " + newTotal);



    }
}