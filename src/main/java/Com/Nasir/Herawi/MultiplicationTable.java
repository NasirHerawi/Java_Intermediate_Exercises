package Com.Nasir.Herawi;

import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("THIS IS A PROGRAM TO SHW MULTIPLICATION TABLE");
        System.out.println("Enter the number to find it's multiplication table");
        int i = sc.nextInt();
        int counter;
        System.out.println("Mltiplication Table is as follow:");
        for(counter = 0;counter<11;counter++) {
            System.out.println(i +"X" +counter+"= "+i * counter);
        }
    }
}
