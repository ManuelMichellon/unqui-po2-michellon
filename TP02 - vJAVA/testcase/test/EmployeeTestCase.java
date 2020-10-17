package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.PermanentPlant;
import unq.TemporaryPlant;

class EmployeeTestCase {
	
	private TemporaryPlant employee1;
	private PermanentPlant employee2;

	@BeforeEach
	void setUp() throws Exception {
		employee1 = new TemporaryPlant("Manu", 23, "Berazategui", "Single", "19970424", 60000, "20201231", 90);
		employee2 = new PermanentPlant("Leo", 46, "Gutierrez", "Married", "19720317", 120000, 2, 2);
	}

	@Test
	void testPermanentPlantGrossSalary() {
		assertEquals(employee2.grossSalary(), 120500);
	}
	
	@Test 
	void testTemporaryPlantGrossSalary() {
		assertEquals(employee1.grossSalary(), 63600);
	}
	
	@Test
	void testPermanentPlantWithHoldings() {
		assertEquals(employee2.withHoldings(), 30165);
	}
	
	@Test
	void testTemporaryPlantWithHoldings() {
		assertEquals(employee1.withHoldings(), 13170);
	}
	
	@Test 
	void testPermanentPlantNetSalary() {
		assertEquals(employee2.netSalary(), 90335);
	}

	@Test 
	void testTemporaryPlantNetSalary() {
		assertEquals(employee1.netSalary(), 50430);
	}
}
