package exercicios01;

import javax.swing.JOptionPane;

public class Media {
	public static void main(String[] args) {
		int n1;
		int n2;
		
		n1 = Integer.valueOf(
				JOptionPane.showInputDialog("Digite o primeiro numero")
				);
		n2 = Integer.valueOf(
				JOptionPane.showInputDialog("Digite o segundo numero")
				);
				
		double media = (n1+n2) / 2;
		
		
		System.out.println("A média é "+ media);
		
		
		
		
	}

}
