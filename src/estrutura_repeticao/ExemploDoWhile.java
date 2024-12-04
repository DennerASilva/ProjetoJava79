package estrutura_repeticao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {

        int numero, resultado, contador = 3;
        Scanner leia = new Scanner(System.in);

        while (contador <= 2) {
            System.out.println("\nDigite um número inteiro: ");
            numero = leia.nextInt();
            resultado = numero * 5;
            System.out.println("\nO resultado da multiplicação é: " + resultado);
        }
	}

}
