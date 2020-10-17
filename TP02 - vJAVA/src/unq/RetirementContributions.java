package unq;

public class RetirementContributions {
	private String name;
	private String direction;
	private String issueDate;
	private Integer grossSalary;
	private Integer netSalary;
	private Concept concept;
	
	public RetirementContributions(String name, String direction, String issueDate, Integer grossSalary,
			Integer netSalary, Concept concept) {
		super();
		this.name = name;
		this.direction = direction;
		this.issueDate = issueDate;
		this.grossSalary = grossSalary;
		this.netSalary = netSalary;
		this.concept = concept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public Integer getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(Integer grossSalary) {
		this.grossSalary = grossSalary;
	}

	public Integer getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(Integer netSalary) {
		this.netSalary = netSalary;
	}

	public Concept getConcept() {
		return concept;
	}

	public void setConcept(Concept concept) {
		this.concept = concept;
	}
	
	
}
