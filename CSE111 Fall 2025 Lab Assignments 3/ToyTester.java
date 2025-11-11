/*
Task 1

Design the Toy class in such a way that it produces the following output

Driver Code
public class ToyTester{
    public static void main(String[] args){
        Toy t1 = new Toy("Car", 230);
        System.out.println("1=================");
        t1.updatePrice(250);
        System.out.println("2=================");
        System.out.println(t1.name);
        t1.showPrice();
        System.out.println("3=================");
        Toy t2 = new Toy("Robot", 450);
        System.out.println("4=================");
        t2.updateName("Autobot");
        System.out.println("5=================");
        System.out.println(t2.name);
        t2.showPrice();
    }
}

Expected Output
A new toy has been made!
1=================
2=================
Car
price: 250 Taka
3=================
A new toy has been made!
4=================
Changing old name: Robot
new name: Autobot
5=================
Autobot
price: 450 Taka
*/

//HomeWorkTask01

class Toy {

    public String name;
    public int price;

    public Toy(String name, int price) {
        this.name = name;
        this.price = price;

        System.out.println("A new toy has been made!");
    }

    public void updatePrice(int price) {
        this.price = price;
    }

    public void showPrice() {
        System.out.println("price: " + this.price + " Taka");
    }

    public void updateName(String name) {
        
        System.out.println("Changing old name: " + this.name);
        
        this.name = name;
        System.out.println("new name: " + this.name);
    }
}

public class ToyTester{
    public static void main(String[] args){
        Toy t1 = new Toy("Car", 230);
        System.out.println("1=================");
        t1.updatePrice(250);
        System.out.println("2=================");
        System.out.println(t1.name);
        t1.showPrice();
        System.out.println("3=================");
        Toy t2 = new Toy("Robot", 450);
        System.out.println("4=================");
        t2.updateName("Autobot");
        System.out.println("5=================");
        System.out.println(t2.name);
        t2.showPrice();
    }
}