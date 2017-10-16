package MainTasks;

public class Player5 extends PlaySongList{
    public Player5 ( double price ) {
        super ( price );
    }

    @Override
    public void playSong ( ) {//проиграет 1ю песню
        setSong(playlist[0]);
        super.playSong();
    }

    @Override
    public void playAllSongs ( ) {//может проиграть все песни с конца плейлиста в начало
        String[] temp = playlist;
        setPlaylist(reversePlaylist());
        super.playAllSongs();
        setPlaylist(temp);
    }

    private String[] reversePlaylist() {
        String[] reversedPlaylist = new String[playlist.length];
        for (int i = 0; i < playlist.length; i++) {
            reversedPlaylist[i] = playlist[playlist.length - i - 1];
        }
        return reversedPlaylist;
    }
}