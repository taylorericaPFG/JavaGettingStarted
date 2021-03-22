import java.util.ArrayList;

public class SongWriter {

    private String writerName;
    private String songName;
    private ArrayList<Song> songs = new ArrayList<>();

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

    public int getNumberOfSongs() {
        return songs.size();
    }

    public void addSongs(Song song){
        songs.add(song);
    }

    public ArrayList<Song> getListOfSongs(){
        return (ArrayList<Song>) songs.clone();
    }

    public SongWriter (String writerName, ArrayList<Song> songs) {
        this(writerName);
        this.songs = (ArrayList<Song>) songs.clone();
    }

    public SongWriter (String writerName, String songName) {
        this(writerName);
        this.songName = songName;
    }

}
