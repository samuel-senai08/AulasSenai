package AulaJava17;

import java.util.Scanner;

public class Tabuada {
public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
    System.out.println("Digite um numero para ver a tabuada: ");
    int numero = scanner.nextInt();
	
	System.out.println("Tabuada de 1 a 10: ");
	for(int i=1; i <= 10 ; i++) {

	System.out.println(i + " x " + numero + " = " + (i* numero ));
	
	
}
   scanner.close();
}
}