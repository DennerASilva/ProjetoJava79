package exercicios05_12;

import java.util.Scanner;

public class MatrizesNotas {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float notas[][] = new float[10][4];/*{ { 4.0f, 5.0f, 7.0f, 3.0f }, { 2.5f, 6.5f, 4.7f, 8.0f }, { 10.0f, 8.5f, 9.5f, 8.0f },
				{ 9.0f, 6.5f, 7.6f, 8.2f }, { 5.0f, 5.0f, 5.0f, 6.3f }, { 7.0f, 8.0f, 9.0f, 8.5f },
				{ 5.5f, 3.5f, 2.5f, 1.0f }, { 8.0f, 9.0f, 10.0f, 9.5f }, { 5.6f, 5.8f, 6.5f, 7.0f },
				{ 7.5f, 8.5f, 9.5f, 10.0f } };*/
		float media[] = new float[10], somaNotas = 0;
		
		for (int cont = 0; cont<10;cont++) {
			for (int cont2 = 0; cont2<4;cont2++) {
				System.out.print("Insira a "+(cont2+1)+"ª nota do aluno "+(cont+1)+": ");
				notas[cont][cont2] = ler.nextFloat();
			}		
			System.out.println(""); 
		}
	

		for (int cont = 0; cont<10;cont++) {
			System.out.print("Notas aluno "+(cont+1)+": ");
			for (int cont2 = 0; cont2<4;cont2++) {
				System.out.print("["+notas[cont][cont2]+"] ");
			}		
			System.out.println(""); 
		}
		
		System.out.println("\nMédias: ");
		for (int cont = 0; cont<10;cont++) {
			somaNotas = 0;
			for (int cont2 = 0; cont2<4;cont2++) {			
				somaNotas = somaNotas + notas[cont][cont2];
			}		
			media[cont] = somaNotas / 4;
			System.out.print("\nAluno "+(cont+1)+": ");
			System.out.printf("[%.1f]",media[cont]);
		}
	}
}
