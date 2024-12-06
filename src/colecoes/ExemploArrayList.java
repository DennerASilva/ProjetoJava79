package colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {
		// Cria a Collection ArrayList, do tipo Double, chamada notas
		ArrayList<Double> notas = new ArrayList<Double>();

		// Cria um Objeto da Classe Wrapper Double
		Double y = Double.valueOf(9);

		// Testes com alocação de valores e entrada de dados
		System.out.print("Digite uma nota: ");
		Scanner ler = new Scanner (System.in);
		double x = 8.7;
		Double z = Double.valueOf(x);		
		Double 	a = ler.nextDouble();
		
		/**
		 * Adiciona algumas Notas. 
		 * Observe que a primeira nota é o Objeto Wrapper Double.
		 */
//		notas.add(x); POR QUE ******** ISSO RODOU??    PS.: descobri porque rodou. O autoboxer ele
		
		notas.add(a);
		notas.add(z);
		notas.add(y);
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);

		/**
		 * Mostra na tela todas as notas adicionadas. 
		 * Observe que a nota duplicada foi adicionada duas vezes.
		 */
		System.out.println("\nNotas cadastradas: " + notas);
		
		
		/*
		 * Mostra na tela todas as notas através do laço de repetição For...Each
		 */
		System.out.println("\nNotas cadastradas -Laço For...Each");
		
		for (Double nota : notas) {
			System.out.println(nota);
		}
	}

}
