import management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class TestManager {

    Employee employee;

    @Before
    public void before(){
        employee = new Manager("Bob", "AB123456C", 20000.00, "Sales");
    }

    @Test
    public void getName(){
        assertEquals("Bob", employee.name());
    }

    @Test
    public void getNi(){
        assertEquals("AB123456C", employee.ni());
    }

    @Test
    public void getSalary(){
        assertEquals(20000.00, employee.salary(),0.00);
    }

    @Test
    public void testRaiseSalary(){
        employee.raiseSalary(1.00);
        assertEquals(20001.00, employee.salary(),0.00);
    }

    @Test
    public void getBonus(){
        assertEquals(200.00, employee.payBonus(),0.00);
    }

    @Test
    public void setName(){
        employee.setName("Jim");
        assertEquals("Jim", employee.name());
    }
}
