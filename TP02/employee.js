
class Employee {
    constructor(name, direction, civilStatus, dateOfBirth, minumumWage){
        this.name = name;
        this.setAge();
        this.direction = direction;
        this.civilStatus = civilStatus;
        this.dateOfBirth = dateOfBirth;
        this.minumumWage = minumumWage;
    }

    /**GETTERS */
    getName(){
        return this.name;
    }

    getAge(){
        return this.age;
    }

    getDirection(){
        return this.direction;
    }

    getCivilStatus(){
        return this.civilStatus;
    }

    getDateOfBirth(){
        return this.dateOfBirth;
    }

    getMinumumWage(){
        return this.minumumWage;
    }

    /**SETTERS */
    setName(name){
        this.name = name;
    }

    setAge(dateOfBirth){
        var date = new Date().toISOString().substr(0, 10);
        this.age = this.differenceInYears(dateOfBirth, date);
    }

    setDirection(direction){
        this.direction = direction
    }

    setCivilStatus(civilStatus){
        this.civilStatus = civilStatus
    }
    
    setDateOfBirth(dateOfBirth){
        this.dateOfBirth = dateOfBirth
    }

    setMinumumWage(minimunWage){
        this.minumumWage = minumumWage
    }

    /**FUNCTIONS*/
    netSalary(){

    }

    grossSalary(){
        
    }

    netSalary(){

    }

    withHoldings(){

    }

    healtInsurance(){
        
    }

    retirementContribution(){
        
    }

    differenceInYears(date1, date2){
        var diff =(dt2.getTime() - dt1.getTime()) / 1000;
        diff /= (60 * 60 * 24);
        return Math.abs(Math.round(diff/365.25));
    }
}