import dto.GenerarNumeroAleaterio;
import exception.ExcepcionCustomizada;
import views.GenerarNumeroAleatorio_JPO;

public class GenerarNumeroAleaterioApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//Mostramos un mensaje al iniciar el programa
		GenerarNumeroAleatorio_JPO.mostrarMensaje("Generando número aleatorio...");
		
		//Instanciamos el objeto
		GenerarNumeroAleaterio numAleatorio = new GenerarNumeroAleaterio();
		
		//Mostramos el numero aletorio
		GenerarNumeroAleatorio_JPO.mostrarMensaje(numAleatorio.toString());
		
		try {
			//Si el numero es par o no le pasamos un codigo o otro a la excepcion customizada
			if(numAleatorio.numeroPar() == true) {
				throw new ExcepcionCustomizada(00);
			}else {
				throw new ExcepcionCustomizada(01);
			}	
		} catch (ExcepcionCustomizada e) {
			GenerarNumeroAleatorio_JPO.mostrarMensaje(e.getMessage());
		}

	}

}
