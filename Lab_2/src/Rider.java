public class Rider {
    private String id;
    private String name;
    private String location;
    private double rating ;
    private PaymentMethod preferredPaymentMethod;

    public Rider(String id,String name,String location,PaymentMethod preferredPaymentMethod)
    {
        this.id=id;
        this.name=name;
        this.location=location;
        this.preferredPaymentMethod=preferredPaymentMethod;
    }
    public void requestRide(Trip trip, Driver driver) {
        trip.assignDriver(driver);
        trip.calculateFare();
        trip.sendNotification("Ride Requested");
    }

    public void rateDriver(Trip trip, double rating) {
        trip.updateRating(rating);
    }
    public void makePayment(Trip trip) {
        trip.getPaymentMethod().processPayment(trip.getFare());
    }
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    // Setter for the rider's id
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

    public PaymentMethod getPreferredPaymentMethod() {
        return preferredPaymentMethod;
    }
    public void setPreferredPaymentMethod(PaymentMethod preferredPaymentMethod) {
        this.preferredPaymentMethod = preferredPaymentMethod;
    }




}
