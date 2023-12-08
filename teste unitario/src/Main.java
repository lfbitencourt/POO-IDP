// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private Venda venda;
    private ItemVenda item1;
    private ItemVenda item2;

    @Before
    public void setUp() {
        venda = new Venda();
        venda.setCliente("Cliente Exemplo");
        venda.setValorDesconto(10.0);

        item1 = new ItemVenda("Item 1", 50.0, 2); // Valor total 100.0
        item2 = new ItemVenda("Item 2", 30.0, 3); // Valor total 90.0
        List<ItemVenda> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item2);

        venda.setItens(itens);
    }

    @Test
    public void testCalcularValorTotalVenda() {
        double valorEsperado = 190.0; // 100.0 + 90.0
        assertEquals(valorEsperado, venda.calcularValorTotal(), 0.01);
    }

    @Test
    public void testAplicarDesconto() {
        double valorComDesconto = 180.0; // 190.0 - 10.0
        venda.aplicarDesconto();
        assertEquals(valorComDesconto, venda.getValorVenda(), 0.01);
    }

    @Test
    public void testAdicionarItemVenda() {
        ItemVenda item3 = new ItemVenda("Item 3", 20.0, 1); // Valor total 20.0
        venda.adicionarItem(item3);
        double valorEsperado = 210.0; // 190.0 + 20.0
        assertEquals(valorEsperado, venda.calcularValorTotal(), 0.01);
    }

}