package AdditionalTask;

import javafx.scene.layout.Pane;

public class Play2 extends Play1 {
    public Play2 (double price ) {
        super (price);
    }

    @Override
    public void playSong ( ) {
        System.out.println("Error!");//не проиграет песен
    }

    @Override
    public void show ( Pane root , double x , double y ) {
        super.show ( root , x , y );
        getButton().setOnMouseClicked ( event -> getLabel ().setText ("Error!"));
    }
}
