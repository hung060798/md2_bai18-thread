package baiTap1;

public class Xe extends Thread{
    private  int speed;
    private  int time;
    private String name;

    public Xe(int speed, String name) {
        this.speed = speed;
        this.name = name;

    }


    public void run (){
        long startTime = System.currentTimeMillis();
         try{
             for (int i=1000; i >0; i= i - speed){
                 Thread.sleep(speed);
             }
         long endTime = System.currentTimeMillis();
             System.out.println(name+ " thoi gian "+ (endTime-startTime)+"ms");
         }catch (Exception e){

         }
    }
}
