package views;

import javax.swing.JOptionPane;

public class Calculadora_JOP {
	
	public static String numOperadores() {
		String numeroOperadores = JOptionPane.showInputDialog("Introduzca cuantos numeros va a introducir:");
		return numeroOperadores;
	}
	
	//Este metodo nos permite mostar cualquier mensaje
	public static void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public static String introduceNumero(int indice) {
		String numero = JOptionPane.showInputDialog("Introduzca el " + indice + "º numero");
		return numero;
	}
	
}
