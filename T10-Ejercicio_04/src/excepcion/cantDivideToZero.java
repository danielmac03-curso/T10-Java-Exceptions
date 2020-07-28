package excepcion;

public class cantDivideToZero extends Exception{
	
	//Definir atributos por defecto
	private int codigoExcepcion;
	
	//Definir constructor por defecto
	public cantDivideToZero(){
		super();
		this.codigoExcepcion = 0;
	}	
	
	//Definir constructor con el parametro codigoExcepcion
	public cantDivideToZero(int codigoExcepcion){
		super();
		this.codigoExcepcion = codigoExcepcion;
	}
	
	//Dependiedno del codigoExcepcion mostramos un mensaje o otro
	@Override
	public String getMessage() {		
		String mensaje = "No se puede dividir entre cero";
		return mensaje;		
	}

}
