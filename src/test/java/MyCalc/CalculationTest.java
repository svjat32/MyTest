package MyCalc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculationTest {
    private Calculation calculation = new Calculation();
    @Test
    public void testSum() throws Exception{
        Assert.assertEquals(10, calculation.sum(2,8));
    }
    @Test
    public void testdiff() throws Exception{
        Assert.assertEquals(3,calculation.diff(5,2));
    }
    @Test
    public void testmult() throws Exception{
        Assert.assertEquals(6,calculation.mult(3,2));
    }
    @Test
    public void testdev() throws Exception{
        Assert.assertEquals(12,calculation.dev(24,2));
    }
}
