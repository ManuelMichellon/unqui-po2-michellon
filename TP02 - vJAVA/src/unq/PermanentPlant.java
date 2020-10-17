package unq;

public class PermanentPlant extends Employee {
	private Integer numberOfChildren;
	private Integer Antiquity;

	public PermanentPlant(String name, Integer age, String direction, String civilStatus, String dateOfBirth,
			Integer minimunWage, Integer numberOfChildren, Integer Antiquity) {
		super(name, age, direction, civilStatus, dateOfBirth, minimunWage);
		this.numberOfChildren = numberOfChildren;
		this.Antiquity = Antiquity;
		
	}

	public Integer getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(Integer numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	public Integer getAntiquity() {
		return Antiquity;
	}

	public void setAntiquity(Integer antiquity) {
		Antiquity = antiquity;
	}

	@Override
	public Integer grossSalary() {
		return this.getMinimunWage() + this.familySalary() + this.antiquity();
	}

	private Integer antiquity() {
		return this.getAntiquity() * 50;
	}

	private Integer familySalary() {
		return this.childAllowance() + this.spoualAllowance();
	}

	private int spoualAllowance() {
		Integer res = 0; 
		if (this.getCivilStatus() == "Married") {
			res = 100;
		}
		return res;
	}

	private int childAllowance() {
		return this.getNumberOfChildren() * 150;
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
	public Integer retirementContribution() {
		return (this.grossSalary() * 15) / 100;
	}

	@Override
	public Integer healthInsurance() {
		return (((this.grossSalary() * 10) /100 + (this.getNumberOfChildren() * 20)));
	}
	
	
}
