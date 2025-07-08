public class Typepromotion 
{
    public static void main(String[] args) {
        int a = 5;
        float b = 23.45f;
        long c = 89;
        double d = 67.567;
        double ans = (a + b + c + d);
        System.out.println(ans);

        byte var = 6;
        byte var2 = (byte) (var * 2); //[byte range is between -128 to 127]
        System.out.println(var2);

    }
}