import java.util.*;
import java.util.Scanner;

public class Division_Error_Handling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float answer = 0;
        try {
            System.out.println("Enter a of (a/b)");
            int a = scan.nextInt();
            System.out.println("Enter b of (a/b)");
            int b = scan.nextInt();
            answer = (float) a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            scan.close();
            System.out.println("Division of it is : " + answer);
        }
    }
}
