public class Restaurant {
    
    public String name;
    public String location;
    public UberEatsUser[] orders;
    public int order_count;

    public Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
        this.orders = new UberEatsUser[3];
    }

    public void takeOrder(UberEatsUser client) {

        if(order_count >= 3) {
            System.out.println("We are really busy right now. Please order after some time. Thank you!");
            return;
        }

        if(client.location.equals("Unknown")) {
            System.out.println("Location : Unknown. Please update your location information!");
            return;
        }

        for(int i = 0; i < order_count; i++) {
            if(orders[i] == client) {
                System.out.println("You already have a pending order!");
                return;
            }
        }

        orders[order_count] = client;
        order_count++;
        System.out.println("Your order has been added!");
    }

    public void completeOrders() {
        
        if(order_count == 0) {
            System.out.println("No pending orders at the moment.");
        } else {
            System.out.println("Showing " + this.name + "'s order: ");
            for(int i = 0; i < order_count; i++) {
                System.out.println("Order by " + orders[i].name + " at " + orders[i].location + " completed");
                orders[i] = null;
            }
            order_count = 0;
        }
    }
}