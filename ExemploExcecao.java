public class ExemploExcecao {
	public static void main(String[] args) {
		System.out.println("Antes da exceção");
		try {
			/*Trecho de código no qual uma exceção pode acontecer*/
		} catch (Exception ex) {
			/*Trecho de código que será executado caso uma exceção do tipo "exception" será tratada*/
		}
		System.out.println("Depois da exceção");
	}
}
