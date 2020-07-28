package dto;

import java.util.Random;

import views.AdivinarNumero_JOP;

public class AdivinarNumero {
	
	//Definir atributos
	private int numero;
	private int intentos;
	private boolean encontado;
	
	//Definir constructor por defecto
	public AdivinarNumero() {
		this.numero = generarNumero();
		this.intentos = 0;
		this.encontado = false;
	}

	//Metodo para generar numero aleatorio
	public int generarNumero() {
		Random numero = new Random();
		int numeroInt = numero.nextInt(500 + 1 - 1) + 1;

		return numeroInt;
	}
	
	//Metodo para comprobar si es un numero
	public void esNumero (String numeroIntroducido) {
		try {
			int numeroIntroducidoInt = Integer.parseInt(numeroIntroducido);
			this.comprobarNumero(numeroIntroducidoInt);
		} catch (NumberFormatException e) {
			AdivinarNumero_JOP.mostrarMensaje("Debe introducir un numero");
			this.setIntentosOneMore();
		}
	}
	
	//Metodo para comprobar si el numero es el correcto y por tanto lo ha adivinado
	public void comprobarNumero(int numeroIntroducido) {		
		if (numeroIntroducido < this.numero) {
			this.intentos += 1;
			AdivinarNumero_JOP.mostrarMensaje("Introduzca un numero mayor");
		}else if (numeroIntroducido > this.numero) {
			this.intentos += 1;
			AdivinarNumero_JOP.mostrarMensaje("Introduzca un numero menor");
		}else {
			this.encontado = true;
			AdivinarNumero_JOP.mostrarMensaje("Introdujo el numero correcto, ha ganado");
			AdivinarNumero_JOP.mostrarMensaje("Lo ha conseguido en " + this.intentos + ((intentos == 1) ? " intento" : " intentos"));	
		}
	}
	
	//Getters y setters
	public boolean isEncontado() {
		return encontado;
	}

	public void setIntentosOneMore() {
		this.intentos += 1;
	}
	
}
