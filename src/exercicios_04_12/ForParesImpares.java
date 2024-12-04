package exercicios_04_12;

import java.util.Scanner;

public class ForParesImpares {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int numero,cont,par = 0,impar = 0;
		
		for (cont = 0; cont <10; cont++) {
			System.out.print("Digite o "+ (cont+1)+"º número: ");
			numero = ler.nextInt();
			
			if (numero % 2 == 0) {
				par = par + 1;
			} else {
				impar = impar + 1;
			}
		}
		
		System.out.println("\nTotal de números pares: "+par);
		System.out.println("Total de números ímpares: "+impar);

	}
}
