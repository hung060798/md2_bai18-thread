package baiTap1;

public class Main {
    public static void main(String[] args) {
        Xe x = new Xe(500,"hung" );
        Xe x1 = new Xe(100, "hoang");
        Xe x2 = new Xe(200, "ta");
        Xe x3 = new Xe(900,"a");
        Xe x4 = new Xe(10,"b");

        x.start();
        x1.start();
        x2.start();
        x3.start();
        x4.start();


    }
}
