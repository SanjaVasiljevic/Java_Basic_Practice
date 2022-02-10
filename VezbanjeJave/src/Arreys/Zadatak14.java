package Arreys;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak14 {
    //27. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
//Ispisati svaki drugi element tog niza npr [1, 2, 3, 4, 5] -> 1 3 5
//27* Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.  public static void main(String[] args) {
    public static void main(String[] args) {


    Scanner s = new Scanner(System.in);

        System.out.println("Unesite duzinu niza: ");
    int duzina = s.nextInt();
    int [] niz = new int [duzina];
        for (int i = 0; i < duzina; i++){
        System.out.println("Unesite sledeci broj: ");
        int unos = s.nextInt();
        niz [i] = unos;
    }

        System.out.println(Arrays.toString(niz));
        if (duzina % 2 == 0){
        System.out.println(Arrays.toString(noviNizParnaDuzina(niz)));
    } else {
        System.out.println(Arrays.toString(noviNizNeparnaDuzina(niz)));
    }
}
    public static int [] noviNizParnaDuzina (int [] arr ){
        int [] niz2 = new int [arr.length/2];
        int brojac = 0;
        for (int i = 0; i < arr.length; i=i+2){
            niz2[brojac] = arr[i];
            brojac++;
        }
        return niz2;
    }

    public static int [] noviNizNeparnaDuzina (int [] arr ){
        int [] niz2 = new int [arr.length/2+1];
        int brojac = 0;
        for (int i = 0; i < arr.length; i=i+2){
            niz2[brojac]  = arr[i];
            brojac++;
        }
        return niz2;
    }
}


