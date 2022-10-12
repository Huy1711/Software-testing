public class bmi {

    public static String bmiEvaluate(double bmi, int age) {
        if (age <= 0 || age > 100 || bmi <= 0.0 || bmi > 100.0) {
            return "Không hợp lệ";
        }
        if (age <= 18) {
            if (bmi < 14.0)
                return "Thiếu cân";
            else if (bmi <= 20.0)
                return "Bình thường";
            else
                return "Thừa cân";
        } else {
            if (bmi < 18.5)
                return "Thiếu cân";
            else if (bmi <= 23.0)
                return "Bình thường";
            else
                return "Thừa cân";
        }
    }
}
