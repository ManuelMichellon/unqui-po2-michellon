package unq;

public class TemporaryPlant extends Employee {
	private String endDate; 
	private Integer extraHours;
		
	public TemporaryPlant(String name, Integer age, String direction, String civilStatus, String dateOfBirth,
			Integer minimunWage, String endDate, Integer extraHours) {
		super(name, age, direction, civilStatus, dateOfBirth, minimunWage);
		this.endDate = endDate;
		this.extraHours = extraHours;
	}
	/**Tomar que date sea Date*/
	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Integer getExtraHours() {
		return extraHours;
	}

	public void setExtraHours(Integer extraHours) {
		this.extraHours = extraHours;
	}

	@Override
	public Integer grossSalary() {
		return (this.getMinimunWage() + (this.getExtraHours() * 40)); 
	}

	@Override
	public Integer netSalary() {
		return this.grossSalary() - this.withHoldings();
	}

	@Override
	public Integer withHoldings() {
		return this.healthInsurance() + this.retirementContribution();
	}
	

	@Override
	public Integer healthInsurance() {
		return (((this.grossSalary() * 10)/100) + this.oldAge());
	}

	private int oldAge() {
		int res = 0;
		if (this.getAge() > 50) {
			res = 25;
		}
		return res;
	}

	@Override
	public Integer retirementContribution() {
		return (((this.grossSalary() * 10)/100) + (this.getExtraHours() * 5));
	}
	
	
	

}
