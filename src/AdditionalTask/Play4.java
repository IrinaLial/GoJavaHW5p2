package AdditionalTask;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class Play4 extends Play3 {
    public Play4 (double price) {
        super (price);
    }

    @Override
    public void playSong ( ) {
        System.out.println("Playing:" + super.getPlaylist()[getPlaylist().length - 1]);//проиграет последнюю песню плейлиста
    }

    @Override
    public void playAllSongs ( ){//проиграет все песни
        System.out.println ( "Playlist:" );
        for ( String song : getPlaylist ()) {
            System.out.println ( song );
        }
    }

    @Override
    public void show ( Pane root , double x , double y ) {
        super.show ( root , x , y );
        getButtonAll ( ).setOnMouseClicked ( new EventHandler<MouseEvent> ( ) {
            @Override
            public void handle ( MouseEvent event ) {
                getLabel ( ).setText ( "" );
                for ( int i = 0 ; i < getPlaylist ( ).length ; i++ ) {
                    getLabel ( ).setText ( getLabel ( ).getText ( ) + "Play: " + getSongIndex ( i ) + "\n" );
                }
            }
        } );
        getButton ().setOnMouseClicked(event -> getLabel().setText("Play: "+ getPlaylist()[getPlaylist().length - 1]));
    }
}
