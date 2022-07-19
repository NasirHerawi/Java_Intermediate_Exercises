package Com.Nasir.Herawi;

public class Runnableth implements Runnable {


    @Override
    public void run() {
        System.out.println("I am The first Thread! in RUNNABLE");
        try {
            Thread.sleep(4000);
            System.out.println("Now It is My Time to appear!");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
