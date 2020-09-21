package MVC.model;

public class PedidoModel {
	private int idPedido;
	private String statusPedido;
	private Double valorTotal;
	private String dtSolicitado;
	private int notaFiscal;
	private int idCliente;
	private int idPedProd;
	
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public String getStatusPedido() {
		return statusPedido;
	}
	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getDtSolicitado() {
		return dtSolicitado;
	}
	public void setDtSolicitado(String dtSolicitado) {
		this.dtSolicitado = dtSolicitado;
	}
	public int getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(int notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdPedProd() {
		return idPedProd;
	}
	public void setIdPedProd(int idPedProd) {
		this.idPedProd = idPedProd;
	}
	
	
	
	
}
