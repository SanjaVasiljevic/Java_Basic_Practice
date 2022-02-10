import java.util.Scanner;

public class PismoGlava {
    public static void main(String[] args) {
     /*   Napisati program koji simulira bacanje novcica dati broj puta.
         Program treba da ucita zeljeni broj bacanja novcica I da prikaze brojeve koliko puta je palo
         pismo I glava, ko I njihov kolicnik sa brojem bacanja.
        Program treba da ponavlja eksperiment sve dok se ne ucita 0 za broj bacanja.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Unestite broj bacanja novcica: ");
        int brojBacanja = scan.nextInt();
        int brojGlava = 0;
        int brojPisma = 0;
        for (int i = 1; i <= brojBacanja; i++) {
            double x = Math.random();
            if (x>0.5) {
                brojGlava ++;
                System.out.println("bacanje " +i +" glava");
            } else if (x<0.5) {
                brojPisma++;
                System.out.println("bacanje " +i +" pismo");
            } else {
                System.out.println("bacanje " +i +" paradoks!");
            }
        }
        double a = 0.1* brojPisma /brojBacanja ;
        double  b= 0.1 * brojGlava/brojBacanja;
        System.out.println("Broj bacanja novcica je: "+brojBacanja);
        System.out.println("Za zeljeni broj bacanja novcica dobijeno je  "+ brojPisma + " pisma.");
        System.out.println("Za zeljeni broj bacanja novcica dobijeno je  "+ brojGlava + " glava.");
        System.out.println("Kolicnik broja pisma sa brojem bacanja je " + a);
        System.out.println("Kolicnik broja glava sa brojem bacanja je "+ b);
    }
}



