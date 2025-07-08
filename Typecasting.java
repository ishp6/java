public class Typecasting 
{
     public static void main(String[] args) {
        float val1 = 45.67f;
        int val = (int) val1;
        System.out.println(val); //Explicit or narrow typecasting

        char ch = 'a';
        int number = ch;
        System.out.println(number); //ASCII value of a is printed.
     }

}