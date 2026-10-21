public class Task11 {
    public static void main() {
        Book book1 = new Book(
                "Java Programming",
                "John Smith",
                2021,
                39.99);
        Book book2 = new Book(
                "Python Basics",
                "Michael Jackson",
                2019,
                29.99);
        Book book3 = new Book("C++ Essentials",
                "Michael Johnson",
                2019,
                49.99);

        Book[] books = {book1, book2, book3};
        int counter = 1;
        for(Book book : books){
            System.out.println();
            System.out.println(book.getClass().getName() + " " + counter++);
            System.out.println(book.toString());


            /** APPROACH if not toString()
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("Year Published: " + book.yearPublished);
            System.out.println("Price: $" + book.price );
             */
        }
    }
}

class Book {
    String title;
    String author;
    int yearPublished;
    double price;

    public Book(String bookTitle, String bookAuthor, int yearPublished, double bookPrice){
        title = bookTitle;
        author = bookAuthor;
        this.yearPublished = yearPublished;
        price = bookPrice;
    }

    public String toString(){
        return "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Year: " + yearPublished + "\n" +
                "Price: $" + price;
    }
}
