package ar.edu.unq.po2.tpAdaparteTemplate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


class EmpleadoPasanteTest {
	
	private Empleado manu;
	
	@BeforeEach
	public void setUp() {
		
		this.manu = new Pasante("Manu",40d);
	}

	@Test
	void testAltaDeEmpleado() {
		assertEquals("Manu",manu.getNombre());
	}
	
	@Test
	void testPidoSueldoAEmpleado() {
		
		double sueldo = manu.sueldo();
		double sueldoEsperado = 1392d;
		assertEquals(sueldoEsperado,sueldo);
	}

}
