package application;

public class Program {
	public static void main(String[] args) {

		String[] vect = new String[] { "Maria", "Bob", "Alex" };

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		// Tipo -> Apelido : -> cole��o
		//percorrer todos os elementos do vetor vect chamando cada um dos elementos de pessoas.
		for(String pessoas : vect) {
			System.out.println(pessoas);
		}
	}
}
