package MVC.controller;

import MVC.model.TelefoneModel;
import MVC.view.TelefoneView;

public class TelefoneController {
	TelefoneModel model;
	TelefoneView view;
	
	public TelefoneController(TelefoneModel model, TelefoneView view) {
		this.model = model;
		this.view = view;
	}
	
	public void insereDdd(String ddd) {
		model.setDdd(ddd);
	}
	
	public void insereNumero(String numero) {
		model.setNumero(numero);
	}
	
	public void overView() {
		view.mostraTelefone(model.getDdd(), model.getNumero());
	}
}
