import java.util.ArrayList;
import java.util.List;

public class Author {

    private String name;
    private ArrayList<Book> books = new ArrayList<>();

    Author(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBooks() {
        return books.size();
    }
    public void addBook(Book book){
        books.add(book);
    }

    public ArrayList<Book> getListOfBooks(){
        return (ArrayList<Book>) books.clone();
    }

    public Author (String name, ArrayList<Book> books) {
        this(name);
        this.books = (ArrayList<Book>) books.clone();
    }

}

