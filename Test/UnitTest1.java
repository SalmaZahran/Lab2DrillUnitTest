import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UnitTest1 {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5,calc.add(2,3));
    }

    @Test
    public void testSubtract () {
        Calculator calc = new Calculator();
        assertEquals(2, calc.subtract(9,7));
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2,3));
    }

    @Test
    public void testDivide () {
        Calculator calc = new Calculator();
        assertEquals(3, calc.divide(9,3));
    }
}


