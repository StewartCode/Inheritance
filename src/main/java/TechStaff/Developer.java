package TechStaff;

import Staff.Employee;

public class Developer extends Employee {

    public Developer(String name,double nationalInsurance,double salary) {
        super(name,nationalInsurance,salary);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}

