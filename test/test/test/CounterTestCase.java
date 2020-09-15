package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.Counter;

class CounterTestCase {

	 private Counter counter;    
	    
	    /**
	     * Crea un escenario de test básico, que consiste en un contador 
	     * con 10 enteros
	     * 
	     * @throws Exception
	     */
	    @BeforeEach
	    public void setUp() throws Exception {
	   	 
	   	 //Se crea el contador
	   	 counter = new Counter();
	   	 
	   	 //Se agregan los numeros. Un solo par y nueve impares
	   	 counter.addNumber(1);
	   	 counter.addNumber(3);
	   	 counter.addNumber(5);
	   	 counter.addNumber(7);
	   	 counter.addNumber(9);
	   	 counter.addNumber(1);
	   	 counter.addNumber(1);
	   	 counter.addNumber(1);
	   	 counter.addNumber(1);
	   	 counter.addNumber(4);
	    }
	 
	    /**
	     * Verifica la cantidad de pares
	     */
    
	    @Test
	    public void testEvenNumbers() {

	   		 int amount = counter.getEvenOcurrences();
	   			 
	   	 // I check the amount is the expected one
	   		 assertEquals(amount, 1);
	    }
	    
	    @Test
	    public void testNotEvenNumbers() {

	   	 // Getting the even occurrences
	   		 int amount = counter.getNotEvenOcurrences();
	   			 
	   	 // I check the amount is the expected one
	   		 assertEquals(amount, 9);
	    }
	    
	    @Test
	    public void testMultiple() {

	   	 // Getting the even occurrences
	   		 int multiple = counter.getMultiplesOf(4);
		 // I check the amount is the expected one
	   		 assertEquals(multiple, 1);	 
	   		 
	    }
	 
	}
