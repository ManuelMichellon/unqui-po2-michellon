import Employee from './employee'

class PermanentPlant extends Employee{
    constructor(name, direction, civilStatus, dateOfBirth, minimunWage, numberOfChildren, antiquity) {
        super(name, direction, civilStatus, dateOfBirth,minimunWage);
        this.numberOfChildren = numberOfChildren;
        this.antiquity = antiquity;
    }
    
    /**GETTERS */
    getNumberOfChilder(){
        return this.numberOfChildren;
    }

    getAntiquity(){
        return this.antiquity;
    }
    /**SETTERS */
    setNumberOfChilder(number){
        this.numberOfChildren = numberOfChildren;
    }

    setAtiquity(antiquity){
        this.antiquity = antiquity;
    }

    
    /**FUNCTIONS*/
    netSalary(){
        return(this.grossSalary() - this.withHoldings());
    }
    /**COMO SACO EL GET DE LA SUPER CLASE MINIMUN WAGE */
    grossSalary(){
        return(this.getMinimumWage() + this.familySalary() + this.antiquity());
    }

    familySalary(){
        return(this.childAllowance() + this.spousalAllowance())
    }

    childAllowance(){
        return(this.getNumberOfChildren() * 150);
    }

    spousalAllowance(){
        if(this.getCivilSatus() === 'Married'){
            return 100;
        }
        else{
            return 0;
        }
    }

    antiquity(){
        return(this.getAntiquity() * 50);
    }

    withHoldings(){
        return(this.prepairdHealth() + this.retirementContribution());
    }

    prepairdHealth(){
        return((this.grossSalary()*10)/100 + (this.getNumberOfChildren() * 20) );
    }

    retirementContribution(){
        return((this.grossSalary()*15)/100);
    }
}
