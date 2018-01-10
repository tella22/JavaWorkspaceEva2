package cuentaCorriente2;

public class cuentaCorriente2 {

	private String numCuenta;
	private double saldo;
	private String nombreCliente;

	cuentaCorriente2(String cuenta, Double cantidad, String cliente) {

	}

	public void ingresaEfectivo(Double cantidad) {
		saldo+=cantidad;
	}

	public boolean retiraEfectivo(Double cantidad) {
		if (cantidad>saldo) {
			System.out.println("no puedes retirar saldo de la cuenta");
			return false;
		}else {
			System.out.println("saldo retirado de la cuenta");
			return true;
		}
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double visualiza(){
		return saldo;
	}

}
