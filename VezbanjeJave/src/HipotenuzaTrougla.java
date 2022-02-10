import java.util.Scanner;

public class HipotenuzaTrougla {
    public static void main(String[] args) {
      /*  Napisati program koji izracunava hipotenuzu pravouglog trougla ako su date dve njegove katete.
                Pored toga, program treba da prikaze vreme koje je utroseno za obavljanje zadatka.*/
        double kateta1;
        double kateta2;
        double hipotenuza;
        long pocetnoVreme;
        long zavrsnoVreme;
        long protekloVreme;

        pocetnoVreme = System.currentTimeMillis();
        System.out.println("Unesite duzinu prve katete trougla: ");
        Scanner sc = new Scanner(System.in);
        kateta1 = sc.nextInt();
        System.out.println("Unesite duzinu druge katete trougla: ");
        kateta2 = sc.nextInt();
        hipotenuza = Math.sqrt((kateta1 * kateta1) + (kateta2 * kateta2));
        System.out.println("Hipotenuza trougla za zadate katete je: " + hipotenuza);
        zavrsnoVreme = System.currentTimeMillis();
        protekloVreme = (zavrsnoVreme - pocetnoVreme) / 1000;
        System.out.println("Vreme izvrsavanja ovog programa u sekundama je : " + protekloVreme);

    }
}
