// Advance Q7: Thread Join Method
class WorkerThread extends Thread {
    @Override
    public void run() {
        System.out.println("Worker thread starting work...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Worker thread completed work.");
    }
}

public class ThreadJoinMain {
    public static void main(String[] args) {
        System.out.println("=== Advance Q7: Thread join() Method ===");
        WorkerThread worker = new WorkerThread();
        worker.start();

        try {
            System.out.println("Main thread waiting for worker thread to finish using join()...");
            worker.join(); // Main thread pauses until worker finishes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Worker thread finished. Main thread resumes and exits.");
    }
}