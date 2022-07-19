package Com.Nasir.Herawi;

public class ThredDemo {
    public static void main(String[] args) {


        Mythred mythred = new Mythred();
        Runnableth runnableth = new Runnableth();
        runnableth.run();

        mythred.start();
    }



}
