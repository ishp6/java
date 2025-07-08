public class Logical 
{
    public static void main(String[] args) {
        //Logical AND 
        System.out.println( (3>2)  &&  (1<5));   //true
        System.out.println( (3>2)  &&  (1>5));   //false

        //Logical OR 
        System.out.println( (4>2)  || (2<1)); //true
        System.out.println((3>5)   || (4>7));   //false

        //Logical NOT 
        System.out.println( !(6<3) );  //true
        System.out.println( !(4>2) );  //false

    }
}