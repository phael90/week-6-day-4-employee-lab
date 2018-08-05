import management.Director;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;


import static org.junit.Assert.assertEquals;

public class TestDirector {

    Director employee;

    @Before
    public void before(){
        employee = new Director("Davina", "AB123456C", 40000.00, 500000.00);
    }

    @Test
    public void budget(){
        assertEquals(500000.00, employee.getBudget(), 0.00);
    }

    @Test
    public void getName(){
        assertEquals("Davina", employee.name());
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
        assertEquals(400.00, employee.payBonus(),0.00);
    }
}
