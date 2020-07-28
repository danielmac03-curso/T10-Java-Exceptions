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
		case 00:
			mensaje = "No puedes dividir entre cero";
			break;
		}
		
		return mensaje;		
	}

}
