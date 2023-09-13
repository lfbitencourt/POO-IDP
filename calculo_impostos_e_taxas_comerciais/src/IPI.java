public class IPI {
    public static final double ALIQUOTA = 0.25;

    public static double calcularImposto(double valor) {
        return valor * ALIQUOTA;
    }
}