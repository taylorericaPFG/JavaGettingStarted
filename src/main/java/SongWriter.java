

public class SongWriter {

    private String writerName;
    private String songName;
    private int numberOfSongs;

    SongWriter (String writerName){
        this.writerName = writerName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongName() {
        return songName;
    }

    public void setNumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    public SongWriter (String writerName, String songName) {
        this(writerName);
        this.songName = songName;
    }

    public SongWriter (String writerName, String songName, int numberOfSongs) {
        this(writerName);
        this.songName = songName;
        this.numberOfSongs = numberOfSongs;
    }

}
