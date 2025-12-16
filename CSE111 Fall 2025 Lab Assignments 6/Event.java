//HomeWorkTask05

public class Event {
    
    private String name;
    private String date;
    private static Event[] events = new Event[5];
    private static int events_count;

    public Event(String name, String date) {
        this.name = name;
        this.date = date;

        if(events_count < events.length) {
            events[events_count++] = this;
        }
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String details() {
        return "Name: " + this.name + "\nDate: " + this.date;
    }

    public static void allEventInfo() {
        System.out.println("Total Events: " + events_count);
        
        System.out.println("Event Details: ");
        for(int i = 0; i < events_count; i++) {
            System.out.println("Event " + (i + 1) + ": ");
            System.out.println("Name: " + events[i].name);
            System.out.println("Date: " + events[i].date);
        }
    }
}