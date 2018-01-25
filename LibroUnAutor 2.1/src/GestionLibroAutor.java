import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class GestionLibroAutor {
	
	public static void main(String[] args) {
		
		Autor[] vecAutor = null;
		Libro[] vecLibros = null;
		Scanner teclado = new Scanner(System.in);
		Integer opcion, listaAutor, cantidad;
		String nombreAutor;
		Integer posicion = 0;
		Autor autor=null;
		Libro libro = null;
		
		do {
			mostrarMenu();
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				do {
					cantidad = Leer.pedirEntero("cantidad de libros a crear");

				}while(cantidad<1);
				vecLibros = crearVectorLibros(cantidad);
				vecAutor = crearVectorAutor(cantidad);
				crearLibros(vecLibros, vecAutor);
				break;
			case 2:
				mostrarAutores(vecAutor);
				do {
					listaAutor=Leer.pedirEntero("¿Que autor quieres modificar?");
				}while(listaAutor>Autor.totalAutores());
				autor.setEmail(Leer.pedirCadena("Introduce el email modificado"));
				break;
			case 3:
				do {
					listaAutor=Leer.pedirEntero("¿Que libro quieres modificar?");
				}while(listaAutor>Autor.totalAutores());
				libro.setPrecio(Leer.pedirDouble("Introduce el precio del libro modificado"));
				libro.setCantidad(Leer.pedirEntero("Introduce la cantidad del libro modificado"));
				break;
			case 4:
				
				break;
			case 5:
				for (posicion = 0; posicion < Autor.totalAutores(); posicion++) {
					System.out.println("posicion " + (posicion+1) +": "+ autor.cadenaAutor());
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
	
	public static Libro[] crearVectorLibros(Integer vectorLongitud){
		Libro[] vecLibros = null;
		vecLibros = new Libro[vectorLongitud];
		return vecLibros;
	}
	
	public static Autor[] crearVectorAutor(Integer vectorLongitud){
		Autor[] vecAutor = null;
		vecAutor = new Autor[vectorLongitud];
		return vecAutor;
	}
	
	public static void mostrarAutores(Autor[] vecAutor) {
		int i;
		System.out.println("Libros");
		System.out.println("____________");
		for(i=0; i< vecAutor.length && vecAutor[i] != null ; i++) {
			System.out.println((i)+ ". " + vecAutor[i].cadenaAutor());
		}
		
	}
	
	public static void crearLibros(Libro[] vecLibros, Autor[] vecAutor) {
		int indLibro, indTitulo;
		String titulo, nombreAutor, email, genero;
		char generoChar;
		Autor autor;
		Double precio;
		Integer cantidad;
		
		for (indLibro = 0; indLibro < vecLibros.length; indLibro++) {
			titulo = Leer.pedirCadena("Titulo del libro?");
			precio = Leer.pedirDouble("Precio del libro?");
			cantidad = Leer.pedirEntero("Cantidad de libros?");
			nombreAutor = Leer.pedirCadena("Nombre del autor?");
			email = Leer.pedirCadena("email del autor?");
			genero = Leer.pedirCadena("genero del autor?");
			generoChar=genero.charAt(0);
			autor = new Autor(nombreAutor, email, generoChar);
			vecAutor[indLibro] = new Autor(nombreAutor, email, generoChar);
			vecLibros[indLibro] = new Libro(titulo, autor, precio, cantidad);
			}
		} 
}

 	
