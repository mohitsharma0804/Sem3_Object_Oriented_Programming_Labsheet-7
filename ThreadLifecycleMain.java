// Advance Q3: Thread Lifecycle Demonstration
class LifecycleDemoThread extends Thread {
    @Override
    public void run() {
        // Running state
        System.out.println("Thread State inside run(): Running");
        try {
            Thread.sleep(500); // Timed Waiting / Blocked state simulation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread finishing execution.");
    }
}

public class ThreadLifecycleMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Advance Q3: Thread Life Cycle Demonstration ===");
        LifecycleDemoThread t = new LifecycleDemoThread();
        
        System.out.println("1. New State: " + t.getState());
        
        t.start();
        System.out.println("2. Runnable / Running State: " + t.getState());
        
        Thread.sleep(150);
        System.out.println("3. Timed Waiting State (during sleep): " + t.getState());
        
        t.join(); // Wait for thread to finish
        System.out.println("4. Terminated State: " + t.getState());
    }
}