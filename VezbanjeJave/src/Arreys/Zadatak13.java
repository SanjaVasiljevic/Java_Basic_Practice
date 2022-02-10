package Arreys;

import java.util.Scanner;

public class Zadatak13 {
    //Omoguciti da korisnik unese n brojeva preko skenera i smestiti
//ih u niz. Ispisati taj niz u obrtnutom redosledu
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("unesi godinu: ");
        int god = s.nextInt();
        if ((god % 4 == 0 && god % 100 != 0) || (god % 400 == 0)) {
            System.out.println("godina je prestupna");
        } else {
            System.out.println("nije prestupna");
        }

    }
}
