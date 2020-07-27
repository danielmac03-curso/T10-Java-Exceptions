import exception.ExcepcionCustomizada;
import views.ExcepcionCustomizada_JPO;

public class ExcepcionCustomizadaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Mensaje para comenzar
		ExcepcionCustomizada_JPO.comenzar();
		
		//Intenta ejecitar un codigo sino intenta capturar la excepcion
		try {
			//Preguntamos la edad
			int edad = ExcepcionCustomizada_JPO.introducirEdad();
			
			//Dependiendo de la edad lanzamos una extension o mostramos un mensaje
			if (edad == 15) {
				throw new ExcepcionCustomizada(15);
			}else if(edad == 16) {
				throw new ExcepcionCustomizada(16);
			}else if(edad == 18) {
				throw new ExcepcionCustomizada(18);
			}else if(edad >= 20){
				ExcepcionCustomizada_JPO.mostrarMensaje("Puede llevar motos sin limitacion por edad");
			}	
		} catch (NumberFormatException e1) {
			ExcepcionCustomizada_JPO.mostrarMensaje("Debe introducir un numero");
		} catch (ExcepcionCustomizada e2) {
			ExcepcionCustomizada_JPO.mostrarMensaje(e2.getMessage());
		}
		
		//Mensaje para acabar
		ExcepcionCustomizada_JPO.acabar();		
	}

}
