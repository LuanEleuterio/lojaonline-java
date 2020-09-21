package MVC.controller;

import MVC.model.ProdutoModel;
import MVC.view.ProdutoView;

public class ProdutoController {
	ProdutoModel model;
	ProdutoView view;
	
	public ProdutoController(ProdutoModel model, ProdutoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void insereNome(String nome) {
		model.setNome(nome);
	}
	
	public void inserePreco(Double preco) {
		model.setPreco(preco);
	}
	
	public void insereQtd(int qtd) {
		model.setQtd(qtd);
	}
	
	public void insereDescricao(String descricao) {
		model.setDescricao(descricao);
	}
	
	public void overView() {
		view.mostraProduto(model.getNome(), model.getPreco(), model.getQtd(), model.getDescricao());
	}
}
