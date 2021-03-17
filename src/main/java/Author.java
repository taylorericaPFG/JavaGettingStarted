

public class Author {

    private String name;
    private int numberOfBooks;

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
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public Author (String name, int numberOfBooks) {
        this(name);
        this.numberOfBooks = numberOfBooks;
    }

}

