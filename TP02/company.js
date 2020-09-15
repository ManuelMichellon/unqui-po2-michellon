import Employee from './employee'

class Company {
    constructor(employees, name, cuit){
        this.employees = employees;
        this.name = '',
        this.cuit = '',
        this.liquidation();
    }

    /**GETTERS */
    getEmployees(){
        return this.employees;
    }

    getName(){
        return this.name;
    }

    getCuit(){
        return this.cuit;
    }

    getRetirementContributions(){
        return this.retirementContributions;
    }
    /**SETTERS */
    setEmployees(employees){
        this.employees = employees;
    }

    setName(name){
        this.name = name;
    }

    setCuit(cuit){
        this.cuit = cuit;
    }

    setRetorementContributions(retorementContributions){
        this.retirementContributions = retorementContributions;
    }

    /**FUNCTIONS */
    totalNetSalaries(employees){
        var result = 0;
        for (employee in employees){
            result = result + employee.netSalary();
        }
        return result;
    }

    totalGrossSalaries(employees){
        var result = 0;
        for (employee in employees){
            result = result + employee.grossSalary();
        }
        return result;
    }

    totalWithHoldings(employees){
        var result = 0;
        for (employee in employees){
            result = result + employee.withHoldings();
        }
        return result;
    }

    liquidation(employees){
        var date = new Date().toISOString().substr(0, 10);
        for(employee in employees){
            var concept = new Concept(employee.grossSalary())
            var retorementContributions = new RetorementContributions(employee.getName(), employee.getDirection(), date, employee.grossSalary(),employee.netSalary(), concept);
            this.retirementContributions.push(retorementContributions);
    }
}
}