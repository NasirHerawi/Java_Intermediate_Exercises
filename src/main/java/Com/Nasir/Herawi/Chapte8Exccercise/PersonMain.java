package Com.Nasir.Herawi.Chapte8Exccercise;

import java.util.Date;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.name  = "Nasir Herawi";
        System.out.println(person.name);
        Gender sex = Gender.male;
        System.out.println(person.name +" is " + sex);
       // Person.Gender gen;
        Person p = new Person();
        p.name = "Sigi,Watson";

        System.out.println(p.name +" is a " +Gender.femal );
    }
}
