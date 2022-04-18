package main;

import java.util.Scanner;

import models.Contrato;
import models.Parcela;
import services.ContratoService;
import services.PaypalService;
import services.StoneService;

public class Program {
	public static void main(String[] args) {
		/*
		 * Uma empresa deseja automatizar o processamento de seus contratos. 
		 * O processamento de um contrato consiste em gerar as parcelas a serem 
		 * pagas para aquele contrato, com base no número de meses desejado.
		 * A empresa utiliza um serviço de pagamento online para realizar o 
		 * pagamento das parcelas. Os serviços de pagamento online tipicamente 
		 * cobram um juro mensal, bem como uma taxa por pagamento. Por enquanto, 
		 * o serviço contratado pela empresa é o do Paypal, que aplica juros simples
		 * de 1% a cada parcela, mais uma taxa de pagamento de 2%.Fazer um programa para
		 * ler os dados de um contrato (número do contrato e valor total do contrato). 
		 * Em seguida, o programa deve ler o número de parcelas do contrato, e daí gerar 
		 * os registros de parcelas a serem pagas. Mostrar os dados das parcelas na tela.
		 */	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o número do contrato: ");
		Integer numero = scan.nextInt();
		
		System.out.println("Informe o valor do contrato: ");
		Double valorTotal = scan.nextDouble();
		
		Contrato contrato = new Contrato(numero, valorTotal);
		
		System.out.println("Informe o número de parcela: ");
		Integer parcelas = scan.nextInt();
		
		ContratoService cs = new ContratoService(new StoneService());
		cs.processarContrato(contrato, parcelas);
		
		for (Parcela parcela : contrato.getParcelas()) {
			System.out.println(parcela);
		}
		
		scan.close();		
	}
}
