package MainTasks;

public abstract class PlaySongList extends MusicPlayers {

    String[] playlist;

    public PlaySongList(double price) {
        super(price);

    }

    public void setPlaylist(String[] playlist) {
        this.playlist = playlist;
    }

    public void playAllSongs() {
        System.out.println("Playlist:");
        for (String song : playlist) {
            System.out.println(song);
        }
    }

}
