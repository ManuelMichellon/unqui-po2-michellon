package unq;

import java.util.ArrayList;

public class Trabajador {
	private ArrayList<Ingreso> ingresos;
	
	public Trabajador() {
		this.ingresos = new ArrayList<Ingreso>();
	}
	
	public int getMontoImponible() {
		int result = 0; 
		for (Ingreso ingreso : ingresos) {
			result = result + ingreso.getMontoImponible();
		}
		return result;
	}

	public void addIngreso(Ingreso ingreso) {
		this.ingresos.add(ingreso);
		
	}

	public Integer getImpuestoAPagar() {
		int result = 0;
		for (Ingreso ingreso : ingresos) {
			result = result + ingreso.getImpuesto();
		}
		return result;
	}

	public Integer getTotalPercibido() {
		return (this.getMontoImponible() - this.getImpuestoAPagar());
	}

	
}
