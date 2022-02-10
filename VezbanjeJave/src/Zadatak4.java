import java.util.Scanner;

public class Zadatak4 {
    /*4. Pravi se konvertor valute preko metoda. Korisnik unosi zeljeni iznos za konverziju,
        u dinarima kao i zeljenu valutu (evro, franak, dolar).
        Ispisuje se poruka koliki je zeljeni iznos u  konvertovanoj valuti.*/
    public static double konvertorValuta(double iznos, String valuta) {

        double vrednost = 0;

        if (valuta.equals("evro")) {

            vrednost += iznos * 0.0085;

        }

        else if (valuta.equals("franak")) {

            vrednost += iznos * 0.0093;

        }

        else if (valuta.equals("dolar")) {

            vrednost += iznos * 0.010;

        }

        return vrednost;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Molim vas unesite iznos u dinarima:");

        double unosIznosa = scan.nextDouble();

        System.out.println("Molim vas da unesete valutu u koju da konvertujemo dinare:");

        String unosValute = scan.next();



    }

}
