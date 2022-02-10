import java.util.Arrays;
import java.util.Scanner;

public class VezbanjeNIzovaIMetode {
    public static void main(String[] args) {

      /* int [] brojevi={1,3,5,6,7,10,5,9,3,17};
        Scanner scanner= new Scanner (System.in);
        System.out.println("Unesite poziciju elementa u nizu:");
        int pozicije=scanner.nextInt();
        System.out.println("Unesite novu vrednost  elementa na poziciji" + pozicije);
        int vrednostElemnta=scanner.nextInt();
        brojevi [pozicije]= vrednostElemnta;
        System.out.println ("Niz sa zmenjenim elementima je" + Arrays.toString (brojevi));

        int[] niz1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] niz2 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        System.out.println("Niz sa zmenjenim elementima je " + Arrays.toString(niz1));
        System.out.println("Niz sa zmenjenim elementima je " + Arrays.toString(niz2));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite poziciju elementa u nizu:");
        int pozicija = scanner.nextInt();
        int temp = niz1[pozicija];

        niz1[pozicija] = niz2[pozicija];
        niz2[pozicija] = temp;
        System.out.println("Niz sa zmenjenim elementima je" + Arrays.toString(niz1));
        System.out.println("Niz sa zmenjenim elementima je" + Arrays.toString(niz2));


        int[] niz = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        for(int i=0; i<niz.length; i++){
            System.out.print(niz[i] +",");
        }



        int[] niz = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        for (int i = niz.length-1; i >=0; i--) {
            System.out.print(niz[i] + ",");
        }


        int a=10;
        int b=2;
        stampajRezultate(a,b);
        }
    public static void stampajRezultate (int a, int b){
        System.out.println(" Zbir brojeva: "+ (a+b));
        System.out.println("Razlika brojeva: "+(a-b));
        System.out.println("Proizvod brojeva: "+ (a*b));
        System.out.println(" Kolicnik brojeva: "+ (a/b));

       */

        stampajApsolutnuVrednost(-10);
    }

    public static void stampajApsolutnuVrednost(int broj) {
        if (broj < 0) {
            System.out.println("Apsolutni broj je " + -broj);
        } else {
            System.out.println("Apsolutni broj je " + broj);
        }
    }
}

