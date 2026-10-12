// Advance Q8: Unsynchronized Counter (Shows race condition / incorrect results)
class Counter {
    private int count = 0;

    public void increment() {
        count++; // Not atomic
    }

    public int getCount() {
        return count;
    }
}

class IncrementTask implements Runnable {
    private Counter counter;

    public IncrementTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class ThreadUnsynchronizedMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Advance Q8: Unsynchronized Threads (Race Condition) ===");
        Counter counter = new Counter();

        Thread t1 = new Thread(new IncrementTask(counter));
        Thread t2 = new Thread(new IncrementTask(counter));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Expected Counter Value: 2000");
        System.out.println("Actual Counter Value (without synchronization): " + counter.getCount());
        System.out.println("Observation: Due to race conditions, actual count is often less than 2000.");
    }
}