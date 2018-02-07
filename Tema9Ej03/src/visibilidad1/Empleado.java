package visibilidad1;

public class Empleado {

	private static Integer sueldoBase=1000;
	private Integer incrementoSueldo;
	private String nombre;
	private int edad;
	final private static String nombreEmpresa="El�ctrica, Sa";
	
	Empleado(String nombre, Integer edad, Integer incrementoSueldo){
		this.nombre = nombre;
		this.edad = edad;
		this.incrementoSueldo = this.sueldoBase.intValue() * incrementoSueldo;
	}
	
	public void visualizar(){
		
		Leer.mostrarEnPantalla("nombre: "+nombre + "\nedad: " +edad);
	}
	
	public void setSueldoBase(Integer sueldoBase) {
		
		this.sueldoBase = sueldoBase;
		
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	
	
}
