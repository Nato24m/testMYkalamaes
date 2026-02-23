package transport;
public class Bus extends Transport {
    public Bus(double distance) {
        super(distance);
    }
    public double calculateFare() {
        return 8 + (distance * 2);
    }
    public double getSpeed() {
        return 40;
    }
}