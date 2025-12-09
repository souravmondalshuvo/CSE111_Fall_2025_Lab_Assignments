/*
Task 1

Design the Product class such that it produces the following output.

Tester Code
public class ProductTester{
  public static void main(String[] args) {
    Product p1 = new Product("Table", 10); 
    Product p2 = new Product("Chair", 15);
    Product p3 = new Product("Sofa", 20);
    Product p4 = new Product("Divan", 8);
    System.out.println("------------1------------");
    Product.displayProducts();
    System.out.println("------------2------------");
    Product.buy("Chair", 5);
    System.out.println("------------3------------");
    Product.displayProducts();
    System.out.println("------------4------------");
    Product.buy("Sofa", 25);
    System.out.println("------------5------------");
    Product.displayProducts();
    System.out.println("------------6------------");
    Product.buy("Bed", 10);
  }
}

Output
Stored: Table
Stored: Chair
Stored: Sofa
Storage is full! Cannot add Divan
------------1------------
=== Stored Products ===
Table - Qty: 10
Chair - Qty: 15
Sofa - Qty: 20
------------2------------
Product Sold
------------3------------
=== Stored Products ===
Table - Qty: 10
Chair - Qty: 10
Sofa - Qty: 20
------------4------------
Quantity low
------------5------------
=== Stored Products ===
Table - Qty: 10
Chair - Qty: 10
Sofa - Qty: 20
------------6------------
Product not found
*/

public class ProductTester{
  public static void main(String[] args) {
    Product p1 = new Product("Table", 10); 
    Product p2 = new Product("Chair", 15);
    Product p3 = new Product("Sofa", 20);
    Product p4 = new Product("Divan", 8);
    System.out.println("------------1------------");
    Product.displayProducts();
    System.out.println("------------2------------");
    Product.buy("Chair", 5);
    System.out.println("------------3------------");
    Product.displayProducts();
    System.out.println("------------4------------");
    Product.buy("Sofa", 25);
    System.out.println("------------5------------");
    Product.displayProducts();
    System.out.println("------------6------------");
    Product.buy("Bed", 10);
  }
}