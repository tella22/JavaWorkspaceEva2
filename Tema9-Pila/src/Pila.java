import java.lang.reflect.Array;
import java.util.Arrays;

public class Pila {

	private Integer pila[] = new Integer[500];
	private Integer posicionPila = 0;

	Pila() {
		posicionPila = 0;
	}

	public void popPila() {
		if (pila[0]==null) {
			Leer.mostrarEnPantalla("La pila esta vacia");
		} else {
			posicionPila--;
			System.out.println(pila[posicionPila]);
			System.out.println("el valor en la posicion "+(posicionPila+1)+ " se ha eliminado");
			pila[posicionPila] = null;
		}
	}

	public void addPila(Integer numero) {
		pila[posicionPila] = numero;
		posicionPila++;
	}
	
	public void copyPila(){
		
	}

	public void invPila() {
		Integer aux[] = new Integer[posicionPila];
		Integer cont=0;
		
		for (int i = posicionPila-1; i >= 0; i--) {
			for (int j = 0; j < 1; j++) {
				aux[cont] = pila[i]; 
			}
			cont+=1;
		}
		
		for (int i = 0; i <= posicionPila - 1; i++) {
			pila[i] = aux[i];
		}
	}

	public void visualizar() {
		for (int i = 0; i < posicionPila; i++) {
			System.out.println(pila[i]);
		}

	}

}
