package exercicios06_12;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetEncontrar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Set<Integer> lista = new HashSet<Integer>();
		Integer num, dados[] = {2,5,1,3,4,9,7,8,10,6};
		
		for (int cont = 0; cont<10;cont++) {
			lista.add(dados[cont]);
		}
		
		do {
			System.out.println("Digite o número que você deseja encontrar: ");
			num = ler.nextInt();
		
			if (lista.contains(num)) {
				System.out.println("O número "+num+" foi encontrado!\n");
			} else {
				System.out.println("O número "+num+" não foi encontrado!\n");
			} 
		}while (lista.contains(num));
		
		ler.close();
	}

}
