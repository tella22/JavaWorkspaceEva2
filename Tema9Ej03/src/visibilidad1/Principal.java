package visibilidad1;

public class Principal {

	public static void main(String[] args) {

		Integer opcionMenu;
		Jefe jefe = null;
		Integer newSueldoBase;
		
		do {
		mostrarMenu();
		opcionMenu = Leer.pedirEntero("ELIJA UNA OPCIÓN:");
		
		switch(opcionMenu) {
		
		case 1:
			newSueldoBase=Leer.pedirEntero("introduce el nuevo sueldo base de todos los empleados");
			jefe.setSueldoBase(newSueldoBase);
			break;
		case 2:
			jefe.setPlusSueldo(Leer.pedirEntero("introduce el nuevo plus de todos los jefes"));
			break;
		case 3:
			jefe.visualizar();
			break;
		
		}
		}while(opcionMenu != 0);
		
	}

	public static void mostrarMenu() {
		System.out.println("1. Modificar el sueldo base de todos los empleados");
		System.out.println("2. Modificar el plus de todos los jefes");
		System.out.println("3. Visualuzar los datos de todos los empleados");
		System.out.println("0. Salir");
		System.out.println();
	}

}
