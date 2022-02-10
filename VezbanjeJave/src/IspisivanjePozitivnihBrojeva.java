import java.util.Scanner;

public class IspisivanjePozitivnihBrojeva {
    public static void main(String[] args) {
        //Napisati program koji ucitava N brojeva od korisnika i ispisuje koliko je pozitivnih brojeva uneo*/
        System.out.print("Unesite neki broj: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int brojac=0;

        if (n>0){
            for (int i = 0; i<n; i++)
                brojac ++;
        }
        System.out.println("Broj pozitivnih brojeva je : " + brojac);
    }

}

