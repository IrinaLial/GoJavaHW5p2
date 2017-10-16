package MainTasks;

public class Player2 extends Player1 {
    public Player2 ( double price ) {
        super ( price );
    }

    @Override
    public void playSong ( ) {
        System.out.println("Error!");//не проиграет песен
    }
}