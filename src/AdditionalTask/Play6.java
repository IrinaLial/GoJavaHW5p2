package AdditionalTask;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import java.util.Random;
public class Play6 extends Play3 {
    public Play6 (double price ) {
        super (price);
    }
    public void shuffle ( ) {//перемешивает все песни в плейлисте местами
        Random random = new Random ( );
        int index;
        String temp;

        for ( int i = 0 ; i < super.getPlaylist ( ).length ; i++ ) {
            index = random.nextInt ( super.getPlaylist ( ).length );
            if ( i != index ) {
                temp = super.getPlaylist ( )[index];

                getPlaylist ( )[ index ] = getPlaylist ( )[ i ];
                getPlaylist ( )[ i ] = temp;
            }
        }}
    @Override
    public void show ( Pane root , double x , double y ) {
        super.show ( root , x , y );
        Button button = new Button("Shuffle!");
        button.setTranslateX(25);
        button.setTranslateY(470);
        button.setOnMouseClicked(event -> shuffle());

        root.getChildren().add(button);
    }
}