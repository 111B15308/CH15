class HiBye implements Runnable {
    private String message;

    public HiBye(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " " + i);

            try {
                if (message.equals("Hello")) {
                    Thread.sleep(1000);
                } else if (message.equals("Good bye")) {
                    Thread.sleep(2500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class CH1510{
    public static void main(String[] args) {
        Thread hiThread = new Thread(new HiBye("Hello"));
        Thread byeThread = new Thread(new HiBye("Good bye"));

        hiThread.start();
        byeThread.start();
    }
}
