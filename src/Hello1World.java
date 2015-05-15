import java.lang.String;import java.lang.System;import java.util.Scanner;

/**
 * Created by Reinhard Schuster on 13.05.2015.
 */
public class Hello1World {

    public static void main(String[] args) {

        String reingezockt;

        Scanner justin = new Scanner(System.in);


        System.out.println("Geben sie einen Text ein");

        reingezockt = justin.nextLine();


        if (reingezockt.equals("hallo")) {
            System.out.println("Moin du kleiner Brennender haufen scheiﬂe");


        } else {
            System.out.println("Ich bin kein Brennender haufen scheiﬂe");
        }

    }
}


