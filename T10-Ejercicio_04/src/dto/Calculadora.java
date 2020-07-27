package dto;
import views.Calculadora_JOP;

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
	
	public int calcular() {
		
		int resultado = this.numeros[0];
		
		for (int i = 1; i < this.numeros.length; i++) {

		}
		
		return resultado;
		
	}
	
}
