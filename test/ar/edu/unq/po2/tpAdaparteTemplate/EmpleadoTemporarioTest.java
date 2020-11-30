package ar.edu.unq.po2.tpAdaparteTemplate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTemporarioTest {
	
	Empleado manu;	
	@BeforeEach
	public void setUp() {
		
		this.manu = new Temporario("Manu",40d,false,true);
	}

	@Test
	void testEmpleadoCreado() {
		
		assertEquals(manu.getNombre(),"Manu");
	
	}
	
	@Test
	void testPidoSueldoAunEmpleadoTemporario() {
		
		double sueldo = manu.sueldo();
		
		assertEquals(1131d,sueldo);
	}

}
