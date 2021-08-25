import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Nathan", "EF12345678", 60000);
    }

    @Test
    public void hasName() {
        assertEquals("Nathan", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("EF12345678", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(60000, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(6000);
        assertEquals(66000, databaseAdmin.getSalary(),0);
    }
    @Test
    public void canGetBonus(){
        assertEquals(600, databaseAdmin.payBonus(),0);
    }

    @Test
    public void nameChangeWillFailIfNameNull(){
        databaseAdmin.setName(null);
        assertEquals("Nathan", databaseAdmin.getName());
    }
}
