package exercicios01;

import javax.swing.JOptionPane;

public class lista01 {

	public static void main(String[] args) {

	int	n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite o primeiro número"));
	int	n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite o segundo número"));

		int soma = n1 + n2;
		int diferença = n1 - n2;
		int produto = n1 * n2;
		int divisão = n1 / n2;
		System.out.println("A soma dos dois números é " + soma + ", a diferença dos dois numeros é " + diferença
				+ ", o produto dos dois números é " + produto + " e a divisão dos dois números é " + divisão);

	}

}
