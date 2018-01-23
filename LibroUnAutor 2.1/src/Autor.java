
public class Autor {

	private static Autor[] vecAutor = new Autor[100];
	private static Integer lista=0;
	
	private String nombre, email;
	private Character genero;
	
	Autor(String nombre, String email, Character genero){
		this.nombre=nombre;
		this.email=email;
		this.genero=genero;
		vecAutor[lista] = this;
		lista++;
	}
	
	Autor(Integer posicion, String nombre, String email, Character genero){
		this.nombre=nombre;
		this.email=email;
		this.genero=genero;
		vecAutor[posicion] = this;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail() {
		
	}
	
	public Character getGenero(){
		return genero;
	}
	
	public static String cadenaAutor(Integer posicion){
		return "Autor[nombre = " + vecAutor[posicion].getNombre()+ ", email = " 
	+ vecAutor[posicion].getEmail() + ", genero = " + vecAutor[posicion].getGenero() + "]";
	}
	
	public static Integer totalAutores() {
		return lista;
	}
	
	public static Autor getVecAutor(Integer posicion) {
		return vecAutor[posicion];
	}

	
}
