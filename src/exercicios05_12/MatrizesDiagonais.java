package exercicios05_12;

import java.util.Scanner;

public class MatrizesDiagonais {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		float somaPri = 0, somaSec =0;
		
		for (int cont = 0; cont<3;cont++) {
			for (int cont2 = 0; cont2<3;cont2++) {
				System.out.print("Digite o "+((cont+cont*2)+cont2+1)+"º número: ");
				matriz[cont][cont2] = ler.nextInt();
			}				
		}
	/*	Mostra a matriz inteira, de forma bidimensional
	 * 
	 * System.out.println();
		for (int cont = 0; cont<3;cont++) {
			for (int cont2 = 0; cont2<3;cont2++) {
				System.out.print("["+matriz[cont][cont2]+"] ");
			}		
			System.out.println("");
		} */
		
		System.out.println("\nElementos da diagonal principal: ");
		for (int cont = 0; cont<3;cont++) {
			System.out.print("["+matriz[cont][cont]+"]");
			somaPri = somaPri + matriz[cont][cont];	
		}
		
		System.out.println("\n\nElementos da diagonal secundária: ");
		for (int cont = 0; cont<3;cont++) {
			System.out.print("["+matriz[cont][2-cont]+"]");
			somaSec = somaSec + matriz[cont][2-cont];;
		}
		
		System.out.printf("\n\nSoma dos Elementos da Diagonal Principal: %.0f",somaPri);
		
		
		System.out.printf("\n\nSoma dos Elementos da Diagonal Secundária: %.0f",somaSec);
		
		ler.close();
	}

}
