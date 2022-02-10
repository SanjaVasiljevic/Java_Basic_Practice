package Arreys;

public class Zadatak1 {
    public static void main(String[] args) {
        // u ovom nizu brojeva ispisite koji je najmanji broj

        int[] nizBrojeva = {3, 34, 8, 1, 5 , 67};
        int b=nizBrojeva.length;
        for ( int i=0; i<nizBrojeva.length; i++){
            if ( b> nizBrojeva[i]){
                b=nizBrojeva[i];
            }
        }
        System.out.println(" Najmanji broj u nizu je "+ b );
    }
}


