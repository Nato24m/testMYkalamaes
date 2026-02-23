package transport;
public class Taxi extends Transport {
    public Taxi(double distance) {
        super(distance);
    }
    public double calculateFare() {
        return 35 + (distance * 6);
    }
    public double getSpeed() {
        return 60;
    }
}