package AulaJava6;

import java.util.Scanner;

public class DesafioDevVida {
public static void main(String[] args) {
	//DECLARANDO VARIAVEIS
	double nota1, nota2, nota3, nota4, media;
	//CHAMAR SCANNER
	Scanner ler = new Scanner(System.in);
	System.out.println("Informe a nota 1");
	nota1 = ler .nextDouble();
	System.out.println("Informe a nota 2");
	nota2 = ler.nextDouble();
	System.out.println("Informe a nota 3");
	nota3 = ler.nextDouble();
	System.out.println("Informe a nota 4");
	nota4 = ler.nextDouble();
	ler.close();

	//PROCESSAMENTO
	media = (nota1 + nota2 +nota3 + nota4)/4;
	if (media >= 6) {
	System.out.println("aprovado");
	}
	else {
	System.out.println("reprovado");
			
			
		
			
		}
	}
	
	
    
	


	
}

