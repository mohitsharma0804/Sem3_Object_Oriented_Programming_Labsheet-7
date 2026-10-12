// Advance Q1: Creating thread by extending Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Extended Thread running - Count: " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class ThreadExtendMain {
    public static void main(String[] args) {
        System.out.println("=== Advance Q1: Extending Thread Class ===");
        MyThread t1 = new MyThread();
        t1.start(); // Starts the thread
    }
}