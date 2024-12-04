package exercicios_04_12;

import java.util.Scanner;

public class DoWhileMultiplos3 {

	public static void main(String[] args) {
		
		int numero, quant = 0;
		float media,soma = 0;
		
		Scanner ler = new Scanner (System.in);
		
		do {
			System.out.print("Digite um número: ");
			numero = ler.nextInt();
			System.out.println("");
			
			if (numero % 3 == 0 && numero != 0) {
				soma = soma + numero;
				quant++;
			}		
		} while (numero!=0);
		
		media = soma / quant;
		
		System.out.println("A média de todos os números múltiplos de 3 é: "+media);
	}
}
