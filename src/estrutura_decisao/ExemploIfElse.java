package estrutura_decisao;

import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {

		// Scanner
		Scanner ler = new Scanner(System.in);

		// Variáveis
		float media;

		// Entrada
		System.out.print("Digite a média do aluno: ");
		media = ler.nextFloat();

		// Processamento e saída
		if (media >= 6) {
			System.out.println("Alune aprovade.");
		} else if (media >= 4) {
			System.out.println("Alune de exame.");
		} else {
			System.out.println("Alune reprovade.");
		}

		ler.close();
	}

}
