public class Unary 
{
    public static void main(String[] args) {
        System.out.println("Pre-increment operator : ");
        int val = 10;
        int val1 = ++val;
        System.out.println(val);
        System.out.println(val1);  //O/P : 11,11

        System.out.println("Pre-decrement operator : ");
        int a = 9;
        int b = --a;
        System.out.println(a);
        System.out.println(b);   //O/P : 8,8

        System.out.println("Post-increment operator : ");
        int post = 8;
        int post1 = post++;
        System.out.println(post);
        System.out.println(post1);  //O/P : 9,8

        System.out.println("Post-decrement operator : ");
        int pdec = 6;
        int pdec1 = pdec--;
        System.out.println(pdec);
        System.out.println(pdec1); //O/P : 5,6




    }
}