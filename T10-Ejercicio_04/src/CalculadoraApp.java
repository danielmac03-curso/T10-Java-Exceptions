import javax.swing.JOptionPane;

import dto.Calculadora;
import views.Calculadora_JOP;

public class CalculadoraApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array de las operaciones
		String[] selecion = {"Suma", "Resta", "Multiplicaci�n", "Potencia", "Ra�z cuadrada", "Ra�z cubica", "Divisi�n"};
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
		
		//Si el usuario selecciono una raiz ya no le preguntamos con cuantos numeros quiere operar
		if(operacionString.equals("Ra�z cuadrada") || operacionString.equals("Ra�z cubica")) {
			numOperadores = "1";
		}else {
			numOperadores = Calculadora_JOP.numOperadores();
		}
		
		//Si en alg�n momento el usuario introduce algun dato que no sea un numero mostrara un error y dejara de ejecutarse 
		try {
	
			//Ahora pasamos la varibale numOperadores a entero
			numOperadoresInt = Integer.parseInt(numOperadores);
			
			//Seteamos el numOperadores al objeto
			calculadora.setNumOperadores(numOperadoresInt);
			
			//Creamos un array de enteros y el tama�o es segun el numOperadores que hemos pedido antes
			numeros = new int[numOperadoresInt];
			
			//Bucle para cada uno de los numeros que hemos indicado, preguntaremos al usuario, lo pasaremos a entero y lo guardamos en el array
			for (int i = 0; i < numOperadoresInt; i++) {
				String numero = Calculadora_JOP.introduceNumero(i+1);
				int numeroInt = Integer.parseInt(numero);
				numeros[i] = numeroInt;
			}
				
		} catch (NumberFormatException e) {
			Calculadora_JOP.mostrarMensaje("Debe introducir un numero");
		}
		
		if(numOperadoresInt != 0) {
			
			//Le pasamos al objecto los numeros
			calculadora.setNumeros(numeros);
			
			if(operacionString.equals("Ra�z cuadrada") || operacionString.equals("Ra�z cubica")) {
				Calculadora_JOP.mostrarMensaje("El total es: " + calculadora.calcular(true));
			}else {
				Calculadora_JOP.mostrarMensaje("El total es: " + calculadora.calcular());
			}
		
		}		


	}

}
