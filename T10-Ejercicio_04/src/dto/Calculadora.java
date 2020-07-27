package dto;

public class Calculadora {
	
	//Definir constantes
	private final int[] DEFAULT_NUMEROS = {}; 
	
	//Definir atributos
	private String operador;
	private int numOperadores;
	private int[] numeros;
	
	//Constructor por defecto
	public Calculadora() {
		this.operador = "";
		this.numOperadores = 0;
		this.numeros = DEFAULT_NUMEROS;
	}

	//Constructor con el parametro operacion
	public Calculadora(String operacion) {
		this.operador = operacion;
		this.numOperadores = 0;
		this.numeros = DEFAULT_NUMEROS;
	}
	
	//Setters necesarios
	public void setNumOperadores(int numOperadores) {
		this.numOperadores = numOperadores;
	}
	
	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}
	
	public double calcular() {	
		//Definir la variable fuera para poder usarla
		double resultado = this.numeros[0];
		
		//Si el usuario selecciono una raiz solo haremos la operacion una vez, sino la repetiremos por cada nuemero 
		if(this.operador.equals("Ra�z cuadrada") || this.operador.equals("Ra�z cubica")) {
			switch (this.operador) {
				case "Ra�z cuadrada":
					resultado = (int) Math.pow(resultado, 2);
					break;
				case "Ra�z cubica":
					resultado = (int) Math.pow(resultado, 3);
					break;
			}	
		}else {
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
					case "Potencia":
						resultado = (int) Math.pow(resultado, this.numeros[i]);
						break;
					case "Divisi�n":
						resultado /= this.numeros[i];
						break;
				}
			}	
		}
		
		return resultado;
	}
	
}
