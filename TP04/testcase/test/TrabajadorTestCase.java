package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.Ingreso;
import unq.IngresoHoraExtra;
import unq.Trabajador;

class TrabajadorTestCase {
	private Trabajador trabajador;
	private Ingreso ingreso;
	private IngresoHoraExtra ingresoExtra;

	@BeforeEach
	public void setup() {
		ingreso = new Ingreso("Septiembre", "Varios", 50);
		ingresoExtra = new IngresoHoraExtra("Septiembre", "Proyecto", 30);
		
		
		trabajador = new Trabajador();
		
		trabajador.addIngreso(ingreso);
		trabajador.addIngreso(ingresoExtra);

	}
	
	@Test
	void testGetMontoImponible() {
		assertEquals(trabajador.getMontoImponible(), 80);
	}
	
	@Test
	void testGetImpuestoAPagar() {
		assertEquals(trabajador.getImpuestoAPagar(), 1);
	}

	@Test
	void testGeTotalPercibido() {
		assertEquals(trabajador.getTotalPercibido(), 79);
	}
}
