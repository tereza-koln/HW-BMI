public class Main {
    public static void main(String[] main) {
        BmiService service = new BmiService();
        int WeightKg = 85;
        double HeightMt = 1.98;
        int index = service.calculate(WeightKg,HeightMt);
        System.out.println(index);
    }
}