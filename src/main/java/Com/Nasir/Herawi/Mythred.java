package Com.Nasir.Herawi;
// Thredas demo.
public class Mythred extends Thread{
    public void start(){
        System.out.println("My Thread started");
        try {
            Thread.sleep(1000);
            System.out.println(2);
            Thread.sleep(1000);
            System.out.println(3);
            Thread.sleep(2000);
            System.out.println("This is The end of the Thread");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
