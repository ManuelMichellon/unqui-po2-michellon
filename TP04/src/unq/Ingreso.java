package unq;

public class Ingreso {

	private String mes;
	private String concepto;
	private int monto;
	
	public Ingreso(String mes, String concepto, int monto) {
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
	}

	public int getMontoImponible() {
		return this.monto;
	}

	public int getImpuesto() {
		
		return this.monto * 2 / 100;
	}
}
