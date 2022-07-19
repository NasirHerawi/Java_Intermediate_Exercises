package Com.Nasir.Herawi;

public class ArraryDemo {
    public static void main(String[] args) {
        String[] cities = {"Koblenz","Berline","Munchen"};
        String shar [] = {"Koblenz","Berline","Munchen"};
       System.out.println(cities.length);
       System.out.println(cities.hashCode());
       System.out.println(cities.equals(shar));
        System.out.println(shar.hashCode());
        for(String newshar :cities){
            System.out.println(newshar);
            System.out.println(shar);
            System.out.println(cities.hashCode());

        }

    }
}
