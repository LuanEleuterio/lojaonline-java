package MVC.controller;

import MVC.model.EnderecoModel;
import MVC.view.EnderecoView;

public class EnderecoController {
	EnderecoModel model;
	EnderecoView view;
	
	public EnderecoController(EnderecoModel model, EnderecoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void insereRuaNumero(String nome, String numero) {
		model.setRua(nome);
		model.setNumeroCasa(numero);
	}
	
	public void insereBairro(String bairro) {
		model.setBairro(bairro);
	}
	
	public void insereCep(String cep) {
		model.setCep(cep);
	}
	
	public void insereCidade(String cidade) {
		model.setCidade(cidade);
	}
	
	public void insereUf(String uf) {
		model.setUf(uf);
	}
	
	public void insereComplemento(String complemento) {
		model.setComplemento(complemento);
	}
	
	public void overView() {
		view.mostraEndereco(model.getRua(), model.getNumeroCasa(), model.getBairro(), model.getCep(), model.getCidade(), model.getUf(), model.getComplemento());
	}
}
