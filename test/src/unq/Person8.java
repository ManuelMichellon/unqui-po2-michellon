package unq;

import java.sql.Date;

public class Person8 {
	private int age;
	private String name;
	private Date birthDate;
	
	public Person8(int age, String name, Date birthDate) {
		super();
		this.age = age;
		this.name = name;
		this.birthDate = birthDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public Boolean youngerThan(Person8 person) {
		return this.age < person.getAge();
	}
	
	
	
}
