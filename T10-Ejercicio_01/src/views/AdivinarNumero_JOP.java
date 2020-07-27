package views;

import javax.swing.JOptionPane;

public class AdivinarNumero_JOP {
	
	public static void empieza() {
		JOptionPane.showMessageDialog(null, "Empieza el juego, debe adivinar el numero entre el 1 y el 500");
	}
	
	public static String introducirNumero() {
		String numeroIntroducido = JOptionPane.showInputDialog("Introduzca un numero entero:");
		return numeroIntroducido;
	}
	
	public static void noIntrodujoNumero() {
		JOptionPane.showMessageDialog(null, "Debe introducir un numero");
	}
	
	public static void introdujoNumeroMayor() {
		JOptionPane.showMessageDialog(null, "Introducir un numero mayor");
	}
	
	public static void introdujoNumeroMenor() {
		JOptionPane.showMessageDialog(null, "Introducir un numero menor");
	}
	
	public static void introdujoNumeroCorrecto(int intentos) {
		JOptionPane.showMessageDialog(null, "Introducir el numero correcto, ha ganado");
		
		String intentos_intento = (intentos != 1) ? " intentos" : " intento";
		JOptionPane.showMessageDialog(null, "Lo ha conseguido con " + intentos + intentos_intento);
	}

}
