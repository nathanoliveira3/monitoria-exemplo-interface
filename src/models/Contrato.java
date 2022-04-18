package models;

import java.util.ArrayList;
import java.util.List;

public class Contrato {
	private Integer numero;
	private Double valorTotal;
	
	List<Parcela> parcelas = new ArrayList<>();	
	
	public Contrato() {}

	public Contrato(Integer numero, Double valorTotal) {		
		this.numero = numero;
		this.valorTotal = valorTotal;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}

}
