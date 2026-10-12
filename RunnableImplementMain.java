// Advance Q2: Creating thread by implementing Runnable interface
class NumberTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Runnable Thread - Number: " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Task interrupted.");
            }
        }
    }
}

public class RunnableImplementMain {
    public static void main(String[] args) {
        System.out.println("=== Advance Q2: Implementing Runnable Interface ===");
        NumberTask task = new NumberTask();
        Thread t = new Thread(task);
        t.start();
    }
}