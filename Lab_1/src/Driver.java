public class Driver {
    private String id;
    private String name;
    private String location;
    private double rating;
    private String vehicleType;
    private boolean availability;


    public Driver(String id,String name,String location, double rating,String vehicleType)
    {
        this.id=id;
        this.name=name;
        this.location=location;
        this.rating=rating;
        this.vehicleType=vehicleType;
        this.availability=true;
    }

    public void acceptRide(Trip trip,Driver driver) {
        if (availability) {
            trip.assignDriver(driver);
            trip.sendNotification("Driver Assigned");
        }
    }
    public void startTrip(Trip trip) {
        trip.setStatus(TripStatus.IN_PROGRESS);
        trip.sendNotification("Trip Started");
    }
    public void updateRating(double newRating) {
        this.rating = (this.rating + newRating) / 2;
        System.out.println("Updated Driver Rating: " + this.rating);
    }
    public void completeTrip(Trip trip) {
        trip.setStatus(TripStatus.COMPLETED);
        trip.sendNotification("Trip Completed");
    }
    public void rateRider(Rider rider, double rating) {
        rider.rateDriver(this, rating);
    }
    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }




}
enum TripStatus {
    PENDING, IN_PROGRESS, COMPLETED, CANCELED;
}


