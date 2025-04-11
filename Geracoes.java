package Aulajava7;

import java.util.Scanner;

public class Geracoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int AnoDeNascimento;
		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva seu ano de nascimento");
		AnoDeNascimento = (int) ler.nextDouble();
		if (AnoDeNascimento >=1946 && AnoDeNascimento <=1964) {
		System.out.println ("Geração Baby Boomer");
		}
		else if (AnoDeNascimento >=1965 && AnoDeNascimento <=1980) {
		System.out.println ("Geração X");
		}
		else if (AnoDeNascimento >=1981 && AnoDeNascimento <=1996) {
		System.out.println ("Millennials ou Geração Y");
		}
		else if (AnoDeNascimento >=1997 && AnoDeNascimento <=2009) {
		System.out.println ("Geração Z");
		}
		else if (AnoDeNascimento >=2010 && AnoDeNascimento <=2025) {
		System.out.println ("Geração Z");
		}
		else if (AnoDeNascimento <=2026) {
		System.out.println ("Nem nasceu");
		}
		ler.close();
		}
		}
		
