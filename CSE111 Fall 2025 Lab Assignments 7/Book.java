//HomeWorkTask03

public class Book extends Product {
    
    public String ISBN;
    public String publisher;

    public Book(int id, String title, int price, String ISBN, String publisher) {
        super(id, title, price);
        this.ISBN = ISBN;
        this.publisher = publisher;
    }

    public String printDetail() {
        return "ID: " + id + " Title: " + title + " Price: " + price + "\nISBN: " + ISBN + " Publisher: " + publisher;
    }
}