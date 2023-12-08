public class ItemVendaTest {
    private ItemVenda item;

    @Before
    public void setUp() {
        item = new ItemVenda("Item Exemplo", 100.0, 5);
    }

    @Test
    public void testGetDescricao() {
        assertEquals("Item Exemplo", item.getDescricao());
    }

    @Test
    public void testGetValorUnitario() {
        assertEquals(100.0, item.getValorUnitario(), 0.01);
    }

    @Test
    public void testGetQuantidade() {
        assertEquals(5.0, item.getQuantidade(), 0.01);
    }
}