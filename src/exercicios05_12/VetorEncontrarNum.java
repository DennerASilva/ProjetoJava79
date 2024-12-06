package exercicios05_12;

import java.util.Scanner;

public class VetorEncontrarNum {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int proc, numeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		boolean encontrado = false;

		do {
			System.out.print("Digite o número que você quer encontrar: ");
			proc = ler.nextInt();
			
			for (int i = 0; i < 10; i++) {
				if (proc == numeros[i]) {
					System.out.println("O número " + proc + " está localizado na posição " + i + "\n");
					encontrado = false;
				}
			}
			
		} while (proc <= 10 && proc >= 1);

		if (encontrado == false) {
			System.out.println("O número " + proc + " não foi encontrado!");
		}
	}
}
