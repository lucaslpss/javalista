package exercicios01;

import javax.swing.JOptionPane;

public class lista01 {

	public static void main(String[] args) {

	int	n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
	int	n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite o segundo n�mero"));

		int soma = n1 + n2;
		int diferen�a = n1 - n2;
		int produto = n1 * n2;
		int divis�o = n1 / n2;
		System.out.println("A soma dos dois n�meros � " + soma + ", a diferen�a dos dois numeros � " + diferen�a
				+ ", o produto dos dois n�meros � " + produto + " e a divis�o dos dois n�meros � " + divis�o);

	}

}
