package MVC.controller;

import MVC.model.PedidoModel;
import MVC.view.PedidoView;

public class PedidoController {
	PedidoModel model;
	PedidoView view;
	
	public PedidoController(PedidoModel model, PedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void insereIdPedido(int id) {
		model.setIdPedido(id);
	}
	
	public void insereStatus(String status) {
		model.setStatusPedido(status);
	}
	
	public void insereValorTotal(Double valor) {
		model.setValorTotal(valor);
	}
	
	public void insereDtSolicitado(String data) {
		model.setDtSolicitado(data);
	}
	
	public void insereNotaFiscal(int nota) {
		model.setNotaFiscal(nota);
	}
	
	public void insereIdCliente(int cliente) {
		model.setIdCliente(cliente);
	}
	
	public void insereIdPedProd(int id) {
		model.setIdPedProd(id);
	}
	
	public void overView() {
		view.mostraPedido(model.getIdPedido(), model.getStatusPedido(), model.getValorTotal(), model.getDtSolicitado(), model.getNotaFiscal(), model.getIdCliente(), model.getIdPedProd());
	}
	
}
