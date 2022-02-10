public class A4UInche {
    public static void main(String[] args) {
       // Napisati program koji formatira A4 (210X297) u incima.
        final double CM_PO_INCU = 2.54;
        double sirinaPapira = 21.0;
        double visinaPapira = 29.70;
        double sirinaInci = sirinaPapira / CM_PO_INCU;
        double visinaInci = visinaPapira / CM_PO_INCU;
        System.out.println(" A4 (21x29.7) format u incima je A4 (" + sirinaInci + " X " + visinaInci + ")");

    }
}
