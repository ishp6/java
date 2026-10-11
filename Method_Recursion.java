public class Method_Recursion {

    static int factorial(int n)
    {
        if(n <= 1)
        {
            return 1;   //base case : stop here
        }

        return n * factorial(n-1);  // recursive call
    }

    public static void main(String args[])
    {
        System.out.print("Factorial of 5 is : " + factorial(5));
    }
    
}
