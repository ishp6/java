public class Operator {

    public static void main(String[] args) {
        
        float a = 7/4 * 9/2;
        System.out.println(a); // java truncates the decimal part

        float a1 = 7f/4 * 9f/2;
        System.out.println(a1); // since we used 'f' then it becomes floating point division
    }
}