package MainTasks;

public class Player4 extends PlaySongList {
    public Player4 ( double price ) {
        super ( price );
    }

    @Override
    public void playSong ( ) {
        setSong(playlist[playlist.length-1]);
        super.playSong();//проиграет последнюю песню
    }

    @Override
    public void playAllSongs ( ) {//проиграет все песни
        super.playAllSongs ( );
    }
}

