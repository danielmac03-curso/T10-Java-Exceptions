package views;

import javax.swing.JOptionPane;

public class ExcepcionCustomizada_JPO {
	
	public static void comenzar() {
		JOptionPane.showMessageDialog(null, "Apto para llevar motos sin limiatacion por edad?");
	}
	
	public static String introducirEdad() {
		String edad = JOptionPane.showInputDialog("Introduzca su edad:");
		return edad;		
	}
		
	public static void mostrarMensaje(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	public static void acabar() {
		JOptionPane.showMessageDialog(null, "Programa terminado");
	}

}
