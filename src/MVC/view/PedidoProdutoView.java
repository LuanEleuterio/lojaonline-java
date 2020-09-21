package MVC.view;

public class PedidoProdutoView {
	
	public void mostraPedidoProduto(int idPedProd, int quantidade, int idProduto, int idPedido) {
		System.out.println();
		System.out.println("Id: "+idPedProd);
		System.out.println("Quantidade: "+quantidade);
		System.out.println("Id Produto: "+idProduto+ " | Id Pedido: "+idPedido);
	}
}
