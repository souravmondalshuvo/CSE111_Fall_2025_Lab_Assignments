public class CD extends Product {

    private String band;
    private int duration;
    private String genre;
    
    public CD(int id, String title, int price, String band, int duration, String genre) {
        super(id, title, price);
        this.band = band;
        this.duration = duration;
        this.genre = genre;
    }

    public String printDetail() {
        return getIdTitlePrice() + "\nBand: " + band + " Duration: " + duration + " minutes\nGenre: " + genre;
    }
}