import java.util.Arrays;

public class SortiranjeNIzaMetodama {
    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 4, 56, 6};
        System.out.println("Niz je bio :" + Arrays.toString(niz));
        sortirajNiz(niz);
        System.out.println("Sortiran niz je: " + Arrays.toString(niz));
    }

    public static void sortirajNiz(int[] niz) {
        for (int i = 0; i < niz.length - 1; i++)
            for (int j = 0; j < niz.length - 1; j++) {
                if (niz[i] > niz[i + 1]) {
                    int privremeno = niz[i];
                    niz[i] = niz[i + 1];
                    niz[i + 1] = privremeno;
                }
            }
    }
}
