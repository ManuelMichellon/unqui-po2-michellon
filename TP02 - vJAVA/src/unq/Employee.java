package unq;

public class Employee {
	private String name;
	private Integer age; 
	private String direction;
	private String civilStatus;
	private String dateOfBirth;
	private Integer minimunWage;
	
	public Employee(String name, Integer age, String direction, String civilStatus, String dateOfBirth,
			Integer minimunWage) {
		super();
		this.name = name;
		this.age = age;
		this.direction = direction;
		this.civilStatus = civilStatus;
		this.dateOfBirth = dateOfBirth;
		this.minimunWage = minimunWage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}
	/**Implementar que birthOfDate sea Date y sacar la dif entre hoy y la fecha de nacimiento*/
	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getCivilStatus() {
		return civilStatus;
	}

	public void setCivilStatus(String civilStatus) {
		this.civilStatus = civilStatus;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getMinimunWage() {
		return minimunWage;
	}

	public void setMinimunWage(Integer minimunWage) {
		this.minimunWage = minimunWage;
	}
	
	/**METHODS*/
	public Integer grossSalary() {
		return 0;
	}
	
	public Integer netSalary() {
		return 0;
	}
	
	public Integer withHoldings() {
		return 0;
	}
	
	public Integer healthInsurance() {
		return 0;
	}
	
	public Integer retirementContribution() {
		return 0;
	}
}
