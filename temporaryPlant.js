import Employee from './employee'

class TemporaryPlant extends Employee{
    constructor(name, direction, civilStatus, dateOfBirth, minimunWage, endDate, extraHours) {
        super(name, direction, civilStatus, dateOfBirth, minimunWage);
        this.endDate = endDate;
        this.extraHours = extraHours;
    }

    /**GETTERS */
    getEndDate(){
        return this.endDate;
    }

    getExtraHours(){
        return this.extraHours;
    }

    /**SETTERS */
    setEndDate(endDate){
        this.endDate = endDate;
    }

    setExtraHours(extraHours){
        this.extraHours = extraHours;
    }

    /**FUNCTIONS*/
    netSalary(){
        return(this.grossSalary() - this.withHoldings());
    }

    grossSalary(){
        return (this.getMinumumWage() + this.getExtraHours() * 40);
    }

    withHoldings(){
        return(this.prepairdHealth() + this.retirementContribution());
    }

    prepairdHealth(){
        return((this.grossSalary() * 10)/100 + this.oldAge());
    }

    oldAge(){
        if(this.getAge() > 50){
            return 25;
        }
        else{
             0;
        }
    }

    retirementContribution(){
        return((this.grossSalary() * 10)/100 + this.getExtraHours() * 5);
    }
}