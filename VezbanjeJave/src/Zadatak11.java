import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
        //Unetti neki trocifreni broj I naci zbir svih njegovih brojeva;
        Scanner sc= new Scanner(System.in);
        System.out.println("Uneste neki trocifreni broj: ");
        int broj= sc.nextInt();
        System.out.println("Uneli ste broj: "+broj);
        int jedinica= broj%10;
        int desetica= (broj/10)%10;
        int stotica=broj/100;
        int zbir= jedinica+desetica+stotica;
        System.out.println("Zbir bojeva vaseg unetog broja je: "+ zbir);

    }
}
