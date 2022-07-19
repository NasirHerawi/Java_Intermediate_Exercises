package Com.Nasir.Herawi;

public class IntergerCounter <T extends Number> {
    T age;
      IntergerCounter(T age){
        this.age = age;
    }
    public void printage(){
        System.out.println(age);

    }
}

