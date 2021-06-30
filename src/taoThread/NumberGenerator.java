package taoThread;

public class NumberGenerator implements Runnable{

    private Thread thread;

    public NumberGenerator() {
    }

    @Override
    public void run() {
        for (int i =1; i<=10; i++){
            System.out.println(i );
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Dead");
    }

    public Thread getThread() {
        return thread;
    }
}
