package exercicios_04_12;

import java.util.Scanner;

public class DoWhilePositivos {
	
	public static void main(String[] args) {
		
		int numero,positivos=0;
		
		Scanner ler = new Scanner (System.in);
		
		do {
			System.out.print("Digite um número: ");
			numero = ler.nextInt();
			System.out.println("");
			
			if (numero>0) {
				positivos = positivos + numero;
			}
			
		} while (numero!=0);
		
		System.out.println("A soma dos números positivos é: "+positivos);
	}
}
