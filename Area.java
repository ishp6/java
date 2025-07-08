import java.util.*;

public class Area 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius : ");
        float rad = sc.nextFloat();
        float area = (3.14f * rad *rad);
        System.out.println(" Radius of circle whose value : \n" + rad + " =  " +area);
    }
}