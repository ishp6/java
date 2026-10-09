public class Method_Recursion {

    static int factorial(int n)
    {
        if(n <= 1)
        {
            return 1;
        }

        return n * factorial(n-1);
    }

    public static void main(String args[])
    {
        System.out.print("Factorial of 5 is : " + factorial(5));
    }
    
}
