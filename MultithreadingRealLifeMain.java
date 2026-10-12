// Advance Q10: Real-life Multithreading Example (File Download & Data Processing)
class DownloadTask extends Thread {
    private String fileName;

    public DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("[Download Thread] Starting download of " + fileName + "...");
        try {
            for (int i = 25; i <= 100; i += 25) {
                Thread.sleep(400);
                System.out.println("[Download Thread] " + fileName + " progress: " + i + "%");
            }
        } catch (InterruptedException e) {
            System.out.println("Download interrupted.");
        }
        System.out.println("[Download Thread] " + fileName + " download completed successfully!");
    }
}

class ProcessingTask extends Thread {
    @Override
    public void run() {
        System.out.println("[Processing Thread] Background data analysis started...");
        try {
            for (int i = 1; i <= 3; i++) {
                Thread.sleep(500);
                System.out.println("[Processing Thread] Analyzing chunks... Step " + i);
            }
        } catch (InterruptedException e) {
            System.out.println("Processing interrupted.");
        }
        System.out.println("[Processing Thread] Data processing completed.");
    }
}

public class MultithreadingRealLifeMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Advance Q10: Real-life Multithreading Application ===");
        
        DownloadTask downloadThread = new DownloadTask("Report_2026.pdf");
        ProcessingTask processingThread = new ProcessingTask();

        downloadThread.start();
        processingThread.start();

        downloadThread.join();
        processingThread.join();

        System.out.println("Main Application: All background tasks finished. Application exiting cleanly.");
    }
}