package transport;
public class MotorcycleTaxi extends Transport {
    public MotorcycleTaxi(double distance) {
        super(distance);
    }
    public double calculateFare() {
        return 20 + (distance * 5);
    }
    public double getSpeed() {
        return 50;
    }
}