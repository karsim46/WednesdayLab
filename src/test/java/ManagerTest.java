import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Princess", "AB12345678", 90000, "PG-13 Dept");
    }

    @Test
    public void hasName() {
        assertEquals("Princess", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("AB12345678", manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(90000, manager.getSalary(), 0);
    }

    @Test
    public void hasDeptName() {
        assertEquals("PG-13 Dept", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(10000);
        assertEquals(100000, manager.getSalary(),0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(900, manager.payBonus(),0);
    }
}
