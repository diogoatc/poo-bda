package Almoxarifado;

public class Peca {
	private String upc;
	private double preco;
	private int qtdesaida;
	private int qtdeatual;
	private String numinterno;
	private Descricaopeca desc;
	private Pedido pedido;
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Descricaopeca getDesc() {
		return desc;
	}
	public void setDesc(Descricaopeca desc) {
		this.desc = desc;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtdesaida() {
		return qtdesaida;
	}
	public void setQtdesaida(int qtdesaida) {
		this.qtdesaida = qtdesaida;
	}
	public int getQtdeatual() {
		return qtdeatual;
	}
	public void setQtdeatual(int qtdeatual) {
		this.qtdeatual = qtdeatual;
	}
	public String getNuminterno() {
		return numinterno;
	}
	public void setNuminterno(String numinterno) {
		this.numinterno = numinterno;
	}
	
	
	
	
	}
	


