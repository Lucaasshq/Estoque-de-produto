public class Usuario {

    public static void main(String[] args) {

        EstoqueProduto est = new EstoqueProduto();

        est.adicionarProduto(1L, "Produto A", 5.0, 10);
        est.adicionarProduto(2L, "Produto B", 10.0, 5);
        est.adicionarProduto(3L, "Produto C", 15.0, 2);

        est.exibirProduto();

        System.out.println("Valor total do estoque R$ " + est.calcularValorTotal());
        System.out.println("Produto mais caro: " + est.obterProdutoCaro());
    }
}
