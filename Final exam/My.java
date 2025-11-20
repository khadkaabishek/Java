// import java.util.*;

// public class My extends Thread {
//     public void run() {
//         for (int i = 0; i < 10; i++) {

//             System.out.println(i);
//             try {
//                 Thread.sleep(5000);
//             } catch (Exception e) {
//                 System.out.println(e.getMessage());
//             }
//         }
//     }

//     public static void main(String[] args) {
//         My t1 = new My();
//         My t2 = new My();
//         t1.start();
//         t2.start();

//     }
// }
public class My implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println(i);
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) throws Exception {
        My t1 = new My();
        My t2 = new My();
        Thread T1 = new Thread(t1);
        Thread T2 = new Thread(t2);
        T1.start();
        T2.start();

    }
}