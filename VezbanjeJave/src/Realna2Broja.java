import java.util.Scanner;

public class Realna2Broja {
    public static void main(String[] args) {

       /* Učitati 2 realna broja različita od 0. Ako su različitog predznaka sabrati ih,
        a ako su istog predznaka pomnožiti ih. Rezulat štampati na ekran.*/

        Scanner input = new Scanner (System.in);
        double a, b, rezultat;

        System.out.print("Prvi broj:");
        a = input.nextDouble();
        while (a == 0) {
            System.out.print("Broj mora biti razlicit od 0. Ponovi unos:");
            a = input.nextDouble();
        }

        System.out.print("Drugi broj:");
        b = input.nextDouble();
        while (b == 0) {
            System.out.print("Broj mora biti razlicit od 0. Ponovi unos:");
            b = input.nextDouble();
        }

        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            rezultat = a + b;
        } else {
            rezultat = a * b;
        }
        System.out.print("Rezultat: " + rezultat);

    }
}
