import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeekThreeExercisesPartOne {
    // class visibility
    // static variables vs. instance variables
    // getters
    // setters
    // methods
    // constructors
    // access modifiers modifiers (public, protected, private, none) (

//    Access Levels
//    Modifier	Class	Package	Subclass	World
//    public	Y	Y	Y	Y
//    protected	Y	Y	Y	N
//    no modifier	Y	Y	N	N
//    private	Y	N	N	N

    // subclass vs superclass
    // using the final keyword

    // arrays
    // pass by value vs reference

    // incrementally build out a solution using exercises

    @Test
    public void authorName(){
        Author doris = new Author("Doris Kimball");
        assertEquals("Doris Kimball", doris.getName()) ;
    }

    @Test
    public void numberBooksForAuthor() {
        Author erica = new Author("Erica Taylor", 7);
        assertEquals(7, erica.getNumberOfBooks());
    }

    @Test
    public void numberBooksForAuthor2() {
        Author barb = new Author("");
        barb.setName("Barb Hansen");
        assertEquals("Barb Hansen", barb.getName());
    }

    @Test
    public void numberBooksForAuthor3() {
        Author georgia = new Author("", 0);
        georgia.setNumberOfBooks(8);
        assertEquals(8, georgia.getNumberOfBooks());
    }

    @Test
    public void bookName(){
        Book one = new Book ("The Little Engine That Could");
        assertEquals("The Little Engine That Could", one.getTitle());
    }

    @Test
    public void bookAuthor(){
        Book one = new Book ("The Little Engine That Could", "Watty Piper");
        assertEquals("Watty Piper", one.getAuthor());
    }

    @Test
    public void bookIsbnNumber() {
        Book one = new Book("a", "b" , 123456);
        assertEquals(123456, one.getIsbnNumber());
    }

    @Test
    public void bookDatePublished() {
        Book one = new Book("a", "b" , 0, "1930-01-01");
        assertEquals("1930-01-01", one.getDatePublished());
    }


    @Test
    public void bookCategory() {
        Book one = new Book("a", "b" , 0, "", "Fiction");
        assertEquals("Fiction", one.getCategory());
    }

    @Test
    public void titleSetTest() {
        Book two = new Book("");
        two.setTitle("The Very Hungry Caterpillar");
        assertEquals("The Very Hungry Caterpillar", two.getTitle());
    }

    @Test
    public void authorSetTest() {
        Book two = new Book("", "");
        two.setAuthor("Eric Carle");
        assertEquals("Eric Carle", two.getAuthor());
    }

    @Test
    public void isbnSetTest() {
        Book two = new Book("", "", 0);
        two.setIsbnNumber(246886420);
        assertEquals(246886420, two.getIsbnNumber());
    }

    @Test
    public void dateSetTest() {
        Book two = new Book("", "", 0, "");
        two.setDatePublished("1969-06-03");
        assertEquals("1969-06-03", two.getDatePublished());
    }

    @Test
    public void categorySetTest() {
        Book two = new Book("", "", 0, "", "");
        two.setCategory("Children's Fiction");
        assertEquals("Children's Fiction", two.getCategory());
    }
}


