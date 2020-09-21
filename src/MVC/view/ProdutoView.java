package MVC.view;

public class ProdutoView {
	
	public void mostraProduto(String nome, Double preco, int qtd, String descricao) {
		System.out.println();
		System.out.println("Produto: "+nome+ " | Preço: R$"+preco);
		System.out.println("Quantidade: "+qtd+"un");
		System.out.println("Descrição: " +descricao);
	}
}
