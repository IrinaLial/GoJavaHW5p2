package AdditionalTask;

public abstract class OneSong extends Players {
    private String song = "Legacy";
    public OneSong ( double price ) {
        super ( price );
    }

    protected String getSong() {
        return song;
    }

    public OneSong(float price) {
        super(price);
    }
}

