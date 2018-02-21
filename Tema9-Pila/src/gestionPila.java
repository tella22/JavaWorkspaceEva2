public class gestionPila {
	public static void main(String[] args) {
		Pila pila1 = new Pila();
		Pila pila2 = new Pila();
		int opcion;
		
//		for(int i=0; i<500; i++) {
//			pila2.addPila((int) Math.floor(Math.random() * (99999999 - 0 +1)));
//			pila1.addPila((int) Math.floor(Math.random() * (99999999 - 0 +1)));
//		}
		
		do {
			Leer.mostrarEnPantalla("1. eliminar pila");
			Leer.mostrarEnPantalla("2. añadir numero a la pila");
			Leer.mostrarEnPantalla("3. invertir pila");
			opcion=Leer.pedirEntero("opcion del case");
		switch(opcion){
		case 1:
			pila1.popPila();
			break;
		case 2:
			pila1.addPila(Leer.pedirEntero("introduce un numero para añadir a la pila"));
			Leer.mostrarEnPantalla("______________");
			pila1.visualizar();
			Leer.mostrarEnPantalla("______________");
			break;
		case 3:
			Leer.mostrarEnPantalla("______________");
			Leer.mostrarEnPantalla("pila ordenada ");
			Leer.mostrarEnPantalla("______________");
			pila1.visualizar();
			Leer.mostrarEnPantalla("______________");
			pila1.invPila();
			Leer.mostrarEnPantalla("______________");
			Leer.mostrarEnPantalla("pila invertida");
			Leer.mostrarEnPantalla("______________");
			pila1.visualizar();
			Leer.mostrarEnPantalla("______________");
			break;
		}
		}while(opcion != 0);
	}
}
