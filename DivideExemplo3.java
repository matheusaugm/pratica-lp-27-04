import javax.swing.JOptionPane;
public class DivideExemplo3 {
	public static void main(String[] args) {
		int dividendo = Integer.parseInt(args[0]);
		int divisor = Integer.parseInt(args[1]);
		while(true) {
			try {
				dividendo=Integer.parseInt(JOptionPane.showInputDialog("Digite um novo dividendo"));
				divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite um novo divisor"));
				divide(dividendo, divisor);
				break;
			} catch (ArithmeticException e1) {
				JOptionPane.showMessageDialog(null, "Nao pode dividir por zero");

			}catch(NumberFormatException e2) {
				JOptionPane.showMessageDialog(null, "Favor informar apenas numeros inteiros");
			}
		}

	}
	public static void divide(int dividendo, int divisor) {
		JOptionPane.showMessageDialog(null, "Resultado da divisão: " + dividendo + "/" + divisor + "=" + (dividendo / divisor));
	}

}
