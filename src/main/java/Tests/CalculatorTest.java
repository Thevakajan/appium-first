package Tests;

import PageObjects.Calculator;
import org.testng.annotations.Test;

public class CalculatorTest extends TestBase {
    @Test
    public void testCal()  {
        Calculator cal = new Calculator(driver);
        cal.clickone();
        cal.clickmul();
        cal.clickthree();


    }
}
