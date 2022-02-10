import java.util.Scanner;

public class WhilePetljaIspisivanja {
    public static void main(String[] args) {

 /*       Uneti dva broja s tastature (prvi je manji, drugi je veci) i napraviti while petlju koja ispisuje:
        sve brojeve izmedju ukljucujuci i granicne vrednosti
                (ako se unesu 4 i 8 ispisace se 4 5 6 7 8)*/

        System.out.println("Unesite prvi manji pozitivan broj: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Unesite drugi veci pozitivni broj: ");
        int y = sc.nextInt();
        while (x <= y) {
            System.out.print(x);
            x++;
        }

    }
}
