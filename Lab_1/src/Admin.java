public class Admin {
    private String id;
    private String name;
    private String role;

    public Admin(String id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public void manageDriver(Driver driver) {
        if (driver.isAvailable()) {
            driver.setAvailability(false);
            System.out.println("Driver " + driver.getName() + " has been deactivated.");
        } else {
            driver.setAvailability(true);
            System.out.println("Driver " + driver.getName() + " has been activated.");
        }
    }

    public void manageRider(Rider rider) {
        System.out.println("Managing rider: " + rider.getName() + " (Activate/Deactivate logic here)");
    }

    public void viewTripHistory(Trip trip) {
        System.out.println("Handling dispute for Trip ID: " + trip.getId() + " (Dispute handling logic goes here)");
    }

    public void handleDispute(Trip trip) {
        System.out.println("Handling dispute for Trip ID: " + trip.getId() + " (Dispute handling logic goes here)");
    }
    public String getId() {
        return id;
    }

    // Setter for id
    public void setId(String id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for role
    public String getRole() {
        return role;
    }

    // Setter for role
    public void setRole(String role) {
        this.role = role;
    }

}
