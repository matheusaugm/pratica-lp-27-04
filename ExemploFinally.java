import java.util.Scanner;

public class ExemploFinally {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			int dividendo, divisor;
			System.out.println("Digite o valor do dividendo ");
			dividendo = s.nextInt();
			System.out.println("Digite o valor do divisor ");
			divisor = s.nextInt();
			if (divisor == 0) {
				throw new Exception("Divisor não pode ser zero");
			}
			System.out.println("Resultado da divisão: " + dividendo + "/" + divisor + "=" + (dividendo / divisor));
		}catch (Exception ex) {
			System.out.println("Error" + ex.getMessage());

		}finally {
			System.out.println("Bloco finally executado");
		}


	}
}
