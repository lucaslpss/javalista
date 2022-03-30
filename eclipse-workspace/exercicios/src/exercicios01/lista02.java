package exercicios01;

import javax.swing.JOptionPane;

public class lista02 {

	public static void main(String[] args) {
		
		
		
		int n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite o número maior"));
		int n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite o número menor"));
		
		if (n1 % n2 == 0) {
			System.out.println("Os números são múltiplos");
		} else {
			System.out.println("Os números não são múltiplos");
		}
	}

}
