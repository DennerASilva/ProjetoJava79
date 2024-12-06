package exercicios06_12;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetMostrarLista {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Set<Integer> lista = new HashSet<Integer>();
		Integer numero;

		System.out.println("Digite 10 números diferentes: ");
		for (int cont = 0; cont < 10; cont++) {
			System.out.print("- ");
			numero = ler.nextInt();
			lista.add(numero);
		}
		
		System.out.println("\nListar dados do set: ");
		for (Integer nums : lista) 
			System.out.println(nums);
		
		ler.close();
	}
}
