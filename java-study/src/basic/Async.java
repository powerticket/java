package basic;

public class Async {
    static class Sound implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("소리");
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        Sound sound = new Sound();
        Thread t1 = new Thread(sound);
        t1.start();
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("메인");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
