package exception;

public class ExcepcionCustomizada extends Exception{
	
	//Definir atributos
	private int codigoExcepcion;
	
	//Definir constructor por defecto
	public ExcepcionCustomizada(){
		super();
		this.codigoExcepcion = 0;
	}	
	
	//Definir constructor con el parametro codigo excepcion
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
			mensaje = "Solo puede llevar ciclomotores y cuadriciclos";
			break;
		case 02:
			mensaje = "Como maximo puede llevar motos de 125 cm3 y vehÝculos agrÝcolas";	
			break;
		case 03:
			mensaje = "Como maximo puede llevar turismos, motos y camiones";
			break;
		case 04:
			mensaje = "No introduzca una edad en negativo";
			break;
		}
		
		return mensaje;		
	}

}
