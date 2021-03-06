package dto;

public class Calculadora {
	
	//Definir constantes
	private final int[] DEFAULT_NUMEROS = {}; 
	
	//Definir atributos
	private String operador;
	private int[] numeros;
	
	//Constructor por defecto
	public Calculadora() {
		this.operador = "";
		this.numeros = DEFAULT_NUMEROS;
	}

	//Constructor con el parametro operacion
	public Calculadora(String operacion) {
		this.operador = operacion;
		this.numeros = DEFAULT_NUMEROS;
	}
	
	//Setters necesarios
	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}
	
	public double calcular(boolean x) {	
		//Definir la variable fuera para poder usarla
		double resultado = this.numeros[0];
		
		//Si el usuario selecciono una raiz solo haremos la operacion una vez, sino la repetiremos por cada nuemero 
		switch (this.operador) {
			case "Ra�z cuadrada":
				resultado = (int) Math.pow(resultado, 2);
				break;
			case "Ra�z cubica":
				resultado = (int) Math.pow(resultado, 3);
				break;
		}
		
		return resultado;
	}
	
	public double calcular() {	
		//Definir la variable fuera para poder usarla
		double resultado = this.numeros[0];
		
		for (int i = 1; i < this.numeros.length; i++) {		
			switch (this.operador) {
				case "Suma":
					resultado += this.numeros[i];
					break;
				case "Resta":
					resultado -= this.numeros[i];	
					break;
				case "Multiplicaci�n":
					resultado *= this.numeros[i];
					break;
				case "Divisi�n":
					resultado /= this.numeros[i];
					break;
				case "Potencia":
					resultado = (int) Math.pow(resultado, this.numeros[i]);					
					break;
			}	
		}
		
		return resultado;
	}
	
}
