package Management;

import Staff.Employee;

public class Manager extends Employee {

    private String department;

    public Manager(String name, double nationInsurance, double salary, String department){
        super(name, nationInsurance, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

}
