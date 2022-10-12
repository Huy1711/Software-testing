import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class bmiTestPTGTB {

    @Test
    public void testBMI1() {
        assertEquals("Thừa cân", bmi.bmiEvaluate(50.0, 1));
    }

    @Test
    public void testBMI2() {
        assertEquals("Thừa cân", bmi.bmiEvaluate(50.0, 2));
    }

    @Test
    public void testBMI3() {
        assertEquals("Thừa cân", bmi.bmiEvaluate(50.0, 50));
    }

    @Test
    public void testBMI4() {
        assertEquals("Thừa cân", bmi.bmiEvaluate(50.0, 99));
    }

    @Test
    public void testBMI5() {
        assertEquals("Thừa cân", bmi.bmiEvaluate(50.0, 100));
    }

    @Test
    public void testBMI6() {
        assertEquals("Thừa cân", bmi.bmiEvaluate(0.1, 50));
    }

    @Test
    public void testBMI7() {
        assertEquals("Thừa cân", bmi.bmiEvaluate(0.2, 50));
    }

    @Test
    public void testBMI8() {
        assertEquals("Thừa cân", bmi.bmiEvaluate(99.9, 50));
    }

    @Test
    public void testBMI9() {
        assertEquals("Thừa cân", bmi.bmiEvaluate(100.0, 50));
    }

}
