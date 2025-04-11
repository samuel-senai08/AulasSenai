package AulaJava18;

import java.util.Scanner;

	public class Torneio {
		public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
	
			int par = 0;
			int impar = 0;
	

			System.out.println("Digite 10 numeros");
	
			for ( int i = 1; i <= 10; i++) {
				System.out.print("Número " + i + ": ");
				int numero = ler.nextInt();
		
				if(numero % 2 == 0) {
					par++;
				} else {
					impar++;
				}
		
			}
	
			System.out.println("Quantidade de numeros pares: " + par);
			System.out.println(" Quantidade de numeros impares: " + impar);
	
			if ( par > impar) {
				System.out.println(" Os PARES venceram!");
				} else if (impar > par) {
					System.out.println("Os IMPARES venceram!");
					} else { 
					System.out.println("EMPATE entre pares e impares");
				}
				ler.close();
		}
	}