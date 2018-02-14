
public class Principal {

	static Integer contadorVector=0;
	public static void main(String[] args) {
		Integer cuantosEmpleados, cuantosAdministrativos, cuantosMaquinistas, cuantosEmpleadosAdministrativos, cuantosEmpleadosTotal;
		Empleado [] empleados;
		Administrativo [] administrativos;
		Maquinista [] maquinistas;
		String nombres[]={"Luis","Jesus","Jaime","Carlos","Rafa","Jose","Pilar","Maria","Paola","Lolo"};
		String estudios[]={"Informatica","Administracion","Peluqueria","Marketing","Derecho","Torcido"};
		
		cuantosEmpleados = Leer.pedirEntero("Cuantos empleados hay en la empresa?");
		cuantosAdministrativos = Leer.pedirEntero("Cuantos administrativos hay en la empresa?");
		cuantosMaquinistas = Leer.pedirEntero("Cuantos maquinistas hay en la empresa?");
		cuantosEmpleadosAdministrativos=cuantosEmpleados+cuantosAdministrativos;
		cuantosEmpleadosTotal=cuantosEmpleadosAdministrativos+cuantosMaquinistas;
		empleados = new Empleado[cuantosEmpleados+cuantosAdministrativos+cuantosMaquinistas];
		
		crearEmpleados(empleados,nombres, cuantosEmpleados);
		crearAdministrativos(empleados,nombres,estudios,cuantosEmpleadosAdministrativos);
		crearMaquinistas(empleados,nombres, cuantosMaquinistas, cuantosEmpleadosTotal);
		
		mostrarDatos(empleados);Leer.mostrarEnPantalla(" ");
		
	}//main
	
	public static void crearEmpleados(Empleado [] empleados, String[] nombres, Integer cuantosEmpleados){
		for (; contadorVector < cuantosEmpleados; contadorVector++) {
			empleados[contadorVector]=new Empleado(nombres[(int) (Math.random()*nombres.length)],(int)(Math.random()*20+20));			
		}
	}
	
	public static void crearAdministrativos(Empleado [] empleados, String[] nombres, String[] estudios, Integer cuantosEmpleadosAdministrativos) {
		for ( ;contadorVector < cuantosEmpleadosAdministrativos; contadorVector++) {
			empleados[contadorVector]=new Administrativo(nombres[(int) (Math.random()*nombres.length)],(int)(Math.random()*20+20),
					estudios[(int) (Math.random()*estudios.length)],(int)(Math.random()*20+1));
		}
	}
	
	public static void crearMaquinistas(Empleado [] empleados, String[] nombres, Integer cuantosMaquinistas, Integer cuantosEmpleadosTotal){
		for (; contadorVector < cuantosEmpleadosTotal; contadorVector++) {
			empleados[contadorVector]=new Maquinista(nombres[(int) (Math.random()*nombres.length)],(int)(Math.random()*20+20),(int)(Math.random()*20+1),(int)(Math.random()*5));
		}
	}
	
	public static void mostrarDatos(Empleado [] v){
		for (int i = 0; i < v.length; i++) {
			v[i].visualizarTodosDatos();
			Leer.mostrarEnPantalla("______________________________________");
		}
	}

}//Principal
