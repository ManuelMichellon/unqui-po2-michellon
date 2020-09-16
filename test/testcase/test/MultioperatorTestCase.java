package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.Multioperator;

class MultioperatorTestCase {
	
	private Multioperator multioperator;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		//Generate Multioperator
		multioperator = new Multioperator();
		
		//Add elements to array
		multioperator.addElement(1);
		multioperator.addElement(2);
		multioperator.addElement(3);
		multioperator.addElement(4);
		
	}
	
	
	@Test
	public void testSum() {
		Integer sumMulti = multioperator.sumNumbers();
		
		assertEquals(sumMulti, 10);
	}
	
	@Test
	public void testSubtract() {
		Integer subtractMulti = multioperator.subtractNumbers();
		
		assertEquals(subtractMulti, 2);
	}
	
	@Test
	public void testMultiply() {
		Integer multMulti = multioperator.multiplyNumbers();
		
		assertEquals(multMulti, 24);
	}

}
