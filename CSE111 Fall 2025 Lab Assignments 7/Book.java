//HomeWorkTask03

public class Book extends Product {
    
    private String ISBN;
    private String publisher;

    public Book(int id, String title, int price, String ISBN, String publisher) {
        super(id, title, price);
        this.ISBN = ISBN;
        this.publisher = publisher;
    }

    public String printDetail() {
        return getIdTitlePrice() + "\nISBN: " + ISBN + " Publisher: " + publisher;
    }
}