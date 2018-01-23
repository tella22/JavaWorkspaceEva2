import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class GestionLibroAutor {
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Integer opcion, listaAutor;
		String nombreAutor;
		Integer posicion = 0;
		Autor autor=null;
		
		do {
			mostrarMenu();
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				new Autor("JATG", "JATG@JATG.JATG", 'm');
				break;
			case 2:
				do {
					System.out.println("¿Que autor quieres modificar?");
					listaAutor=teclado.nextInt();
				}while(listaAutor>Autor.totalAutores());
				System.out.println("Introduce el nombre");
				nombreAutor=teclado.nextLine();
				new Autor(listaAutor, nombreAutor, autor.getEmail(), autor.getGenero());
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				for (posicion = 0; posicion < Autor.totalAutores(); posicion++) {
					System.out.println("posicion " + (posicion+1) +": "+ Autor.cadenaAutor(posicion));
				}
				break;
			}

		} while (opcion != 0);
	}

	public static void mostrarMenu() {
		System.out.println("1. Crear libros");
		System.out.println("2. Modificar autor");
		System.out.println("3. Modificar libro");
		System.out.println("4. Listado de libros");
		System.out.println("5. Listado de autores");
		System.out.println("0. Salir");
	}

}
