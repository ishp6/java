public class Function_Overloading {

    public static int multiply(int a, int b)
    {
        return a*b;
    }

    public static double multiply(double a, double b)
    {
        return a*b;
    }

    public static void main(String[] args) {
        
        System.out.println(multiply(4,5));
        System.out.println(multiply(2.3, 3.4));

    }
    
}
