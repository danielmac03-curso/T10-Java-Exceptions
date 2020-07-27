package views;

import javax.swing.JOptionPane;

public class Calculadora_JOP {
	
	public static String numOperadores() {
		String numeroOperadores = JOptionPane.showInputDialog("Introduzca el numero de operadores:");
		return numeroOperadores;
	}
	
	public static void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public static String introduceNumero(int indice) {
		String numero = JOptionPane.showInputDialog("Introduzca el numero " + indice);
		return numero;
	}
	
}
