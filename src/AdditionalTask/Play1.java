package AdditionalTask;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class Play1 extends OneSong {
    public Play1 (double price ) {
        super (price );
    }

    @Override
    public void playSong ( )  {//проиграет песню "Legacy"
        System.out.println("Play: " + getSong ());
    }

    @Override
    public void show ( Pane root , double x , double y ) {
        super.show ( root , x , y );
        getButton().setOnMouseClicked ( event -> getLabel ().setText (getSong ()) );
    }
}