class Test extends Thread {
    private String id;

    public Test(String str) {
        id = str;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 100000000; j++);
            System.out.println(id + " " + i);
        }
    }
}

public class CH1503 {
    public static void main(String[] args) {
        Test morning = new Test("Good morning");
        morning.start();  
        new Test("Bonjour").start();  
        new Test("Guten Morgen").start(); 
        Test night = new Test("Good night");
        night.start(); 
    }
}
