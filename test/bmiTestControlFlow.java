import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class bmiTestControlFlow {

    @Test
    public void testBMI1() {
        assertEquals("Không hợp lệ", bmi.bmiEvaluate(25.12, -20));
    }

    @Test
    public void testBMI2() {
        assertEquals("Thiếu cân", bmi.bmiEvaluate(13.11, 15));
    }

    @Test
    public void testBMI3() {
        assertEquals("Bình thường", bmi.bmiEvaluate(16.23, 15));
    }

    @Test
    public void testBMI4() {
        assertEquals("Thừa cân", bmi.bmiEvaluate(25.13, 15));
    }

    @Test
    public void testBMI5() {
        assertEquals("Thiếu cân", bmi.bmiEvaluate(17.66, 25));
    }

    @Test
    public void testBMI6() {
        assertEquals("Bình thường", bmi.bmiEvaluate(21.27, 25));
    }

    @Test
    public void testBMI7() {
        assertEquals("Thừa cân", bmi.bmiEvaluate(29.60, 25));
    }
}
