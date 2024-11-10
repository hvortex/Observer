public class NotificacaoDeEstoque {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook");
        EstoqueProduto estoqueProduto = new EstoqueProduto(produto, 0);

        DepartamentoVendas vendas = new DepartamentoVendas();
        DepartamentoMarketing marketing = new DepartamentoMarketing();
        DepartamentoCompras compras = new DepartamentoCompras();

        estoqueProduto.registrarObservador(vendas);
        estoqueProduto.registrarObservador(marketing);
        estoqueProduto.registrarObservador(compras);

        System.out.println("Reabastecendo o estoque do produto...");
        estoqueProduto.reabastecer(10);
    }
}