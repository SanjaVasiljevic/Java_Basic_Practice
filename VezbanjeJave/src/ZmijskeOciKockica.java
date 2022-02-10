public class ZmijskeOciKockica {
    public static void main(String[] args) {
/*        Napisati program koji simulira eksperiment bacanja dve kocke za igru i određuje koliko puta treba
        baciti dve kocke dok na obe kocke ne padne istovremeno broj 1. (Inače, kockarski termin za ovaj ishod je
    „zmijske oči”.)
        Program treba da prikaže vrednosti kocki pri svakom bacanju i da na kraju prikaže ukupan broj bacanja kocki.*/
        int brojBacanja=0;
        while (true){
            int kockica1=(int)Math.ceil(Math.random()*6);
            int kockica2=(int)Math.ceil(Math.random()*6);
            brojBacanja++;
            System.out.println(kockica1+"-"+kockica1);
            if (kockica1==1 && kockica2==1){
                System.out.println("Poslednjim bacanjem dobili smo zmijske oci.");
                System.out.println("Broj bacanja do ovog poteza: "+ brojBacanja);
                break;
            }
        }


       // drugi nacin :
   /*     for (brojBacanja = 0; ; brojBacanja++) {
            int kockica1 = (int) Math.ceil(Math.random() * 6);
            int kockica2 = (int) Math.ceil(Math.random() * 6);
            brojBacanja++;
            System.out.println(kockica1 + "-" + kockica1);
            if (kockica1 == 1 && kockica2 == 1) {
                System.out.println("Poslednjim bacanjem dobili smo zmijske oci.");
                System.out.println("Broj bacanja do ovog poteza: " + brojBacanja + 1);
                break;
            }
*/
        }
}
