package unq;

import java.util.ArrayList;

public class Company {
	private ArrayList<Employee> employees;
	private String name;
	private Integer cuit;
	private ArrayList<RetirementContributions> retirementContributions;
	
	public Company(String name, Integer cuit) {
		super();
		this.name = name;
		this.cuit = cuit;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
	public void setEmployee(Employee employee) {
		this.employees.add(employee);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCuit() {
		return cuit;
	}

	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}

	public ArrayList<RetirementContributions> getRetirementContributions() {
		return retirementContributions;
	}

	public void setRetirementContributions(ArrayList<RetirementContributions> retirementContributions) {
		this.retirementContributions = retirementContributions;
	}
	
	/**METHODS*/
	public Integer totalNetSalaries() {
		Integer res = 0;
		for (Employee employees2 : employees) {
			res = res + employees2.netSalary();
		}
		return res;
	}
	
	public Integer totalGrossSalaries() {
		Integer res = 0; 
		for (Employee employees2 : employees) {
			res = res + employees2.grossSalary();
		}
		return res;
	}
	
	public Integer totalWithholdings() {
		Integer res = 0;
		for (Employee employees2 : employees) {
			res = res + employees2.withHoldings();
			}
		return res;
	}
	
	public void liquidation(ArrayList<Employee> employees) {
		
	}
}
