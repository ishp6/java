public class Nested {

    public static void main(String[] args) {
        
        System.out.println("We are about to print Star pattern");

        for(int i=1; i<=10; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        //System.out.println();
    }
}