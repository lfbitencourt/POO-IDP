public class ICMS {
    private static final double ALIQUOTA = 0.17;

    public static double calcularImposto(double valor) {
        return valor * ALIQUOTA;
    }
}