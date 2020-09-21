package MVC.view;

public class PedidoView {
	
	public void mostraPedido(int idPedido, String statusPedido, Double valorTotal, String dtSolicitado, int notaFiscal, int idCliente, int idPedProd) {
		System.out.println();
		System.out.println("ID: "+idPedido+ " | Status: "+statusPedido);
		System.out.println("Valor total: R$"+ valorTotal+ " | Data Solicitação: "+dtSolicitado);
		System.out.println("Nota fiscal:"+notaFiscal);
		System.out.println("Id cliente: "+idCliente+" | Id PedProd: "+idPedProd);
	}
}
