package MainTasks;

public class Player3 extends PlaySongList{
    public Player3 ( double price ) {
        super ( price );
    }

    @Override
    public void playSong ( ) {//проиграет 1ю песню
        setSong(playlist[0]);
        super.playSong();
    }

    @Override
    public void playAllSongs ( ) {//проиграет все песни
        super.playAllSongs ( );
    }
}

