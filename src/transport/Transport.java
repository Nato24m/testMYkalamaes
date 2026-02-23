package transport;
public abstract class Transport {
    protected double distance;
    public Transport(double distance) {
        this.distance = distance;
    }
    public double calculateTimeMinutes() {
        double speed = getSpeed();
        return (distance / speed) * 60;
    }
    public abstract double calculateFare();
    public abstract double getSpeed();
}