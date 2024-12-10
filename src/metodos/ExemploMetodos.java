package metodos;

public class ExemploMetodos {

	public static void main(String[] args) {
		
		/* num1 = leia.nextInt();
		 * num2 = leia.nextInt();
		 * somar(num1,num2);
		 */
		int resultado = somar(2,5);
		System.out.println("O primeiro resultado é " + resultado);
		
		System.out.println("\nO segundo resultado é " + somar(8,3));
		
		falar("\nDenner dos Anjos");
		falar("\nO gato amarelo");
		
		falar("\nO primeiro resultado é " + somar(5,5));
		
		ExemploMetodoExterno.mensagem();
	}

	// Definição do método Somar - Método com retorno e com parâmetro 
	public static int somar(int x, int y) {
		return  x+y; // 2 + 5
	}
	// Definição do método Somar - Método sem retorno e com parâmetro 
	public static void falar(String mensagem) {
		System.out.println(mensagem);
	}
}
