package exercicios06_12;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNumeros {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Integer num, dados[] = {2,5,1,3,4,9,7,8,10,6};
		
		
		for (int cont = 0; cont<10;cont++) {
			lista.add(dados[cont]);
		}
		
		do {
			System.out.print("Digite o número que você quer encontrar: ");
			num = ler.nextInt();

			if (lista.contains(num)) {
				System.out.println("O número " + num + " está na posição " + lista.indexOf(num) + "\n");
			} else {
				System.out.println("O número " + num + " não foi encontrado!\n");
			}
		} while (num >= 1 && num <= 10);
		
		ler.close();
	}

}
