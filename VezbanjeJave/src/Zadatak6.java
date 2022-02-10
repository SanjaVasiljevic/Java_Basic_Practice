import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        /*Učitati 2 razlicita cijela broja. Ako su oba parna podijeliti veći sa manjim brojem.
                Ako su oba neparna od većeg oduzeti manji broj. Inače sabrati ta dva broja.**/
        Scanner input = new Scanner (System.in);
        int a,b;
        double rezultat;

        System.out.print(" Prvi broj:");
        a = input.nextInt();

        System.out.print(" Drugi broj:");
        b = input.nextInt();
        while(b==a){
            System.out.print(" Brojevi moraju biti različiti. Drugi broj:");
            b = input.nextInt();
        }
        if((a % 2 == 0) && (b % 2 == 0)){
            if(a> b && b!= 0){
                rezultat=a/b;
                System.out.print(" Količnik parnih brojeva je: " + rezultat +" \n");
            }
            else if (b> a && a!=0){
                rezultat=b/a;
                System.out.print(" Količnik parnih brojeva je: " + rezultat +" \n");
            }
            else
                System.out.print(" Nije moguće dijeliti sa 0." +" \n");
        }
        else if ((a % 2 == 1)&& (b % 2 == 1)){
            if(a> b){
                rezultat=a-b;
                System.out.print(" Razlika neparnih brojeva je: " + rezultat +" \n");
            }
            else{
                rezultat=b-a;
                System.out.print(" Razlika neparnih brojeva je: " + rezultat +" \n");
            }
        }
        else{
            rezultat=a+b;
            System.out.print(" Zbir parnog i neparnog je: " + rezultat +" \n");
        }

    }

}
