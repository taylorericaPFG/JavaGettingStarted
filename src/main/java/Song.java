

public class Song {

    private String title;
    private String songWriter;
    private String releaseDate;

    Song (String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSongWriter() {
        return songWriter;
    }

    public void setSongWriter(String songWriter) {
        this.songWriter = songWriter;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Song (String title, String songWriter, String releaseDate) {
        this(title);
        this.songWriter = songWriter;
        this.releaseDate = releaseDate;
    }

    public Song (String title, String songWriter) {
        this(title);
        this.songWriter = songWriter;
    }



}
