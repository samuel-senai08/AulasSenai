package AulaJava15;

import java.util.Scanner;

public class CustoViagem {

	public static void main(String[] args) {
		//DECLARACAO DE VARIAVEIS
		double valLitro, distanciaKM, consumo, totalLitros, totalGastos;
		
		//ENTRADA DE DADOS
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor do litro de combustivel (RS): ");
		valLitro = ler.nextDouble();
		
		System.out.println("Informe a distancia percorrida (Km): ");
		distanciaKM = ler.nextDouble();
		
		System.out.println("Informe o consumo médio (Km/L): ");
		consumo = ler.nextDouble();
		
		//PROCESSADOR
		totalLitros = distanciaKM/consumo;
		totalGastos = totalLitros*valLitro;
		
		//SAIDA
		System.out.println("O total de litros consumidos é: "
		+ totalLitros + "Litros");
		System.out.println("O total gasto é RS:" + totalGastos);
		ler.close();
		
				
		
	}
	
}
