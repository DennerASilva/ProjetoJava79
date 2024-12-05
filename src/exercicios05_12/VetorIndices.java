package exercicios05_12;

import java.util.Scanner;

public class VetorIndices {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num[] = new int[10];
		float media, soma = 0;

		for (int cont = 0; cont < 10; cont++) {

			System.out.print("Digite o " + (cont + 1) + "º número: ");
			num[cont] = ler.nextInt();
			soma = soma + num[cont];
		}

		media = soma / 10;

		System.out.println("\n\nElementos nos índices ímpares: ");
		for (int cont = 0; cont < 10; cont++) {
			if (cont % 2 != 0) {
				System.out.print("[" + num[cont] + "] ");
			}
		}

		System.out.println("\n\nElementos pares: ");
		for (int cont = 0; cont < 10; cont++) {
			if (num[cont] % 2 == 0) {
				System.out.print("[" + num[cont] + "] ");
			}
		}

		System.out.printf("\n\nSoma: %.0f",soma);
		System.out.printf("\nMédia: %.2f", media);

	}
}
