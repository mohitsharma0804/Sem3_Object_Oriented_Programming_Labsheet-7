// Advance Q5: Thread Priorities
class PriorityTask extends Thread {
    public PriorityTask(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Executing: " + getName() + " with priority " + getPriority());
    }
}

public class ThreadPrioritiesMain {
    public static void main(String[] args) {
        System.out.println("=== Advance Q5: Thread Priorities ===");
        PriorityTask low = new PriorityTask("Low-Priority-Thread");
        PriorityTask norm = new PriorityTask("Norm-Priority-Thread");
        PriorityTask high = new PriorityTask("High-Priority-Thread");

        low.setPriority(Thread.MIN_PRIORITY);   // 1
        norm.setPriority(Thread.NORM_PRIORITY); // 5
        high.setPriority(Thread.MAX_PRIORITY);  // 10

        // Starting in reverse order to observe priority scheduling influence
        low.start();
        norm.start();
        high.start();
    }
}