package views;

import javax.swing.JOptionPane;

public class ExcepcionCustomizada_JPO {
	
	public static String introducirEdad() {
		String edad = JOptionPane.showInputDialog("Introduzca su edad:");
		return edad;		
	}
		
	public static void mostrarMensaje(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

}
