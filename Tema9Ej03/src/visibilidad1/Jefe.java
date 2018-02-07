package visibilidad1;

public class Jefe extends Empleado{
	
	private static Integer plusSueldo=250;
	private String departamento;
	
	public Jefe(String nombre, Integer edad, Integer incrementoSueldo, String departamento){
		
		super(nombre, edad, incrementoSueldo);
		this.departamento = departamento;
		
	}
	
	public void setPlusSueldo(Integer plusSueldo) {
		
		this.plusSueldo = plusSueldo;
		
	}
	
	public void visualizar() {
		Leer.mostrarEnPantalla("nombre: "+getNombre()+ "edad: "+getEdad()+ "departamento: "+departamento);
	}
	
}
