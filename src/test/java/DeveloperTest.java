import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Simon", "CD12345678", 50000);
    }

    @Test
    public void hasName() {
        assertEquals("Simon", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("CD12345678", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000, developer.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(5000);
        assertEquals(55000, developer.getSalary(),0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(500, developer.payBonus(),0);
    }
}