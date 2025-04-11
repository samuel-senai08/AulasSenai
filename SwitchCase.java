package Aulajava16;

import java.util.Scanner;

public class SwitchCase {
public static void main(String[] args) {
		int num;
		Scanner numero = new Scanner (System.in);
		System.out.println("Informe um numero de 1 a 12");
		
		num = numero.nextInt();
		numero.close();
		
		switch(num) {
		
		case 1:
		System.out.println("O mês e janeiro");
		    break;
		
		case 2:
			System.out.println("O mês e fevereiro");
			break;
		
		case 3:
		System.out.println("O mês e março");
		break;
		
		case 4:
		System.out.println("O mês e abril");
		break;
		
		case 5:
		System.out.println("O mês e maio");
		break;
		
		case 6:
		System.out.println("O mês e junho");
		break;
		
		case 7:
		System.out.println("O mês e julho");
		break;
		
		case 8:
		System.out.println(" O mês e agosto");
		break;
		
		case 9:
		System.out.println("O mês e setembro");
		break;
		
		case 10:
		System.out.println("O mês e outubro");
		break;
		
		case 11:
		System.out.println("O mês e novembro");
		break;
		
		case 12:
			System.out.println(" O mês e dezembro");
		break;
		
		default:
			System.out.println();
			break;
			
		
		
			
		
		
		}
}
}
