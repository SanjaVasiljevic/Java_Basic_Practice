import java.util.Scanner;

public class Zadatak12 {
    public static void main(String[] args) {
                  /*Korisnik unosi novac na racunu koji raspolaze kao i cenu nekog artikla.
    Na standardni izlaz ispisati koliko kopija tog
    artika korisnik moze da kupi.*/
        Scanner sc = new Scanner(System.in);
        System.out.println(" Unesite koliko novaca imate; ");
        int novci= sc.nextInt();
        double cenaArtikla = 500.00;
        int brojArtikalaKupljenih=0;
        for(int i=0; i<novci; i+=500){
            brojArtikalaKupljenih++;
        }
        System.out.println("Mozete kupiti "+ brojArtikalaKupljenih+ " artikla");

    }
}
