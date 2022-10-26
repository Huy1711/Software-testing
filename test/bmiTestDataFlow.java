import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class bmiTestDataFlow {

    @Test
    public void testBMI1() {
        assertEquals("Thừa cân", bmi.bmiEvaluate(25.60, 15));
    }

    @Test
    public void testBMI2() {
        assertEquals("Thiếu cân", bmi.bmiEvaluate(16.13, 25));
    }

}
