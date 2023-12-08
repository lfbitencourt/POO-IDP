import java.util.ArrayList;
import java.util.List;

public class Venda {
    private String cliente;
    private List<ItemVenda> itens;
    private double valorVenda;
    private double valorDesconto;

    public Venda() {
        this.itens = new ArrayList<>();
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public String getCliente() {
        return cliente;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (ItemVenda item : itens) {
            total += item.calcularValorTotal();
        }
        valorVenda = total;
        return total;
    }

    public void aplicarDesconto() {
        valorVenda -= valorDesconto;
        if (valorVenda < 0) {
            valorVenda = 0;
        }
    }

    public void adicionarItem(ItemVenda item) {
        this.itens.add(item);
        calcularValorTotal();
    }
}