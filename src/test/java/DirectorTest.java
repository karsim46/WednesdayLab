import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Connor", "FG12345678", 500000, "PG-13 Dept", 1000000);
    }

    @Test
    public void hasName() {
        assertEquals("Connor", director.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("FG12345678", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(500000, director.getSalary(), 0);
    }

    @Test
    public void hasDeptName() {
        assertEquals("PG-13 Dept", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(100000);
        assertEquals(600000, director.getSalary(),0);
    }

//    @Test
//    public void canGetBonus(){
//        assertEquals(5000, director.payBonus(),0);
//    }

    @Test
    public void hasBudget(){
        assertEquals(1000000, director.getBudget(), 0);
    }

    @Test
    public void negativeRaiseWillFail(){
        director.raiseSalary(-10000);
        assertEquals(500000, director.getSalary(),0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(10000, director.payBonus(),0);
    }
}
