package Com.Nasir.Herawi;
import java.util.*;

public class Array_Excercise {
    public static void main(String[] args) {
          ArrayList <String> names = new ArrayList<String>();
          names.add("USA");
          names.add("Iran");
          names.add("pakistan");
          System.out.println("List in Accending order is " );
            Collections.sort(names);
            for(String list:names){
                System.out.println("Sorted Elements are : " +list);
            }


        System.out.println("List in Deceinding order is " );
        Collections.sort(names,Collections.reverseOrder());
            for(String list2:names){
                System.out.println("Sorted Elements are : " +list2);

            }



        }

    }
