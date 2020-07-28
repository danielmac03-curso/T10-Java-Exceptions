import dto.AdivinarNumero;
import views.AdivinarNumero_JOP;

public class AdivinarNumeroApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Mostramos el mensaje de inicio
		AdivinarNumero_JOP.mostrarMensaje("Empieza el juego, debe adivinar el numero entre el 1 y el 500");
		
		//Instanciamos el objeto
		AdivinarNumero adivinar = new AdivinarNumero();
		
		//Si el usuario no ha adivinado el numero volvemos a preguntar
		while(adivinar.isEncontado() == false) {
			String numeroIntroducido = AdivinarNumero_JOP.introducirNumero();
			adivinar.esNumero(numeroIntroducido);
		}
		
	}

}
