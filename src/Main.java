public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 55;
        int height = 170;
        int BMI = service.calculate(weight, height);
        System.out.println(BMI);
    }
}