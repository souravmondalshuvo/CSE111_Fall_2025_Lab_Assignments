/*
Task 2

Complete the following Cart class to generate the given output from the tester code:
A cart will have a cart number which will be assigned in create_cart() method.
Each cart can hold up to 3 items (at max).
Each cart must have two arrays to store items and their respective prices.
The items inside a cart will be added in addItem() method only if the cart items do not exceed 3.
The giveDiscount() method saves the discount given to that cart object and updates the price accordingly.


Driver Code
public class CartTester{
    public static void main(String [] args){
    Cart c1 = new Cart (); 
    Cart c2 = new Cart ();
    Cart c3 = new Cart ();
    
    c1.create_cart(1);
    c2.create_cart(2);
    c3.create_cart(3);
    System.out.println("====1====");
    c1.addItem("Table", 3900.5);
    c1.addItem("Chair", 1400.76);
    c1.addItem(5400.87, "Television");
    c1.addItem(5000.0, "Refrigerator");
    
    System.out.println("====2====");
    c2.addItem("Stove",439.90);
    
    System.out.println("====3====");
    c3.addItem("Chair",1400.5);
    c3.addItem(3400.0, "Chair");
    
    System.out.println("====4====");
    c1.cartDetails();
    
    System.out.println("====5====");
    c2.cartDetails();
    
    System.out.println("====6====");
    c3.cartDetails();
    c1.giveDiscount(10);
    
    System.out.println("====7====");
    c1.cartDetails();
  }
}

Output
====1====
Table added to cart 1.
You have 1 item(s) in your cart now.
Chair added to cart 1.
You have 2 item(s) in your cart now.
Television added to cart 1.
You have 3 item(s) in your cart now.
You already have 3 items on your cart
====2====
Stove added to cart 2.
You have 1 item(s) in your cart now.
====3====
Chair added to cart 3.
You have 1 item(s) in your cart now.
Chair added to cart 3.
You have 2 item(s) in your cart now.
====4====
Your cart(c1) : 
Table - 3900.5
Chair - 1400.76
Television - 5400.87
Discount Applied: 0.0%
Total price: 10702.130000000001
====5====
Your cart(c2) : 
Stove - 439.9
Discount Applied: 0.0%
Total price: 439.9
====6====
Your cart(c3) : 
Chair - 1400.5
Chair - 3400.0
Discount Applied: 0.0%
Total price: 4800.5
====7====
Your cart(c1) : 
Table - 3900.5
Chair - 1400.76
Television - 5400.87
Discount Applied: 10.0%
Total price: 9631.917000000001
*/

//HomeWorkTask02

class Cart {

    public String[] cartItem = new String[3];
    public double[] price = new double[3];
    public double discount;
    public int cartNumber;
    public int itemCount;

    public void create_cart(int cartNumber) {
        this.cartNumber = cartNumber;
    }

    public void addItem(String item, double prc) {
        if(itemCount < 3) {
            cartItem[itemCount] = item;
            price[itemCount] = prc;
            itemCount++;
            System.out.println(item + " added to " + cartNumber + ".");
            System.out.println("You have " + itemCount + " item(s) in your cart now.");
        } else {
            System.out.println("You already have 3 items on your cart");
        }
    }

    public void addItem(double prc, String item) {
        addItem(item, prc);
    }

    public void cartDetails() {
        System.out.println("Your cart (c" + cartNumber + ") : ");

        double total = 0.0;

        for(int i = 0; i < itemCount; i++) {
            System.out.println(cartItem[i] + " - " + price[i]);
            total += price[i];
        }

        double discountedTotal = total - (total * discount / 100);

        System.out.println("Discount applied: " + discount + "%");
        System.out.println("Total price: " + discountedTotal);
    }

    public void giveDiscount(double discount) {
        this.discount = discount;
    }
}

public class CartTester{
  public static void main(String [] args){
    Cart c1 = new Cart (); 
    Cart c2 = new Cart ();
    Cart c3 = new Cart ();
    
    c1.create_cart(1);
    c2.create_cart(2);
    c3.create_cart(3);
    System.out.println("====1====");
    c1.addItem("Table", 3900.5);
    c1.addItem("Chair", 1400.76);
    c1.addItem(5400.87, "Television");
    c1.addItem(5000.0, "Refrigerator");
    
    System.out.println("====2====");
    c2.addItem("Stove",439.90);
    
    System.out.println("====3====");
    c3.addItem("Chair",1400.5);
    c3.addItem(3400.0, "Chair");
    
    System.out.println("====4====");
    c1.cartDetails();
    
    System.out.println("====5====");
    c2.cartDetails();
    
    System.out.println("====6====");
    c3.cartDetails();
    c1.giveDiscount(10);
    
    System.out.println("====7====");
    c1.cartDetails();
  }
}