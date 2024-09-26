public abstract class  RideType {
    protected String type;

    public RideType(String type) {
        this.type = type;
    }

    public abstract double calculateFare(double distance);

    public String getType() {
        return type;
    }
}

class CarpoolRide extends RideType {
    public CarpoolRide() {
        super("Carpool");
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 10;
    }
}

class LuxuryRide extends RideType {
    public LuxuryRide() {
        super("Luxury");
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 20;
    }
}
class BikeRide extends RideType {
    public BikeRide() {
        super("Bike");
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 5;
    }
}
