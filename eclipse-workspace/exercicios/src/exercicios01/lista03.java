package exercicios01;

import javax.swing.JOptionPane;

public class lista03 {

	public static void main(String[] args) {
		
		
		Double raio = Double.valueOf(JOptionPane.showInputDialog("Digite o raio do c�rculo"));
		
		Double area = 3.14 * (raio*raio);
		Double circ = 2 * 3.14 * raio;
		Double diametro = raio * 2;
		
		System.out.println("O di�metro do circulo � " + diametro + ", a circunfer�ncia do circulo � " + circ + " e a area do c�rculo � " + area);
		

	}

}
