/* 
Task 3

Design the necessary classes for the UberEats system with the necessary properties to produce the given output for the provided driver code

Driver code
public class UberEatsAccount{
  public static void main(String[] args){
    System.out.println("===========================");
    UberEatsUser user1 = new UberEatsUser("Peter Parker", "Badda");
    UberEatsUser user2 = new UberEatsUser("Matt Murdock", "Mohammadpur");
    UberEatsUser user3 = new UberEatsUser("Reed Richards");
    UberEatsUser user4 = new UberEatsUser("Peggy Carter", "Mirpur");
    Restaurant r1 = new Restaurant("Chillox", "Badda");
    r1.takeOrder(user1);
    r1.takeOrder(user2);
    r1.takeOrder(user3);
    r1.takeOrder(user4);
    r1.completeOrders();
    System.out.println("===========================");
    Restaurant r2 = new Restaurant("Kyoshi", "Gulshan");
    r2.takeOrder(user3);
    user3.updateLocation("Malibagh");
    user3.updateLocation("Bashundhara");
    r2.takeOrder(user3);
    r2.takeOrder(user3);
    r2.completeOrders();
    r2.completeOrders();
    System.out.println("===========================");
    Restaurant r3 = new Restaurant("Cilantro","Banani");
    r3.takeOrder(user1);
    r3.takeOrder(user2);
    r3.takeOrder(user3);
    r3.takeOrder(user4);
  }
}

Output
===========================
Your order has been added!
Your order has been added!
Location : Unknown. Please update your location information!
Your order has been added!
Showing Chillox's orders:
Order by Peter Parker at Badda completed
Order by Matt Murdock at Mohammadpur completed
Order by Peggy Carter at Mirpur completed
===========================
Location : Unknown. Please update your location information!
Update Successful!
We already have your location. Please place an order!
Your order has been added!
You already have a pending order!
Showing Kyoshi's orders:
Order by Reed Richards at Malibagh completed
No pending orders at the moment.
===========================
Your order has been added!
Your order has been added!
Your order has been added!
We are really busy right now. Please order after some time. Thank you!
*/

public class UberEatsAccount {
    public static void main(String[] args) {
        System.out.println("===========================");
        UberEatsUser user1 = new UberEatsUser("Peter Parker", "Badda");
        UberEatsUser user2 = new UberEatsUser("Matt Murdock", "Mohammadpur");
        UberEatsUser user3 = new UberEatsUser("Reed Richards");
        UberEatsUser user4 = new UberEatsUser("Peggy Carter", "Mirpur");
        Restaurant r1 = new Restaurant("Chillox", "Badda");
        r1.takeOrder(user1);
        r1.takeOrder(user2);
        r1.takeOrder(user3);
        r1.takeOrder(user4);
        r1.completeOrders();
        System.out.println("===========================");
        Restaurant r2 = new Restaurant("Kyoshi", "Gulshan");
        r2.takeOrder(user3);
        user3.updateLocation("Malibagh");
        user3.updateLocation("Bashundhara");
        r2.takeOrder(user3);
        r2.takeOrder(user3);
        r2.completeOrders();
        r2.completeOrders();
        System.out.println("===========================");
        Restaurant r3 = new Restaurant("Cilantro", "Banani");
        r3.takeOrder(user1);
        r3.takeOrder(user2);
        r3.takeOrder(user3);
        r3.takeOrder(user4);
    }
}