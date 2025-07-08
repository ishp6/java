import java.util.*;

public class Report {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();

        String report = (marks>=33) ? "PASS" : "FAIL";
        System.out.println(report);
    }
}