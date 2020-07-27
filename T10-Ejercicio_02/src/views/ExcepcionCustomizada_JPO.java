package views;

import javax.swing.JOptionPane;

public class ExcepcionCustomizada_JPO {
	
	public static void comenzar() {
		JOptionPane.showMessageDialog(null, "Apto para llevar motos sin limiatacion por edad?");
	}
	
	public static int introducirEdad() {
		String edad = JOptionPane.showInputDialog("Introduzca su edad:");
		int edadInt = Integer.parseInt(edad);
		return edadInt;		
	}
		
	public static void mostrarMensaje(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	public static void acabar() {
		JOptionPane.showMessageDialog(null, "Programa terminado");
	}

}
