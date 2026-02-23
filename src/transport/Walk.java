package transport;
public class Walk extends Transport {
    public Walk(double distance) {
        super(distance);
    }
    public double calculateFare() {
        return 0;
    }
    public double getSpeed() {
        return 5;
    }
}