package introducao;

import java.util.Scanner;
public class EntradaESaida {

	public static void main(String[] args) {
		
		
		//Construindo o Scanner ler
		Scanner ler = new Scanner(System.in);		
		
		//Variaveis
		String nome;
		float temp;
		float fahrenheit;
		
		//Inserir o nome, temperatura
		System.out.println("Digite seu nome: ");
		nome = ler.next();
		
		System.out.println("Digite a temperatura atual em Celsius: ");
		temp = ler.nextFloat();		
		
		//Processamento
		fahrenheit = temp * 1.8f + 32;
		
		
		//Saída dos dados
		System.out.println("Bom dia, "+nome+". A temperatura atual é "+temp+"ºC");
		System.out.printf("Esta temperatura, convertida para Fahrenheit, é %.2f ºF",fahrenheit);
	}

}
