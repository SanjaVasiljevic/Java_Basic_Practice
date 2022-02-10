import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
       // Napisati zadatak koji za uneti dvocifreni broj napise koja je prva cifra, a koja druga
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite dvocifren broj brojeve: ");
        int broj= sc.nextInt();

        if(broj < 10 || broj > 99)
        {
            System.out.println("Greska! Broj mora biti dvocifren.");
            return;
        }

        int prvi;
        prvi = broj / 10;
        System.out.println("Prvi broj je " + prvi);

        int drugi;
        drugi = broj % 10;
        System.out.println("Drugi broj je " + drugi);

    }
}
