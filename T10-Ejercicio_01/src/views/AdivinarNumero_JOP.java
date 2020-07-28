package views;

import javax.swing.JOptionPane;

public class AdivinarNumero_JOP {
		
	public static void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public static String introducirNumero() {
		String numeroIntroducido = JOptionPane.showInputDialog("Introduzca un numero entero:");
		return numeroIntroducido;
	}

}
