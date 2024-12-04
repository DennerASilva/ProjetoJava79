package exercicios_04_12;

import java.util.Scanner;

public class ForIntervalo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1,num2,cont;
		
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = ler.nextInt();
		System.out.println("Digite o último número do intervalo: ");
		num2 = ler.nextInt();
		
		if (num1>=num2) {
			System.out.println("Intervalo inválido!");
		} else {
			for (cont = num1; cont <=num2;cont++) {
				if (cont % 5 == 0 && cont % 3 == 0 && cont != 0) {
					System.out.println(cont+" é múltiplo de 3 e 5");
				}
			} 		
		}
	}
}
 