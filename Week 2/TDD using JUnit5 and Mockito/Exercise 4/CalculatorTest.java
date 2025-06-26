import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();  // Arrange
        System.out.println("Setting up Calculator");
    }

    @After
    public void tearDown() {
        calculator.close();  
        calculator = null;
        System.out.println("Tearing down Calculator\n");
    }

    @Test
    public void testAddPositiveNumbers() {
        
        int result = calculator.add(2, 3);//Act

        assertEquals(5, result);//Assert
    }

    @Test
    public void testAddNegativeNumbers() {
        int result = calculator.add(-1, -2);
        assertEquals(-3, result);
    }
}
