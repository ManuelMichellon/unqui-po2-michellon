package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.Person9;
import unq.TeamWork;

class TeamWorkTestCase {
	private Person9 person; 
	private Person9 secondPerson;
	private TeamWork team;
	
	@BeforeEach
	public void setUp() {
		person = new Person9("Manu", "Miche", 20);
		secondPerson = new Person9("Diego", "Lopez", 20);
		
		ArrayList<Person9> array = new ArrayList<Person9>();
		array.add(person);
		array.add(secondPerson);
		
		team = new TeamWork("Unq", array);
		
	}
	

	@Test
	void testAgeAverage() {
		assertEquals(team.ageAverage(), 20);
	}

}
