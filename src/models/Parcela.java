package models;

public class Parcela {
	private Integer numeroParcela;
	private Double valor;
	
	public Parcela() {}

	public Parcela(Integer numeroParcela, Double valor) {
		super();
		this.numeroParcela = numeroParcela;
		this.valor = valor;
	}

	public Integer getNumeroParcela() {
		return numeroParcela;
	}

	public void setNumeroParcela(Integer numeroParcela) {
		this.numeroParcela = numeroParcela;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Parcela - " + numeroParcela + ", valor=" + valor + " .";
	}
}
