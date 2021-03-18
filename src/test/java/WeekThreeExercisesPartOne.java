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

    @Test
    public void songTitle(){
        Song numberOne = new Song ("Pretty Woman");
        assertEquals("Pretty Woman", numberOne.getTitle());
    }

    @Test
    public void songWriterName(){
        Song numberOne = new Song ("", "Roy Orbison");
        assertEquals("Roy Orbison", numberOne.getSongWriter());
    }

    @Test
    public void songReleaseDate(){
        Song numberOne = new Song ("", "", "1964-01-01");
        assertEquals("1964-01-01", numberOne.getReleaseDate());
    }

    @Test
    public void songTitleSetTest() {
        Song two = new Song("");
        two.setTitle("Crazy");
        assertEquals("Crazy", two.getTitle());
    }

    @Test
    public void writerSetTest() {
        Song two = new Song("", "");
        two.setSongWriter("Willie Nelson");
        assertEquals("Willie Nelson", two.getSongWriter());
    }

    @Test
    public void songReleaseDateSetTest() {
        Song two = new Song("", "", "");
        two.setReleaseDate("1961-10-16");
        assertEquals("1961-10-16", two.getReleaseDate());
    }

    @Test
    public void returnSongWriterNameTest(){
        SongWriter writerOne = new SongWriter ("Johnny Cash");
        assertEquals("Johnny Cash", writerOne.getWriterName());
    }

    @Test
    public void returnSongNameTest(){
        SongWriter writerOne = new SongWriter ("", "Walk The Line");
        assertEquals("Walk The Line", writerOne.getSongName());
    }

    @Test
    public void returnNumberOfSongsTest(){
        SongWriter writerOne = new SongWriter ("", "", 25);
        assertEquals(25, writerOne.getNumberOfSongs());
    }

    @Test
    public void setSongWriterTest() {
        SongWriter writerTwo = new SongWriter("");
        writerTwo.setWriterName("Billy Joel");
        assertEquals("Billy Joel", writerTwo.getWriterName());
    }

    @Test
    public void setSongNameTest() {
        SongWriter writertwo = new SongWriter("", "");
        writertwo.setSongName("Piano Man");
        assertEquals("Piano Man", writertwo.getSongName());
    }

    @Test
    public void setNumberOfSongsTest() {
        SongWriter writertwo = new SongWriter("", "", 0);
        writertwo.setNumberOfSongs(30);
        assertEquals(30, writertwo.getNumberOfSongs());
    }

}


