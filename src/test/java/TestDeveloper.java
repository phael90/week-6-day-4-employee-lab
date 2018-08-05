import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {

    Employee employee;

    @Before
    public void before(){
        employee = new Developer("Dev", "AB123456C", 40000.00);
    }

    @Test
    public void getName(){
        assertEquals("Dev", employee.name());
    }

    @Test
    public void getNi(){
        assertEquals("AB123456C", employee.ni());
    }

    @Test
    public void getSalary(){
        assertEquals(40000.00, employee.salary(),0.00);
    }

    @Test
    public void testRaiseSalary(){
        employee.raiseSalary(10000.00);
        assertEquals(50000.00, employee.salary(),0.00);
    }

    @Test
    public void getBonus(){
        assertEquals(800.00, employee.payBonus(),0.00);
    }
}
