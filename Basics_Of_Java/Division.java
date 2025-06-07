import java.util.*;

class Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a of (a/b)");
        int a = scan.nextInt();
        System.out.println("Enter b of (a/b)");
        int b = scan.nextInt();
        float answer = (float) a / b;
        scan.close();
        System.out.println("Division of it is : " + answer);
    }
}