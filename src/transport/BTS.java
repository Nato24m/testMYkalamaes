package transport;
public class BTS extends Transport {
    public BTS(double distance) {
        super(distance);
    }
    public double calculateFare() {
        return 16 + (distance * 5);
    }
    public double getSpeed() {
        return 70;
    }
}