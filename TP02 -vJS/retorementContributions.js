
class RetorementContributions {
    constructor(employeeName, employeeDirection, date, employeeGrossSalary, employeeNetSalary, concept){
        this.employeeName = employeeName;
        this.employeeDirection = employeeDirection;
        this.date = date;
        this.employeeGrossSalary = employeeGrossSalary;
        this.employeeNetSalary = employeeNetSalary;
        this.concept = concept;
    }

    /**GETTERS */
    getEmployeeName(){
        this.employeeName;
    }

    getEmployeeDirection(){
        this.employeeDirection;
    }

    getDate(){
        this.date;
    }

    getEmployeeGrossSalary(){
        this.employeeGrossSalary;
    }

    getEmployeeNetSalary(){
        this.employeeNetSalary;
    }

    getConcept(){
        this.concept;
    }
    /**SETTERS */
    setEmployeeName(name){
        this.employeeName = name;
    }

    setEmployeeDirection(direction){
        this.employeeDirection = direction;
    }

    setDate(date){
        this.date = date;
    }

    setEmployeeGrossSalary(grossSalary){
        this.employeeGrossSalary = grossSalary;
    }

    setEmployeeNetSalary(netSalary){
        this.employeeNetSalary = netSalary;
    }

    setConcept(concept){
        this.concept = concept;
    }
}