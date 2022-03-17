package exercicios01;

import javax.swing.JOptionPane;

public class imc {

	public static void main(String[] args) {
	
	
	Double peso = Double.valueOf(JOptionPane.showInputDialog("Digite seu peso"));
	Double altura = Double.valueOf(JOptionPane.showInputDialog("Digite sua altura (em centímetros)"));
	Double imc = peso / (altura * altura);
	
	
	System.out.println("Seu IMC é " + imc);	 
	
		
		
		
		
		
		
	}
}
