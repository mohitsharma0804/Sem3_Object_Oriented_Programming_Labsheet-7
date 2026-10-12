// Advance Q4: Two threads running simultaneously and printing names
class NamedThread extends Thread {
    public NamedThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Thread Name: " + getName() + " | Iteration: " + i);
            Thread.yield(); // Hint to scheduler to yield execution
        }
    }
}

public class ThreadNamesSchedulingMain {
    public static void main(String[] args) {
        System.out.println("=== Advance Q4: Thread Scheduling & Names ===");
        NamedThread t1 = new NamedThread("Alpha-Thread");
        NamedThread t2 = new NamedThread("Beta-Thread");

        t1.start();
        t2.start();
    }
}