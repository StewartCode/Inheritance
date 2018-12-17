package Staff;

public abstract class Employee {
    private String name;
    private double nationalInsurance;
    private double salary;

    public Employee(String name, double nationalInsurance, double salary){
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }


    public double getNationalInsurance() {
        return nationalInsurance;
    }


    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double param){
        if(param > 0){
            this.salary += param;
        }
    }

    public double payBonus(int x){
        double bonus = this.salary / 100;
        bonus = bonus * x;
        return this.salary = this.salary + bonus;
    }

    public void setName(String name) {
        if(name.isEmpty()){

        }else{
            this.name = name;
        }

    }
}
