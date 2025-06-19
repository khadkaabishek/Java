public class MyThread extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    public static void main(String[] args) {
        MyThread obj1 = new MyThread();
        MyThread obj2 = new MyThread();
        obj1.start();
        obj2.start();
    }
}