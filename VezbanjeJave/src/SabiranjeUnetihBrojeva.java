import java.util.Scanner;

public class SabiranjeUnetihBrojeva {
    public static void main(String[] args) {
       /* Napisati program koji sabira brojeve od 0 do broja koji ste uneli na tastaturi i prikazuje sumu (ne u svakom koraku vec samo na na kraju)
        Primer: Zbir svih brojeva od 0 do 3 je 6*/
        System.out.print("Unesite neki broj: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int suma=0;
        for (int i=0; i<=n; i++){
            suma= suma+i;
        }
        System.out.println("Suma svih brojeva do "+n + " je "+suma);

    }
}
