import Management.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEmployee {

    int percentage;
    Manager employee;

    @Before
    public void before(){
    employee = new Manager("bob", 56743343, 35000, "Ice cream");
}

    @Test
    public void testGetName(){
    assertEquals("bob", employee.getName());
}
    @Test
    public void testgetNI(){
    assertEquals(56743343, employee.getNationalInsurance(), 1);
}
    @Test
    public void testgetSalary(){
        assertEquals(35000, employee.getSalary(), 1);
    }
    @Test
    public void testRaiseSalary(){
        employee.raiseSalary(5000);
        assertEquals(40000, employee.getSalary(), 1);
    }
    @Test
    public void testPayBonusOnePercent(){
        employee.payBonus(percentage = 1);
        assertEquals(35350, employee.getSalary(), 1);
    }
    @Test
    public void testPayBonusTwoPercent(){
        employee.payBonus(percentage = 2);
        assertEquals(35700, employee.getSalary(), 1);
    }
    @Test
    public void testGetDeptName(){
        assertEquals("Ice cream", employee.getDepartment());
    }
    @Test
    public void testRaiseNegativeSalary(){
        employee.raiseSalary(-500);
        assertEquals(35000, employee.getSalary(), 1);
    }
    @Test
    public void testChangeEmployeeNameWithNull(){
        employee.setName("");
        assertEquals("bob", employee.getName());
    }
    @Test
    public void testChangeEmployeeNameWith(){
        employee.setName("jason");
        assertEquals("jason", employee.getName());
    }
}
