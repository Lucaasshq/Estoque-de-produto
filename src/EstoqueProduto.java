import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

    private Map<Long, Produto> estoqueprodutosMap;

    public EstoqueProduto() {
        estoqueprodutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long codigo, String nome, double preco, int quantidade) {
        estoqueprodutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto() {
        System.out.println(estoqueprodutosMap);
    }

    public double calcularValorTotal() {
        double total = 0;
        if (!estoqueprodutosMap.isEmpty()) {
            for (Produto p : estoqueprodutosMap.values()) {
                total += p.getQuantidade() * p.getPreco();
            }
        }
        return total;
    }

    public Produto obterProdutoCaro() {
        Produto produtoCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueprodutosMap.isEmpty()) {
            for (Produto p : estoqueprodutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoCaro = p;
                }
            }
        }
        return produtoCaro;
    }
}
