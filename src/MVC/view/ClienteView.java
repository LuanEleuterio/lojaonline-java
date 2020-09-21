package MVC.view;

public class ClienteView {
	
	public void mostraDados(String nome, String cpf, String email, String dtNasc) {
		System.out.println("Nome: "+ nome + " | CPF: "+cpf);
		System.out.println("Email: "+ email + " | Data Nasc: "+dtNasc);
	};
}
