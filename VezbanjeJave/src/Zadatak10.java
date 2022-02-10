import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
     /*   Napisati program koji sabira brojeve od korisnika sve dok
        korisnik ne unese dva ista broja zaredom. Smatrati da korisnik unosi
        brojeve vece od nule.
*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi broj: ");
        int broj2 = sc.nextInt();
        int broj1 = 0;
        int suma = 0;

        while (broj1 != broj2) {
            broj1 = broj2;
            suma = suma + broj2;
            System.out.println("Unesi broj: ");
            broj1 = sc.nextInt();

        }


        System.out.println("Suma je " + suma);


    }
}



