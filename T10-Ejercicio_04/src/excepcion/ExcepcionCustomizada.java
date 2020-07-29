package excepcion;

public class ExcepcionCustomizada extends Exception{
	
	//Definir atributos por defecto
	private int codigoExcepcion;
	
	//Definir constructor por defecto
	public ExcepcionCustomizada(){
		super();
		this.codigoExcepcion = 0;
	}	
	
	//Definir constructor con el parametro codigoExcepcion
	public ExcepcionCustomizada(int codigoExcepcion){
		super();
		this.codigoExcepcion = codigoExcepcion;
	}
	
	//Dependiedno del codigoExcepcion mostramos un mensaje o otro
	@Override
	public String getMessage() {
		
		String mensaje = "";
		
		switch (this.codigoExcepcion) {
		case 01:
			mensaje = "Debe introducir como minimo 2 numero";
			break;

		case 02:
			mensaje = "No introduzca un numero negativo";
			break;
		case 03:
			mensaje = "No se puede dividir entre cero";
			break;
		}
		
		return mensaje;				
	}

}
