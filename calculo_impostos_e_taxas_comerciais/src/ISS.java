public class ISS {
    public static final double ALIQUOTA = 0.046;

    public static double calcularImposto(double valor) {
        return valor * ALIQUOTA;
    }
}