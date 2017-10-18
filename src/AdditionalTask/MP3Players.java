package AdditionalTask;

import javafx.scene.layout.Pane;
import javafx.scene.control.Button;

public abstract class MP3Players extends Players {
    private String song;
    private Button button;
    private String[] playlist = new String[]{"Karma Police" , "Daft Punk - Tron" , "Beautiful Lie"};

    public MP3Players ( double price) {
        super ( price );
    }

    public Button getButtonAll(){
        return button;
    }

    public String[] getPlaylist ( ) {
        return playlist;
    }
    protected String getSongIndex ( int i ) {
        return playlist[ i ];
    }
    public void setPlaylist ( String[] playlist ) {
        this.playlist = playlist;
    }

    public String getSong ( ) {
        return song;
    }

    public void setSong ( String song ) {
        this.song = song;
    }

    public void playSong() {
        System.out.println("Play: " + song);
    }

    @Override
    public void show ( Pane root , double x , double y ) {
        super.show ( root , x , y );
        button = new Button("Play all");
        button.setTranslateX(x + getButtonAll().getMinWidth());
        button.setTranslateY(y + 35);
        button.setMinWidth(100);
        root.getChildren().add(button);
    }
}