package Arreys;

import java.util.Arrays;

public class Zadatak12 {
    //39. Napisati funkciju koja vraca zbir drugog najmanjeg i drugog najveceg elementa niza.
    public static void main(String[] args) {

            int [] niz = {1, 2, 5, 6, 3, 77, 22, 45, 101};
            System.out.println(zbir(niz));
        }
        public static int zbir (int [] arr){
            Arrays.sort(arr);
            int drugiNajmanji = arr[1];
            int drugiNajveci = arr[arr.length-2];
            return drugiNajmanji + drugiNajveci;
        }
    }


