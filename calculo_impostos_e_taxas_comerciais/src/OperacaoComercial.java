public class OperacaoComercial {
    protected String nome;
    protected double valor;

    public OperacaoComercial(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    public String getNome() { return nome; }
    public double getValor() { return valor; }
    public void setNome(String nome) { this.nome = nome; }
    public void setValor(double valor) { this.valor = valor; }
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Valor: " + valor);
    }
}