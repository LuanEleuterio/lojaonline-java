package MVC.view;

public class EnderecoView {
	
	public void mostraEndereco(String rua, String numeroCasa, String bairro, String cep, String cidade, String uf, String complemento) {
		System.out.println("");
		System.out.println("Rua: "+rua+ "numero: "+numeroCasa);
		System.out.println("Bairro: "+bairro+" CEP: "+cep);
		System.out.println("Cidade: "+cidade+" UF: "+uf);
		System.out.println("Complemento: "+complemento);
	}
}
