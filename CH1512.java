import java.util.Random;

class PrePaid extends Thread {
    private int sum = 200;

    public void run() {
        for (int i = 0; i < 5; i++) {
            int fee = new Random().nextInt(100);
            try {
                talk(fee);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void talk(int fee) {
        if (sum > 10) {
            sum -= fee;
            System.out.println(Thread.currentThread().getName() + ": 通話費用 " + fee + " 元，餘額 " + sum + " 元");
        } else {
            System.out.println(Thread.currentThread().getName() + ": 餘額不足，無法通話");
        }
    }
}

public class CH1512{
    public static void main(String[] args) {
        PrePaid phone1 = new PrePaid();
        PrePaid phone2 = new PrePaid();
        PrePaid phone3 = new PrePaid();

        phone1.start();
        phone2.start();
        phone3.start();
    }
}
