package dto;

public class Calculadora {
	
	private final int[] DEFAULT_NUMEROS = {}; 
	
	private String operador;
	private int numOperadores;
	private int[] numeros;
	
	public void setNumOperadores(int numOperadores) {
		this.numOperadores = numOperadores;
	}
	

	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}

	public Calculadora() {
		this.operador = "";
		this.numOperadores = 0;
		this.numeros = DEFAULT_NUMEROS;
	}
	
	public Calculadora(String operacion) {
		this.operador = operacion;
		this.numOperadores = 0;
		this.numeros = DEFAULT_NUMEROS;
	}
	
	public double calcular() {
		
		double resultado = this.numeros[0];
		
		if(this.operador.equals("Raíz cuadrada") || this.operador.equals("Raíz cubica")) {
			switch (this.operador) {
				case "Raíz cuadrada":
					resultado = (int) Math.pow(resultado, 2);
					break;
				case "Raíz cubica":
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
					case "Multiplicación":
						resultado *= this.numeros[i];
						break;
					case "Potencia":
						resultado = (int) Math.pow(resultado, this.numeros[i]);
						break;
					case "División":
						resultado /= this.numeros[i];
						break;
				}
			}	
		}
		return resultado;
	}
	
}
