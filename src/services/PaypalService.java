package services;

public class PaypalService implements ServicoPagamentoOnline {

	private static final double TAXA = 0.02;
	private static final double JUROS_MENSAL = 0.01;
	
	@Override
	public double calcularTaxa(double valor) {
		return valor * TAXA;
	}

	@Override
	public double calcularJuros(double valor, int parcela) {
		return valor * parcela * JUROS_MENSAL;
	}

}
