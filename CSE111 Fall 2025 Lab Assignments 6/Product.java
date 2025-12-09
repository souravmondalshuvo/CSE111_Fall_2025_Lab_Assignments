public class Product {
    
    public String name;
    public int quantity;
    public static Product[] store = new Product[3];
    public static int product_count;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;

        if(product_count < store.length) {
            store[product_count] = this;
            product_count++;
            System.out.println("Stored: " + this.name);
        } else {
            System.out.println("Storage is full! Cannot add " + this.name);
        }
    }

    public static void displayProducts() {
        System.out.println("==== Stored Products ===");
        for(int i = 0; i < product_count; i++) {
            System.out.println(store[i].name + " - Qty: " + store[i].quantity);
        }
    }

    public static void buy(String name, int quantity) {
        for(int i = 0; i < product_count; i++) {
            if(store[i].name.equals(name)) {
                if(store[i].quantity < quantity) {
                    System.out.println("Quantity low");
                    return;
                }

                store[i].quantity -= quantity;
                System.out.println("Product Sold");
                return;
            }
        }

        System.out.println("Product not found");
    }
}