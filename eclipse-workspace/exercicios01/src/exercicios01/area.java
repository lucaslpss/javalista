package exercicios01;

import javax.swing.JOptionPane;

public class area {
	
	public static void main(String[] args) {
		
		double base;
		double altura;
		double area;
		
		
		base = Double.valueOf(
				JOptionPane.showInputDialog("Digite a base do triangulo")
				);
		altura = Double.valueOf(
				JOptionPane.showInputDialog("Digite a altura do triangulo")
				);
				
		area = (base * altura) / 2;
		
		System.out.println("A area é " + area);
	}

}
