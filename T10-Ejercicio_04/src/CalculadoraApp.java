import javax.swing.JOptionPane;

import dto.Calculadora;
import excepcion.minTwoNumbers;
import excepcion.cantDivideToZero;
import views.Calculadora_JOP;

public class CalculadoraApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array de las operaciones
		String[] selecion = {"Suma", "Resta", "Multiplicación", "Potencia", "Raíz cuadrada", "Raíz cubica", "División"};
		//Preguntamos al usuario que operacion realizar
		Object operacion = JOptionPane.showInputDialog(null, "Que operacion desea hacer:", "Seleccion",  JOptionPane.DEFAULT_OPTION, null, selecion, "0");
		//Convertimos el menu de seleccion a String
		String operacionString = operacion.toString();
		
		//Iniciamos el objecto
		Calculadora calculadora = new Calculadora(operacionString);
		
		//Definimos la varible desde fuera para poder usarla en cualquiel parte
		String numOperadores = "";
		int[] numeros = null;
		int numOperadoresInt = 0;
		double total = 0.0;
		
		//Si el usuario selecciono una raiz ya no le preguntamos con cuantos numeros quiere operar
		if(operacionString.equals("Raíz cuadrada") || operacionString.equals("Raíz cubica")) {
			numOperadores = "1";
		}else {
			numOperadores = Calculadora_JOP.numOperadores();
		}
				
		//Si en algún momento el usuario introduce un dato no esperado saltara un error
		try {
			//Ahora pasamos la varibale numOperadores a entero
			numOperadoresInt = Integer.parseInt(numOperadores);
			
			if(numOperadoresInt == 1 && !(operacionString.equals("Raíz cuadrada") || operacionString.equals("Raíz cubica"))) {
				throw new minTwoNumbers(00);
			}
			
			//Creamos un array de enteros y el tamaño es segun el numOperadores que hemos pedido antes
			numeros = new int[numOperadoresInt];
			
			//Bucle para cada uno de los numeros que hemos indicado, preguntaremos al usuario, lo pasaremos a entero y lo guardamos en el array
			for (int i = 0; i < numOperadoresInt; i++) {
				String numero = Calculadora_JOP.introduceNumero(i+1);
				int numeroInt = Integer.parseInt(numero);
				numeros[i] = numeroInt;
			}	
			
			//Le pasamos al objecto los numeros para la operacion
			calculadora.setNumeros(numeros);
			
			//Pasamos un paramtro boolean para utilizar el polimorfismo
			if(operacionString.equals("Raíz cuadrada") || operacionString.equals("Raíz cubica")) {
				total = calculadora.calcular(true);
			}else {
				total = calculadora.calcular();
			}

			//Si devolviera infinity por culpa de la division, invocariamos la excepcion customizada
			if(total != Double.POSITIVE_INFINITY) {
				Calculadora_JOP.mostrarMensaje("El total es : " + total);
			}else {
				throw new cantDivideToZero(00);
			}
		} catch (NumberFormatException e1) {
			Calculadora_JOP.mostrarMensaje("Debe introducir un numero");
		} catch (minTwoNumbers e2) {
			Calculadora_JOP.mostrarMensaje(e2.getMessage());
		} catch (cantDivideToZero e3) {
			Calculadora_JOP.mostrarMensaje(e3.getMessage());
		}


	}

}
