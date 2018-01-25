
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
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Character getGenero(){
		return genero;
	}
	
	public String cadenaAutor(){
		return "Autor[nombre = " + nombre + ", email = " + email + ", genero = "+ genero + "]";
	}
	
	public static Integer totalAutores() {
		return lista;
	}
	
	public static Autor getVecAutor(Integer posicion) {
		return vecAutor[posicion];
	}

	
}
