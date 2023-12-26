class MyRunnable implements Runnable {
    private String threadName;
    private int count;

    public MyRunnable(String name) {
        this.threadName = name;
        this.count = 0;
    }

    public void run() {
        try {
            while (count < 10) {
                if (threadName.equals("Thread 1")) {
                    System.out.println(threadName + " is running...");
                    Thread.sleep(1000);
                } else if (threadName.equals("Thread 2")) {
                    System.out.println(threadName + " is running...");
                    Thread.sleep(2500);
                }
                count++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class CH1507 {
    public static void main(String[] args) {
        MyRunnable myRunnable1 = new MyRunnable("Thread 1");
        MyRunnable myRunnable2 = new MyRunnable("Thread 2");

        Thread t1 = new Thread(myRunnable1);
        Thread t2 = new Thread(myRunnable2);

        t1.start();
        t2.start();
    }
}
