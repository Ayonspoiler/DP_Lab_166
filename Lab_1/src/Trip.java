public class Trip {
    private String id;
    private String pickupLocation;
    private String dropOffLocation;
    private RideType rideType;
    private double fare;
    private double distance;
    private Rider rider;
    private Driver driver;
    private TripStatus status;
    private NotificationService notificationService;
    private PaymentMethod paymentMethod;


    public Trip(Rider rider, RideType rideType, String pickupLocation, String dropOffLocation,NotificationService notificationService) {
        this.rider = rider;
        this.rideType = rideType;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.notificationService=notificationService;
        this.status=TripStatus.PENDING;

    }
    public void sendNotification(String message) {
        notificationService.sendNotification(rider, driver, message);
    }
    public void calculateFare() {
        this.fare = rideType.calculateFare(distance);
    }
    public double getFare() {
        return fare;
    }
    public void assignDriver(Driver driver1) {

        if (driver == null) {
            this.driver = driver;

            System.out.println("Driver assigned: " + driver.getName());
        }
    }

    public void setStatus(TripStatus status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public Driver getDriver() {
        return driver;
    }

    public RideType getRideType() {
        return rideType;
    }
    public void setRideType(RideType rideType) {
        this.rideType = rideType;
    }

    // Getter for status
    public TripStatus getStatus() {
        return status;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }
    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }
    public String getDropOffLocation()
    {
        return dropOffLocation;
    }
    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

}
