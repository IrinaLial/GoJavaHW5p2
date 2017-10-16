package MainTasks;

import java.util.Random;


public class Player6 extends Player3 {
    public Player6 ( double price ) {
        super ( price );
    }

    @Override
    public void playSong ( ) {
    }

    @Override
    public void playAllSongs ( ) {//проиграет все песни
        super.playAllSongs ( );
    }

    public void shuffle ( ) {//перемешивает все песни в плейлисте местами
        Random random = new Random ( );
        int index;
        String temp;

        for ( int i = 0 ; i < playlist.length ; i++ ) {
            index = random.nextInt ( playlist.length );
            if ( i != index ) {
                temp = playlist[ index ];
                playlist[ index ] = playlist[ i ];
                playlist[ i ] = temp;
            }
        }

    }}