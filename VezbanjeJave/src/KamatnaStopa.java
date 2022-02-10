import java.util.Scanner;

public class KamatnaStopa {

    public static void main(String[] args) {
        /*  Napisati program koji izracunava iznos kamate na deposit I uvecava stanje depozita
        nakon 1 godine. Ulazne velicine parametra su pocetni deposit I godisnja kamatna stopa,
    a izlazni parametri su novcani iznos kamate I uvecani deposit nakon godinu dana.*/
        double pocetniDepozit;
        double kamataStopa;
        double iznosKamate;
        double depozit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite vas pocetni depozit: ");
        pocetniDepozit= sc.nextInt();
        System.out.println("Unesite godisnju kamatnu stopu:  ");
        kamataStopa= sc.nextInt();
        iznosKamate=pocetniDepozit*kamataStopa;
        depozit=iznosKamate+pocetniDepozit;
        System.out.println(" Novcani iznos godisnje kamate je " + iznosKamate);
        System.out.println("Uvecan depozit nakon jedne godine je " + depozit);
    }

    }

