/*
Task 3

Design the Reader class in such a way so that the following code provides the expected output.
A reader will have a name, capacity to read and an array of books they are reading.
The initial capacity of a reader will be 0. The initial name will be “New user”.

Driver Code
public class Reader_tester {
  public static void main(String[] args){
    
    System.out.println("1 ==========");
    Reader r1 = new Reader("Messi");
    Reader r2 = new Reader("Ronaldo", 3);
    System.out.println("2 ==========");
    r1.readerInfo();
    System.out.println("3 ==========");
    r2.addBook("Java");
    r2.addBook("Python");
    r2.addBook("C++");
    r2.readerInfo();
    System.out.println("4 ==========");
    r1.addBook("C#");
    r1.addBook("Rust");
    r1.addBook("GoLang");
    System.out.println("5 ==========");
    r2.addBook("Python");
    System.out.println("6 ==========");
    r1.readerInfo();
    System.out.println("7 ==========");
    r1.updateCapacity(3);
    System.out.println("8 ==========");
    r1.addBook("GoLang");
    System.out.println("9 ==========");
    r1.readerInfo();
    
  }
}

Expected Output
1 ==========
A new reader is created!
A new reader is created!
2 ==========
Name: Messi
Capacity: 2
Books: 
No books added yet
3 ==========
Name: Ronaldo
Capacity: 3
Books: 
Book 1: Java
Book 2: Python
Book 3: C++
4 ==========
No more capacity
5 ==========
No more capacity
6 ==========
Name: Messi
Capacity: 2
Books: 
Book 1: C#
Book 2: Rust
7 ==========
Capacity has changed to 3
8 ==========
9 ==========
Name: Messi
Capacity: 3
Books: 
Book 1: C#
Book 2: Rust
Book 3: GoLang
*/

//HomeWorkTask03

class Reader {

    public String name;
    public int capacity;
    public String[] book_name;
    public int book_count;

    public Reader(String name) {
        this.name = name;
        this.capacity = 2;
        this.book_name = new String[capacity];
        this.book_count = 0;

        System.out.println("A new reader is created!");
    }

    public Reader(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.book_name = new String[capacity];
        this.book_count = 0;

        System.out.println("A new reader is created!");
    }

    public void readerInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Books: ");
        
        if(book_count == 0) {
            System.out.println("No books added yet");
        } else {
            for(int i = 0; i < book_count; i++) {
                System.out.println("Book " + (i + 1) + ": " + book_name[i]);
            }
        }
    }

    public void addBook(String book) {
        if(book_count < capacity) {
            book_name[book_count] = book;
            book_count++;
        } else {
            System.out.println("No more capacity");
        }
    }

    public void updateCapacity(int new_capacity) {
        this.capacity = new_capacity;

        String new_books[] = new String[new_capacity];

        for(int i = 0; i < book_count && i < new_capacity; i++) {
            new_books[i] = book_name[i];
        }

        this.book_name = new_books;
        System.out.println("Capacity has changed to " + new_capacity);
    }
}

public class Reader_tester {
  public static void main(String[] args){
    
    System.out.println("1 ==========");
    Reader r1 = new Reader("Messi");
    Reader r2 = new Reader("Ronaldo", 3);
    System.out.println("2 ==========");
    r1.readerInfo();
    System.out.println("3 ==========");
    r2.addBook("Java");
    r2.addBook("Python");
    r2.addBook("C++");
    r2.readerInfo();
    System.out.println("4 ==========");
    r1.addBook("C#");
    r1.addBook("Rust");
    r1.addBook("GoLang");
    System.out.println("5 ==========");
    r2.addBook("Python");
    System.out.println("6 ==========");
    r1.readerInfo();
    System.out.println("7 ==========");
    r1.updateCapacity(3);
    System.out.println("8 ==========");
    r1.addBook("GoLang");
    System.out.println("9 ==========");
    r1.readerInfo();
    
  }
}