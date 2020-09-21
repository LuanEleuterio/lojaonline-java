package MVC.controller;

import MVC.model.PedidoProdutoModel;
import MVC.view.PedidoProdutoView;

public class PedidoProdutoController {
	PedidoProdutoModel model;
	PedidoProdutoView view;
	
	public PedidoProdutoController(PedidoProdutoModel model, PedidoProdutoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void insereIdProdPed(int id) {
		model.setIdPedProd(id);
	}
	
	public void insereQuantidade(int qtd) {
		model.setQuantidade(qtd);
	}
	
	public void insereIdProduto(int id) {
		model.setIdProduto(id);
	}
	
	public void insereIdPedido(int id) {
		model.setIdPedido(id);
	}
	
	public void overView() {
		view.mostraPedidoProduto(model.getIdPedProd(), model.getQuantidade(), model.getIdProduto(), model.getIdPedido());
	}
}
