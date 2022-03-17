package exercicios01;
import javax.swing.JOptionPane;



public class habilitaçao {



public static void main(String[] args) {
int usuario = Integer.valueOf(JOptionPane.showInputDialog("Digite sua idade"));


if (usuario >= 18) {
System.out.println("Pode tirar a habilitação");
} else {
System.out.println("Não pode tirar a habilitação");
}
}
}

