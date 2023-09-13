public class Main {
    public static void main(String[] args) {

        OperacaoComercial produto = new OperacaoComercial("Produto", 100.0);
        OperacaoComercial servico = new OperacaoComercial("Serviço", 1000.0);

        // Cálculo de impostos e taxas
        double totalProduto = produto.getValor() + ICMS.calcularImposto(produto.getValor()) + IPI.calcularImposto(produto.getValor());
        double totalServico = servico.getValor() + ISS.calcularImposto(servico.getValor());

        // Impressão dos resultados
        System.out.println("Produto:");
        produto.imprimir();
        System.out.println("ICMS: " + ICMS.calcularImposto(produto.getValor()));
        System.out.println("IPI: " + IPI.calcularImposto(produto.getValor()));
        System.out.println("Total: " + totalProduto);
        System.out.println();
        System.out.println("Serviço:");
        servico.imprimir();
        System.out.println("ISS: " + ISS.calcularImposto(servico.getValor()));
        System.out.println("Total: " + totalServico);


    }

}