package services;

import models.Contrato;
import models.Parcela;

public class ContratoService {

	private ServicoPagamentoOnline servicoPagamentoOnline;
	
	public ContratoService(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}
	
	public void processarContrato(Contrato contrato, int parcelas) {
		double parcelaBase = contrato.getValorTotal() / parcelas;
		
		for(int i = 1; i <= parcelas; i++) {
			double parcelaAtualizada = parcelaBase + servicoPagamentoOnline.calcularJuros(parcelaBase, i);
			double parcelaTotal = parcelaAtualizada + servicoPagamentoOnline.calcularTaxa(parcelaAtualizada);
			
			contrato.getParcelas().add(new Parcela(i, parcelaTotal));
		}
	}
}
