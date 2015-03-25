package Almoxarifado;

public class Ordemcompra {

	private boolean ordemcompra;
	private int quantpedida;
	private String peca;
	private Peca peca_agr;
	public Peca getPeca_agr() {
		return peca_agr;
	}
	public void setPeca_agr(Peca peca_agr) {
		this.peca_agr = peca_agr;
	}
	public boolean isOrdemcompra() {
		return ordemcompra;
	}
	public void setOrdemcompra(boolean ordemcompra) {
		this.ordemcompra = ordemcompra;
	}
	public int getQuantpedida() {
		return quantpedida;
	}
	public void setQuantpedida(int quantpedida) {
		this.quantpedida = quantpedida;
	}
	public String getPeca() {
		return peca;
	}
	public void setPeca(String peca) {
		this.peca = peca;
	}
	
}
