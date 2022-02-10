import java.util.Arrays;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
       /* Napisati program koji ucitava N brojeva od korisnika i proverava da li se u
        unetim brojevima nalazi broj K (K takodje unosi korisnik. Primer: Kad korisnik unese broj K program ispise
        "Zeljeni broj je pronadjen, a ako se ne nadje zeljeni broj ispise se poruka da "Zeljeni broj nije pronadjen
*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite trzeni  broj k: ");
        int k = sc.nextInt();
        int[] niz = {0, 0, 0, 0, 0};
        for (int i = 0; i < niz.length; i++) {
            System.out.print("Unesite neki n brojeva: ");
            niz[i] = sc.nextInt();
        }
        System.out.println(" Vas niz brojeva je: ");
        System.out.println(Arrays.toString(niz));
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] == k) {
                System.out.println("Broj " + k + " je pronadjen u datim brojevima");
            } else {
                System.out.println(" Nazalost vas trazeni broj nije nadjen.");
            }

        }


    }
}
