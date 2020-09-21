package MVC.controller;
import MVC.model.ClienteModel;
import MVC.view.ClienteView;

public class ClienteController {
	ClienteModel model;
	ClienteView view;
	
	public ClienteController(ClienteModel model, ClienteView view) {
		this.model = model;
		this.view = view;
	}
	
	public void insereNome(String nome) {
		model.setNome(nome);
	}
	public void insereCpf(String cpf) {
		model.setCpf(cpf);
	}
	public void insereEmail(String email) {
		model.setEmail(email);
	}
	public void insereDtNasc(String dtnasc) {
		model.setDtNasc(dtnasc);
	}
	
	public void overView() {
		view.mostraDados(model.getNome(), model.getCpf(), model.getEmail(), model.getDtNasc());
	}
}
