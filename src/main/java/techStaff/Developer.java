package techStaff;

import staff.Employee;

public class Developer extends Employee {

    public Developer(String name, String ni, double salary){
        super(name, ni, salary);
    }

    public double payBonus(){
        return super.payBonus() * 2;
    }

}
