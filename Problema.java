package AulaJava15;


import java.util.Scanner;


public class Problema {
	public static void main(String[] args) {
	//DECLARANDO VARIAVEIS
		double ângulo,radiano =0;
		
		//CHAMAR O SCANNER
		Scanner ler = new Scanner(System.in);
		System.out.println("informe o ângulo");
		ângulo = ler.nextDouble();
		
	
		
		//PROCESSAMENTO
		
		Math.atan (radiano);
		radiano = ((ângulo *3.14)/180);
		//SAÍDA
		System.out.println("A conversão em de ângulo para radiano é:" +radiano);
		ler.close();

		
		
	}
}
