import java.util.Scanner;

public class Bacanje2Kockice {
    public static void main(String[] args) {
       /* Napisati program koji simurira eksperiment bacanje dve kocke za igru I
       odreduje koliko puta treba baciti par kocki dok na obe kocke ne padnu istovremeno  vrednost
       1. Inace, kockarski termin za ovaj ishod je “zmijske oci”.
       Program treba da prikaze vrednost kocki pri svakom bacanj I da na kraju prikaze ukupan broj bacanja kocki.
        Napisati program koji dati vremenski trenutak izrazen pomocu broja a,
         godine, meseca, sati i minuti pakuje u jednu promenjivu tipa int,
         zatim pokazuje njeu celobrojnu vrednost i na karaju raspakuje sadrzaj te promenjive
         pikazujuci originalne podatke o datom vremenskom trenutku
*/
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


