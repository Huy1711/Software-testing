import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class bmiTestPHTD {

    @Test
    public void testBMI1() {
        assertEquals("Thiếu cân", bmi.bmiEvaluate(10.7, 7));
    }

    @Test
    public void testBMI2() {
        assertEquals("Bình thường", bmi.bmiEvaluate(17.6, 8));
    }

    @Test
    public void testBMI3() {
        assertEquals("Thừa cân", bmi.bmiEvaluate(35.6, 10));
    }

    @Test
    public void testBMI4() {
        assertEquals("Thiếu cân", bmi.bmiEvaluate(12.4, 34));
    }

    @Test
    public void testBMI5() {
        assertEquals("Bình thường", bmi.bmiEvaluate(20.1, 45));
    }

    @Test
    public void testBMI6() {
        assertEquals("Thừa cân", bmi.bmiEvaluate(37.5, 39));
    }

    @Test
    public void testBMI7() {
        assertEquals("Không hợp lệ", bmi.bmiEvaluate(157.5, -43));
    }
}
