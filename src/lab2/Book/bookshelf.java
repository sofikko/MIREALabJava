package lab2.Book;

import java.util.Comparator;

public class bookshelf {
    Book[] books;
    int size;

    bookshelf(Book[] b, int s){
        books = b;
        size = s;
    }

    public void sort() {
        boolean f = false;
        for (int i = size - 1; i > 1; i--){
            for (int j = 0; j < i; j++) {
                if (books[j].compare(books[j + 1]) > 0){
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                    f = true;
                }
            }
            if (!f)
                break;
            f = false;
        }
    }

    public Book early(){
        int age = books[0].getYear(), in = 0;
        for (int i = 1; i < size; i++)
            if (books[in].getYear() > books[i].getYear())
                in = i;
        return books[in];
    }

    public Book later(){
        int age = books[0].getYear(), in = 0;
        for (int i = 1; i < size; i++)
            if (books[in].getYear() < books[i].getYear())
                in = i;
        return books[in];
    }

    public void show(){
        System.out.println("\nYour BOKSHELF:");
        for (int i = 0; i < size; i++){
            System.out.println(books[i].toString());
        }
        System.out.println("\n");
    }
}
