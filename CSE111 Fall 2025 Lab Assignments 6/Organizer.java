public class Organizer {
 
    private String name;
    private Event[] organized_events = new Event[4];
    private int organized_events_count;

    public Organizer() {
        System.out.println("Please provide the organizer's name");
    }

    public Organizer(String name) {
        this.name = name;
    }

    public void searchEventByDate(String date) {

        for(int i = 0; i < organized_events_count; i++) {
            if(organized_events[i].getDate().equals(date)) {
                System.out.println(organized_events[i].getName());
                return;
            }
        }

        System.out.println("No event is scheduled for " + date);
    }

    public void organizeEvent(Event event) {

        if(organized_events_count < organized_events.length) {
            organized_events[organized_events_count++] = event;
            System.out.println(this.name + " successfully organized " + event.getName());
        }
    }
}