package management;

import staff.Employee;

public class Director extends Employee {
    private double budget;


    public Director(String name, String ni, double salary, double budget){
        super(name, ni, salary);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }

}
