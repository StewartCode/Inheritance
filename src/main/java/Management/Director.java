package Management;

public class Director extends Manager {

    double budget;


    public Director(String name,double nationInsurance,double salary,String department, double budget) {
        super(name,nationInsurance,salary,department);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

}
