package vetores;

public class ExemploVetor {

	public static void main(String[] args) {
		String cachorros[] = { "Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi" };

		for(int indice = 0; indice <5; indice++) {
			System.out.println((indice+1)+"º elemento: " + cachorros[indice]);
		}
	}
}
