import java.util.Locale;
import java.util.Scanner;

public class Zadatak13 {
    public static void main(String[] args) {
        //. Korisnik unosi ime, prezime i pol
// (F/M), u zavisnosti od pola, program izbacuje tekst dobrodoslice: Dobrodosao/dobrodsla u IT.
                Scanner s = new Scanner(System.in);
                System.out.println("unesite ime: ");
                String ime = s.next();
                System.out.println("Unesite prezime: ");
                String prezime = s.next();
                System.out.println("Unesite pol (F/M): ");
                char pol = s.next().toUpperCase(Locale.ROOT).charAt(0);

                if (pol == 'F') {
                    System.out.println(ime + " dobrodosla");
                } else if (pol == 'M') {
                    System.out.println(ime + " dobrodosao");
                } else {
                    System.out.println("nevalidan unos");
                }
            }
        }

