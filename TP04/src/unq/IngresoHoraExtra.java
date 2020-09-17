package unq;

public class IngresoHoraExtra extends Ingreso {

	public IngresoHoraExtra(String mes, String concepto, int monto) {
		super(mes, concepto, monto);
	}

	@Override
	public int getImpuesto() {
		return 0;
	}
}
