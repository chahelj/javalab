// Thread to print "BMS College of Engineering" every 10 seconds
class CollegeThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("BMS College of Engineering");
            try {
                Thread.sleep(10000); // 10000 milliseconds = 10 seconds
            } catch (InterruptedException e) {
                System.out.println("CollegeThread interrupted");
            }
        }
    }
}

// Thread to print "CSE" every 2 seconds
class CSEThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("CSE");
            try {
                Thread.sleep(2000); // 2000 milliseconds = 2 seconds
            } catch (InterruptedException e) {
                System.out.println("CSEThread interrupted");
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        CollegeThread t1 = new CollegeThread();
        CSEThread t2 = new CSEThread();

        t1.start(); // start first thread
        t2.start(); // start second thread
    }
}
