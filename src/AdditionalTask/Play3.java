package AdditionalTask;

import javafx.scene.layout.Pane;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Play3 extends MP3Players {
    public Play3 (double price ) {
        super (price);
    }
    @Override
    public void playSong ( ) {//проиграет 1ю песню из плейлиста
        setSong ( getPlaylist ()[ 0 ] );
        super.playSong ( );
    }

    public void playAllSongs ( ) {//проиграет все песни
        System.out.println ( "Playlist:" );
        for ( String song : getPlaylist ()) {
            System.out.println ( song );
        }
    }

    @Override
    public void show ( Pane root , double x , double y ) {
        super.show ( root , x , y );
        getButtonAll ( ).setOnMouseClicked ( new EventHandler <MouseEvent> ( ) {
            @Override
            public void handle ( MouseEvent event ) {
                getLabel ( ).setText ( "" );
                for ( int i = 0 ; i < getPlaylist ( ).length ; i++ ) {
                    getLabel ( ).setText ( getLabel ( ).getText ( ) + "Play: " + getSongIndex ( i ) + "\n" );
                }
            }
        } );
        getButton ( ).setOnMouseClicked ( event -> getLabel ( ).setText ( "Play: "  + getPlaylist ()[0]) );
    }
}
