import javax.swing.JOptionPane;

import dto.Calculadora;
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
		
		//Si el usuario selecciono una raiz ya no le preguntamos con cuantos numeros quiere opera
		if(operacionString.equals("Raíz cuadrada") || operacionString.equals("Raíz cubica")) {
			numOperadores = "1";
		}else {
			numOperadores = Calculadora_JOP.numOperadores();
		}
		
		//Si en algún momento el usuario introduce algun dato que no sea un numero mostrara un error y dejara de ejecutarse 
		try {
			//Ahora pasamos la varubale numOperadores a entero
			int numOperadoresInt = Integer.parseInt(numOperadores);
			
			//Seteamos el numOperadores al objeto
			calculadora.setNumOperadores(numOperadoresInt);
			
			//Creamos un array de enteros y el tamaño es segun el el numOperadores que hemos pedido antes
			int[] numeros = new int[numOperadoresInt];
			
			//Bucle para cada uno de los numeros que hemos indicado, preguntaremos al usuario, lo pasaremos a entero y lo guardamos en el arry
			for (int i = 0; i < numOperadoresInt; i++) {
				String numero = Calculadora_JOP.introduceNumero(i+1);
				int numeroInt = Integer.parseInt(numero);
				numeros[i] = numeroInt;
			}
			
			//Le pasamos al objecto los numeors
			calculadora.setNumeros(numeros);
			
			//Mostramos el total
			Calculadora_JOP.mostrarMensaje("El total es: " + calculadora.calcular());
			
		} catch (NumberFormatException e) {
			Calculadora_JOP.mostrarMensaje("Debe introducir un numero");
		}

	}

}
