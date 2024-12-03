package exercicios03_12;

import java.util.Scanner;

public class SwitchCalculadora {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float num1,num2,resultado;
		int cod;
		
		System.out.print("Digite o primeiro número: ");
		num1 = ler.nextFloat();
		System.out.print("Digite o primeiro número: ");
		num2 = ler.nextFloat();
		

		System.out.println("\n1 - Soma.");
		System.out.println("2 - Subtração.");
		System.out.println("3 - Multiplicação.");
		System.out.println("4 - Divisão.");
		System.out.print("\nEscolha que operação fazer:");
		
		cod = ler.nextInt();
		
		switch (cod) {
		case 1:
			resultado = num1 + num2 ;
			System.out.println(num1+" + "+num2+" = " + resultado);
			break;
		case 2:
			resultado = num1 - num2 ;
			System.out.println(num1+" - "+num2+" = " + resultado);
			break;
		case 3:
			resultado = num1 * num2 ;
			System.out.println(num1+" * "+num2+" = " + resultado);
			break;
		case 4:
			resultado = num1 / num2 ;
			System.out.println(num1+" / "+num2+" = " + resultado);
			break;
		default: 
			System.out.println("Selecione uma opção válida.");
			break;
		}
	}

}
