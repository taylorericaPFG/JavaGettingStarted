

public class Book {

    private String title;
    private int isbnNumber;
    private String datePublished;
    private String author;
    private String category;

    public Book (String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsbnNumber(){
        return isbnNumber;
    }

    public void setIsbnNumber(int isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getDatePublished(){
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Book (String title, String author, int isbnNumber, String datePublished, String category) {
        this(title);
        this.author = author;
        this.isbnNumber = isbnNumber;
        this.datePublished = datePublished;
        this.category = category;
    }

    public Book (String title, String author){
        this(title);
        this.author = author;
    }

    public Book (String title, String author, int isbnNumber) {
        this(title);
        this.author = author;
        this.isbnNumber = isbnNumber;
    }

    public Book (String title, String author, int isbnNumber, String datePublished) {
        this(title);
        this.author = author;
        this.isbnNumber = isbnNumber;
        this.datePublished = datePublished;
    }
}
