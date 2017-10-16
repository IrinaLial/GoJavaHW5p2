package MainTasks;

    public class MusicPlayers {

        final private double price;

        String song;

        public MusicPlayers(double price){
            this.price=price;
        }
        public double getPrice ( ) {
            return price;
        }
        public void setSong ( String song ) {
            this.song = song;
        }
        public void playSong() {
            System.out.println("Playing: " + song);
        }

}
