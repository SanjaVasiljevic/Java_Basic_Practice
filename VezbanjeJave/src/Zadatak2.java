

import java.util.Scanner;

public class Zadatak2 {
    /*
    2. Korisnik unosi distancu u km, i tip vozila kojim se vozi. U zavisnosti od tipa vozila,
        prikazite poruku kolika je potrosnja po km.
            (pretpostavljam da u zadatku imaju nekakve formule za potrosnju u zavisnosti od tipa vozila)
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Molim vas unesite distancu u kilometrima:");

        double predjeniPut = scan.nextDouble();

        System.out.println("Molim vas unesite tip vozila:");

        String tipVozila = scan.next();

        switch (tipVozila) {

            case "Motocikl":

                System.out.println(
                        tipVozila + " na " + predjeniPut + " km potroši " + (predjeniPut * 5 / 100) + " litara goriva");

                break;

            case "Automobil":

                System.out.println(
                        tipVozila + " na " + predjeniPut + " km potroši " + (predjeniPut * 7 / 100) + " litara goriva");

                break;

            case "Kombi":

                System.out.println(
                        tipVozila + " na " + predjeniPut + " km potroši " + (predjeniPut * 11 / 100) + " litara goriva");

                break;

            case "Kamion":

                System.out.println(
                        tipVozila + " na " + predjeniPut + " km potroši " + (predjeniPut * 15 / 100) + " litara goriva");

                break;

            default:

                System.out.println("Uneli ste pogrešan tip vozila.");

                break;

        }

    }

}
