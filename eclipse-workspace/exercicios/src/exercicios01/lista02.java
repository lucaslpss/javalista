package exercicios01;

import javax.swing.JOptionPane;

public class lista02 {

	public static void main(String[] args) {
		
		
		
		int n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite o n�mero maior"));
		int n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite o n�mero menor"));
		
		if (n1 % n2 == 0) {
			System.out.println("Os n�meros s�o m�ltiplos");
		} else {
			System.out.println("Os n�meros n�o s�o m�ltiplos");
		}
	}

}
