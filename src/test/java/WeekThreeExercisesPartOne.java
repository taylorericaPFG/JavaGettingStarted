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

}


