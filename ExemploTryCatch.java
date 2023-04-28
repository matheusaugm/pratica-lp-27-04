import java.util.Scanner;

/*Classe que demonstra uso do try/catch*/
public class ExemploTryCatch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Digite um número inteiro..: ");
			int numero1 = s.nextInt();
			System.out.println("Digite um número inteiro..: ");
			int numero2 = s.nextInt();
			System.out.println("Resultado da soma dos números: "+numero1+numero2+"=" + (numero1 + numero2));

		} catch (Exception ex) {
			System.out.println("Erro valor digitado não é um número inteiro");
		}
	}
}
