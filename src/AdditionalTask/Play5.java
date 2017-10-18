package AdditionalTask;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class Play5 extends Play3 {
    public Play5 ( double price ) {
        super ( price );
    }

    @Override
    public void playSong ( ) {//проиграет 1ю песню из плейлиста
        setSong ( getPlaylist ( )[ 0 ] );
        super.playSong ( );
    }

    @Override
    public void playAllSongs ( ) {//может проиграть все песни с конца плейлиста в начало
        String[] temp = getPlaylist ( );
        setPlaylist ( reversePlaylist ( ) );
        super.playAllSongs ( );
        setPlaylist ( temp );
    }

    private String[] reversePlaylist ( ) {
        String[] reversedPlaylist = new String[ getPlaylist ( ).length ];
        for ( int i = 0 ; i < getPlaylist ( ).length ; i++ ) {
            reversedPlaylist[ i ] = getPlaylist ( )[ getPlaylist ( ).length - i - 1 ];
        }
        return reversedPlaylist;
    }

    @Override
    public void show ( Pane root , double x , double y ) {
        super.show ( root , x , y );
        getButtonAll ( ).setOnMouseClicked ( new EventHandler <MouseEvent> ( ) {
            @Override
            public void handle ( MouseEvent event ) {
                getLabel ( ).setText ( "" );
                for ( int i = 0 ; i < getPlaylist ( ).length ; i++ ) {
                    getLabel ( ).setText ( getLabel ( ).getText ( ) + "Play: " + getPlaylist ( )[ getPlaylist ( ).length - i - 1 ]+"\n");
                }
            }
        } );
        getButton ( ).setOnMouseClicked ( event -> getLabel ( ).setText ( "Play: " + getSongIndex ( 0 ) ) );
    }
}
