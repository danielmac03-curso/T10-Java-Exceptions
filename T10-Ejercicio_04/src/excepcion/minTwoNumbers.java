package excepcion;

public class minTwoNumbers extends Exception{
	
	//Definir atributos por defecto
	private int codigoExcepcion;
	
	//Definir constructor por defecto
	public minTwoNumbers(){
		super();
		this.codigoExcepcion = 0;
	}	
	
	//Definir constructor con el parametro codigoExcepcion
	public minTwoNumbers(int codigoExcepcion){
		super();
		this.codigoExcepcion = codigoExcepcion;
	}
	
	//Dependiedno del codigoExcepcion mostramos un mensaje o otro
	@Override
	public String getMessage() {		
		String mensaje = "Debe introducir como minimo 2 numero";
		return mensaje;		
	}

}
