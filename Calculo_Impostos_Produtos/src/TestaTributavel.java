public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000.0);
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        double tributosContaCorrente = contaCorrente.calculaTributos();
        double tributosSeguroDeVida = seguroDeVida.calculaTributos();

        System.out.println("Tributos da Conta Corrente: R$" + tributosContaCorrente);
        System.out.println("Tributos do Seguro de Vida: R$" + tributosSeguroDeVida);
    }
}