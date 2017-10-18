package AdditionalTask;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public abstract class Players {
    private Button button;
    private Label label;
    private final double price;

    public Players(double price){
        this.price = price;
    }
    public Button getButton ( ) {
        return button;
    }
    public abstract void playSong();

    public Label getLabel() {
        return label;
    }
    public void show(Pane root, double x, double y) {
        button = new Button("Play");
        button.setTranslateX(x);
        button.setTranslateY(y);
        button.setMinWidth(100);
        label = new Label();
        label.setTranslateX(x + button.getMinWidth() + 10);
        label.setTranslateY(y + 5);
        root.getChildren().addAll(button, label);
    }}
