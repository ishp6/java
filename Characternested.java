import java.util.*;

public class Characternested {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lines to be printed as characters : ");
        int n = sc.nextInt();
        char ch = 'A';
        int i,j;

        for(i=1; i<=n; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}