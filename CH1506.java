class Sub implements Runnable {
    private int n;
    private int product = 1;

    public Sub(int a) {
        n = a;
    }

    public void run() {
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        System.out.println("Product of 1 to " + n + ": " + product);
    }
}

public class CH1506 {
    public static void main(String[] args) {
        Sub sub5 = new Sub(5);
        Sub sub10 = new Sub(10);

        Thread thread1 = new Thread(sub5);
        Thread thread2 = new Thread(sub10);

        thread1.start(); 
        thread2.start(); 
    }
}
