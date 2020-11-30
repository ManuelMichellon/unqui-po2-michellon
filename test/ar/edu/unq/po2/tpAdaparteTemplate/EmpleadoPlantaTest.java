package ar.edu.unq.po2.tpAdaparteTemplate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
class EmpleadoPlantaTest {
	
	private Empleado manu;
	
	@BeforeEach
	public void setUp(){
		
		this.manu = new Planta("Manu",2);
	}

	@Test
	void testAltaDeEmpleado() {
		assertEquals("Manu",manu.getNombre());
	}
	
	@Test
	void testPidoSueldoAEmpleado() {
		
		double sueldo = manu.sueldo();
		double sueldoEsperado = 2871d;
		assertEquals(sueldoEsperado,sueldo);
	}

}
