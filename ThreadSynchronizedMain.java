// Advance Q9: Synchronized Counter (Thread-safe)
class SafeCounter {
    private int count = 0;

    // Using synchronized keyword to make operation thread-safe
    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

class SafeIncrementTask implements Runnable {
    private SafeCounter counter;

    public SafeIncrementTask(SafeCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class ThreadSynchronizedMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Advance Q9: Synchronized Thread-Safe Counter ===");
        SafeCounter counter = new SafeCounter();

        Thread t1 = new Thread(new SafeIncrementTask(counter));
        Thread t2 = new Thread(new SafeIncrementTask(counter));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Expected Counter Value: 2000");
        System.out.println("Actual Counter Value (with synchronization): " + counter.getCount());
        System.out.println("Observation: Synchronization ensures correct thread-safe results (2000).");
    }
}