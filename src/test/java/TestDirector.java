import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestDirector {

    Director director;

    @Before
    public void before(){
        director = new Director("billy", 6765432, 70000,"top", 100000);
    }

    @Test
    public void TestTheBudget(){
        assertEquals(100000, director.getBudget(), 1);
    }
}
