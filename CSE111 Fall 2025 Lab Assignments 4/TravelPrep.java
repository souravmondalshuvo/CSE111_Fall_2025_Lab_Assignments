//HomeWorkTask04

public class TravelPrep {

    public String t_name;
    public int budget;
    public TravelPrep[] destination;
    public int total_destination;
    public String category;
    public String name;
    public int cost;

    public TravelPrep() {
        this.t_name = "Unknown package";
        this.budget = 1250;
        this.destination = new TravelPrep[3];
        System.out.println(this.t_name + " would cost at most " + this.budget + " yen");
    }

    public TravelPrep(String package_name, int budget) {
        this.t_name = package_name;
        this.budget = budget;
        this.destination = new TravelPrep[3];
        System.out.println(this.t_name + " would cost at most " + this.budget + " yen");
    }

    public TravelPrep(String name, String category) {
        this.category = category;
        this.name = name;
        this.cost = 300;
        System.out.println(this.name + " " + this.category + " costs " + this.cost + " yen");
    }

    public TravelPrep(String category, String name, int cost) {
        this.category = category;
        this.name = name;
        this.cost = cost;
        System.out.println(this.name + " " + this.category + " costs " + this.cost + " yen");
    }

    public void add_to_itinerary(TravelPrep dstination) {
        int total = getTotalCost() + dstination.cost;

        if(total_destination >= 3 || total > budget) {
            System.out.println("Budget going overboard");
            return;
        }

        destination[total_destination++] = dstination;
    }

    public void add_to_itinerary(TravelPrep dstination_1, TravelPrep dstination_2) {
        add_to_itinerary(dstination_1);
        add_to_itinerary(dstination_2);
    }

    public String updateCost(int cost) {
        this.cost += cost;
        return "Cost of " + this.name + " " + this.category + " updated to " + this.cost;
    }

    public int getTotalCost() {
        int total_cost = 0;

        for(int i = 0; i < total_destination; i++) {
            total_cost += destination[i].cost;
        }
        return total_cost;
    }

    public void show_itinerary() {
        System.out.println("Itinerary for " + this.t_name);

        int total_cost = 0;

        for(int i = 0; i < total_destination; i++) {
            TravelPrep dstination = destination[i];
            System.out.println((i + 1) + ". " + dstination.name + " " + dstination.category + " - " + dstination.cost + " yen");
            total_cost += dstination.cost;
        }

        System.out.println("Total cost of " + total_destination + " destinations: " + total_cost + " yen");
    }    
}