public class UberEatsUser {
    
    public String name;
    public String location;

    public UberEatsUser(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public UberEatsUser(String name) {
        this.name = name;
        this.location = "Unknown";
    }

    public void updateLocation(String new_location) {

        if(!this.location.equals("Unknown")) {
            System.out.println("We already have your location. Please place an order!");
        } else {
            this.location = new_location;
            System.out.println("Update Successful!");
        }
    }
}