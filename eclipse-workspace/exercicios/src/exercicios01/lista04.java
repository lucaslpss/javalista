package exercicios01;

import javax.swing.JOptionPane;

public class lista04 {

	public static void main(String[] args) {

	int n = Integer.valueOf(JOptionPane.showInputDialog("Digite um n�mero com 4 digitos"));
	int uni = n / 1 % 10;
	int dez = n / 10 % 10;
	int cen = n / 100 % 10;
	int mil = n / 1000 % 10;
	System.out.println("A unidade do n�mero digitado � "+ uni + ", a dezena � " + dez + ", a centena � " + cen + " e o milhar � " + mil);
		
		
	}

}
