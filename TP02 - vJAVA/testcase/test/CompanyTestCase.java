package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.Company;
import unq.Employee;
import unq.PermanentPlant;
import unq.TemporaryPlant;

class CompanyTestCase {
	private Company company;
	private TemporaryPlant employee1;
	private PermanentPlant employee2;
	
	@BeforeEach
	void setUp() throws Exception {
		 
		employee1 = new TemporaryPlant("Manu", 23, "Berazategui", "Single", "19970424", 60000, "20201231", 90);
		employee2 = new PermanentPlant("Leo", 46, "Gutierrez", "Married", "19720317", 120000, 2, 2);
	
		
		company = new Company("Dev", 200902032);
		
		company.setEmployee(employee1);
		company.setEmployee(employee2);
	}
	
	@Test
	void testCompany() {
		company = new Company("Dev", 200902032);
		assertEquals(company.getName(), "Dev");
	}

	@Test
	void testEmployees() {
		assertEquals(company.getEmployees().size(), 2);
	}
	
	@Test
	void testNetSalaries() {
		assertEquals(company.totalNetSalaries(), 140765);
	}

}
