package staff;

public abstract class Employee {

    private String name;
    private String ni;
    private double salary;


    public Employee(String name, String ni, double salary){
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String name(){
        return this.name;
    }

    public String ni(){
        return this.ni;
    }

    public double salary(){
        return this.salary;
    }

    public void raiseSalary(double amount){
        if (amount > 0 ){
        this.salary += amount;}
    }

    public double payBonus(){
        return this.salary / 100;
    }

}
