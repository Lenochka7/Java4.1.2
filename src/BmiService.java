public class BmiService {
    public int calculate(int weight, int height) {
        int BMI = (weight / ((height /100) * (height /100)));
        return BMI;
    }
}
