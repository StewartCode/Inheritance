import Staff.Employee;
import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {

    Developer developer;

    @Before
    public void before() {

        developer = new Developer("jimmy",4536275,40000);
    }

    @Test
    public void testGetName(){
        assertEquals("jimmy", developer.getName());
    }

}
