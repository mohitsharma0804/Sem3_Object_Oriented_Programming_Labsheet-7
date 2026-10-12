// Advance Q6: Thread.sleep() demonstration
class SleeperThread extends Thread {
    @Override
    public void run() {
        System.out.println(getName() + " started and going to sleep for 2 seconds.");
        try {
            Thread.sleep(2000); // 2000 ms = 2 seconds
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " woke up and finished.");
    }
}

public class ThreadSleepMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Advance Q6: Thread.sleep() Behavior ===");
        SleeperThread t1 = new SleeperThread();
        t1.setName("Sleeper-1");
        t1.start();

        // Main thread continues execution concurrently
        for (int i = 1; i <= 3; i++) {
            System.out.println("Main thread running independently: " + i);
            Thread.sleep(700);
        }
        t1.join();
        System.out.println("All tasks completed.");
    }
}