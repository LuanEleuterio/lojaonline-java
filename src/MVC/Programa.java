package MVC;

import MVC.controller.ClienteController;
import MVC.controller.EnderecoController;
import MVC.controller.PedidoController;
import MVC.controller.PedidoProdutoController;
import MVC.controller.ProdutoController;
import MVC.controller.TelefoneController;
import MVC.model.ClienteModel;
import MVC.model.EnderecoModel;
import MVC.model.PedidoModel;
import MVC.model.PedidoProdutoModel;
import MVC.model.ProdutoModel;
import MVC.model.TelefoneModel;
import MVC.view.ClienteView;
import MVC.view.EnderecoView;
import MVC.view.PedidoProdutoView;
import MVC.view.PedidoView;
import MVC.view.ProdutoView;
import MVC.view.TelefoneView;

public class Programa {

	public static void main(String[] args) {
		ClienteModel cm1 = new ClienteModel();
		ClienteView cv1 = new ClienteView();
		
		TelefoneModel tm1 = new TelefoneModel();
		TelefoneView tv1 = new TelefoneView();
		
		EnderecoModel em1 = new EnderecoModel();
		EnderecoView ev1 = new EnderecoView();
		
		ProdutoModel pm1 = new ProdutoModel();
		ProdutoView pv1 = new ProdutoView();
		
		PedidoProdutoModel ppm1 = new PedidoProdutoModel();
		PedidoProdutoView ppv1 = new PedidoProdutoView();
		
		PedidoModel pdm1 = new PedidoModel();
		PedidoView pdv1 = new PedidoView();
		
		ClienteController c1 = new ClienteController(cm1, cv1);
		TelefoneController t1 = new TelefoneController(tm1, tv1);
		EnderecoController  e1 = new EnderecoController(em1, ev1);
		ProdutoController p1 = new ProdutoController(pm1, pv1);
		PedidoProdutoController pp1 = new PedidoProdutoController(ppm1, ppv1);
		PedidoController pd1 = new PedidoController(pdm1, pdv1);
		
		c1.insereNome("Luan Eleuterio");
		c1.insereCpf("000.000.000-99");
		c1.insereEmail("example@brazil.com");
		c1.insereDtNasc("30/07/1998");
		
		t1.insereDdd("11");
		t1.insereNumero("9999-9998");
		
		e1.insereRuaNumero("Rua Francisco Sobreira", "467");
		e1.insereCep("04917-120");
		e1.insereBairro("Jardim Souza");
		e1.insereCidade("São Paulo");
		e1.insereUf("SP");
		e1.insereComplemento("Perto ao hidrante");
		
		p1.insereNome("Coca-Cola");
		p1.inserePreco(6.99);
		p1.insereQtd(5);
		p1.insereDescricao("Gela que é uma beleza");
		
		pp1.insereIdProdPed(1);
		pp1.insereQuantidade(5);
		pp1.insereIdPedido(1);
		pp1.insereIdProduto(2);
		
		pd1.insereIdPedido(1);
		pd1.insereStatus("Em andamento");
		pd1.insereValorTotal(2000.00);
		pd1.insereDtSolicitado("21/09/2020");		
		pd1.insereNotaFiscal(123456789);
		pd1.insereIdCliente(1);
		pd1.insereIdPedProd(1);
		
		c1.overView();
		t1.overView();
		e1.overView();
		p1.overView();
		pp1.overView();
		pd1.overView();
		
	}

}
