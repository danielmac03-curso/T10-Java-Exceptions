import javax.swing.JOptionPane;

import dto.Calculadora;
import views.Calculadora_JOP;

public class CalculadoraApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array de las operaciones
		String[] selecion = {"Suma", "Resta", "Multiplicación", "Potencia", "Raíz cuadrada", "Raíz cubica", "División"};
		//Preguntamos al usuario que operacion realizarc
		Object operacion = JOptionPane.showInputDialog(null, "Que operacion desea hacer:", "Seleccion",  JOptionPane.DEFAULT_OPTION, null, selecion, "0");
		String operacionString = operacion.toString();
				
		Calculadora calculadora = new Calculadora(operacionString);
				
		String numOperadores = Calculadora_JOP.numeroOperadores();
		
		try {
			//
			int numOperadoresInt = Integer.parseInt(numOperadores);
			
			calculadora.setNumOperadores(numOperadoresInt);
			
			int[] numeros = new int[numOperadoresInt];
			
			for (int i = 0; i < numOperadoresInt; i++) {
				String numero = Calculadora_JOP.introduceNumero(i+1);
				int numeroInt = Integer.parseInt(numero);
				numeros[i] = numeroInt;
			}
			
			calculadora.setNumeros(numeros);
			
			calculadora.calcular();
			
		} catch (NumberFormatException e) {
			Calculadora_JOP.mostrarMensaje("Debe introducir un numero");
		}

	}

}
