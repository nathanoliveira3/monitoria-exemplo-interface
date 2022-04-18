package services;

public interface ServicoPagamentoOnline {
	double calcularTaxa(double valor);
	
	double calcularJuros(double valor, int parcela);
}
