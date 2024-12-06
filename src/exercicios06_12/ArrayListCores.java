package exercicios06_12;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCores {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String coresEntrada;
		ArrayList<String> cores = new ArrayList<String>();

		for (int cont = 0; cont < 5; cont++) {
			System.out.print("Digite a " + (cont + 1) + "ª cor: ");
			coresEntrada = ler.nextLine();
			cores.add(coresEntrada);
		}
		System.out.println("\n\nListar todas as cores: \n");
		for (String cor : cores) {
			System.out.println(cor);
		}

		cores.sort(null);

		System.out.println("\nOrdenar as cores: \n");
		for (String cor : cores) {
			System.out.println(cor);
		}
		ler.close();
	}
}
