public class BmiService {
    public int calculate(int WeightKg, double HeightMt) {
        double index = WeightKg / (HeightMt * HeightMt);
        return (int) index;
    }

}
