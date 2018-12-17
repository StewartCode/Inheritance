import Staff.Employee;
import TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDataBaseAdmin {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("steve", 5654331, 10000);
    }

    @Test
    public void TestNameCanBeGot(){
        assertEquals("steve", databaseAdmin.getName());
    }
}
