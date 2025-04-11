package Aulajava16;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

      
        System.out.println("Escolha o método de pagamento:");
        System.out.println("1 - Pix (15% de desconto)");
        System.out.println("2 - Dinheiro (5% de desconto)");
        System.out.println("3 - Cartão (sem desconto)");
        System.out.print("Digite o número correspondente: ");
        int metodoPagamento = scanner.nextInt();

        double valorFinal = valorCompra;

      
        switch (metodoPagamento) {
            case 1: // Pix
                valorFinal = valorCompra * 0.85; // 15% de desconto
                System.out.println("Desconto de 15% aplicado! Valor final: R$ " + valorFinal);
                break;
            case 2: // Dinheiro
                valorFinal = valorCompra * 0.95; // 5% de desconto
                System.out.println("Desconto de 5% aplicado! Valor final: R$ " + valorFinal);
                break;
            case 3: // Cartão
                System.out.println("Sem desconto para pagamento no cartão. Valor final: R$ " + valorCompra);
                break;
            default:
                System.out.println("Método de pagamento inválido.");
                break;
        }

        scanner.close();
    }
}





