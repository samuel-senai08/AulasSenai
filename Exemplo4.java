package Aulajava16;

import java.util.Scanner;

public class Exemplo4 {
	public static void main(String[] args) {
		double a;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		a = ler.nextDouble();
		String mensagem = a % 5 == 0 ? " Multiplo de 5" : " Não é multiplo de 5";
		ler.close();
		System.out.println("O numero " + a + mensagem);
	}
}
