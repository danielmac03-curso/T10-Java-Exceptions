package views;

import javax.swing.JOptionPane;

public class Calculadora_JOP {
		
	//Este metodo nos permite mostar cualquier mensaje
	public static void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public static String preguntarInformacion(String mensaje) {
		String numero = JOptionPane.showInputDialog(mensaje);
		return numero;
	}
	
}
