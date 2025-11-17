/*
Task 4

Design the TravelPrep class so that the given output is generated.
This class keeps track of the package info and the destination that goes into it.
The initial budget will be 1250 yen for any traveller.
A traveller can visit at most 3 destinations if that falls under their budget.

Driver Code
public class TravelPlan {
  public static void main(String[] args) {
    TravelPrep t1 = new TravelPrep();
    System.out.println("1==================");
    TravelPrep t2 = new TravelPrep("Package-2", 2100);
    System.out.println("2==================");
    TravelPrep d1 = new TravelPrep("Fushimi", "Shrine");
    TravelPrep d2 = new TravelPrep("Lake", "Kawaguchi", 550);
    TravelPrep d3 = new TravelPrep("Shrine", "Hieizan", 1000);
    TravelPrep d4 = new TravelPrep("Lake", "Ashi", 620);
    System.out.println("3==================");
    t2.add_to_itinerary(d1);
    t2.add_to_itinerary(d2, d3);
    t2.show_itinerary();
    System.out.println("4==================");
    System.out.println(d2.updateCost(60));
    System.out.println("5==================");
    t1.t_name = "Package-1";
    t1.add_to_itinerary(d2, d4);
    t1.add_to_itinerary(d3);
    System.out.println("6==================");
    t1.show_itinerary(); 
  }
}

Expected Output
Unknown package would cost at most 1250 yen
1==================
Package-2 would cost at most 2100 yen
2==================
Fushimi Shrine costs 300 yen
Kawaguchi Lake costs 550 yen
Hieizan Shrine costs 1000 yen
Ashi Lake costs 620 yen
3==================
Itinerary for Package-2
1. Fushimi Shrine - 300 yen
2. Kawaguchi Lake - 550 yen
3. Hieizan Shrine - 1000 yen
Total cost of 3 destinations: 1850 yen
4==================
Cost of Kawaguchi Lake updated to 610
5==================
Budget going overboard
6==================
Itinerary for Package-1
1. Kawaguchi Lake - 610 yen
2. Ashi Lake - 620 yen
Total cost of 2 destinations: 1230 yen
*/

public class TravelPlan {
  public static void main(String[] args) {
    TravelPrep t1 = new TravelPrep();
    System.out.println("1==================");
    TravelPrep t2 = new TravelPrep("Package-2", 2100);
    System.out.println("2==================");
    TravelPrep d1 = new TravelPrep("Fushimi", "Shrine");
    TravelPrep d2 = new TravelPrep("Lake", "Kawaguchi", 550);
    TravelPrep d3 = new TravelPrep("Shrine", "Hieizan", 1000);
    TravelPrep d4 = new TravelPrep("Lake", "Ashi", 620);
    System.out.println("3==================");
    t2.add_to_itinerary(d1);
    t2.add_to_itinerary(d2, d3);
    t2.show_itinerary();
    System.out.println("4==================");
    System.out.println(d2.updateCost(60));
    System.out.println("5==================");
    t1.t_name = "Package-1";
    t1.add_to_itinerary(d2, d4);
    t1.add_to_itinerary(d3);
    System.out.println("6==================");
    t1.show_itinerary(); 
  }
}