import java.util.Scanner;

public class FarenhajtovihStepeniUCelzijusove {
    public static void main(String[] args) {
       // 1.	Pretvaranje Farenhajtovih stepeni u Celzijusove;
        int f;  // farenhajtovi stepeni
        int c;   // celzijusovi stepeni
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko stepeni Farenhajta: ");
        f = sc.nextInt();
        c = 5 * (f - 32) / 9;
        System.out.println(f + " stepeni Farenhajta je " + c + " stepeni Celzijusa.");


    }
}
