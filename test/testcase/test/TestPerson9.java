package test;

import java.util.ArrayList;

import unq.Person9;
import unq.TeamWork;

public class TestPerson9 {
	
	
	public static void main(String[] args) {
		Person9 person = new Person9("Manuel", "Miche", 23);
		Person9 secondperson = new Person9("Axel", "DeMarco", 27);
		Person9 thirdperson = new Person9("Adriel", "Bernat", 27);
		Person9 quarterperson = new Person9("Juan", "Ramadori", 25);
		Person9 fifthperson = new Person9("Lucas", "Garcia", 23);

		ArrayList<Person9> array = new ArrayList<Person9>();
		
		TeamWork team = new TeamWork("Unq", array);
		
		array.add(person);
		array.add(secondperson);
		array.add(thirdperson);
		array.add(quarterperson);
		array.add(fifthperson);
		
		System.out.println(team.ageAverage());
		
	}
}
