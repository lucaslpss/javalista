package exercicios01;

import javax.swing.JOptionPane;

public class ParOuImpar {
public static void main(String[] args) {
	
	int n = Integer.valueOf(JOptionPane.showInputDialog("Digite um número"));
	if (n % 2 == 0) {
		System.out.println("O numero " + n + (" é par"));
	} else {
		System.out.println("O numero " + n + (" é impar"));
	}
	}}