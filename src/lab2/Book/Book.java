package lab2.Book;

public class Book {
    String name;
    String author;
    int year;
    int publication;

    Book(){}
    Book(String n, String a, int y, int p){
        name = n;
        author = a;
        year = y;
        publication = p;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPublication() {
        return publication;
    }

    public void setPublication(int publication) {
        this.publication = publication;
    }

    public int compare(Book o){
        return year - o.year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", publication=" + publication +
                '}';
    }
}
