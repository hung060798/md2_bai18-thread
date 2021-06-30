package taoThread;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGen1 = new NumberGenerator();
        NumberGenerator numberGen2 = new NumberGenerator();
//        numberGen1.getThread().setPriority(Thread.MAX_PRIORITY);
//        numberGen2.getThread().setPriority(Thread.MIN_PRIORITY);
        Thread t = new Thread(numberGen1);
        Thread t1 = new Thread(numberGen1);

        t.start();
       t1.start();

    }
}
