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
		 * pagas para aquele contrato, com base no n�mero de meses desejado.
		 * A empresa utiliza um servi�o de pagamento online para realizar o 
		 * pagamento das parcelas. Os servi�os de pagamento online tipicamente 
		 * cobram um juro mensal, bem como uma taxa por pagamento. Por enquanto, 
		 * o servi�o contratado pela empresa � o do Paypal, que aplica juros simples
		 * de 1% a cada parcela, mais uma taxa de pagamento de 2%.Fazer um programa para
		 * ler os dados de um contrato (n�mero do contrato e valor total do contrato). 
		 * Em seguida, o programa deve ler o n�mero de parcelas do contrato, e da� gerar 
		 * os registros de parcelas a serem pagas. Mostrar os dados das parcelas na tela.
		 */	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o n�mero do contrato: ");
		Integer numero = scan.nextInt();
		
		System.out.println("Informe o valor do contrato: ");
		Double valorTotal = scan.nextDouble();
		
		Contrato contrato = new Contrato(numero, valorTotal);
		
		System.out.println("Informe o n�mero de parcela: ");
		Integer parcelas = scan.nextInt();
		
		ContratoService cs = new ContratoService(new StoneService());
		cs.processarContrato(contrato, parcelas);
		
		for (Parcela parcela : contrato.getParcelas()) {
			System.out.println(parcela);
		}
		
		scan.close();		
	}
}
