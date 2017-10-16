package MainTasks;

public class Main {

    private static String song1 = "1.Daft Punk - The Game has changed";
    private static String song2 = "2.Daft Punk - Digital love";
    private static String song3 = "3.Devlin - WatchTower";
    private static String song4 = "4.Paul Reeves - Legacy";
    private static String song5 = "5.Radiohead -Street Spirit";
    private static String song6 = "6.Radiohead - Karma Police";

    private static String[] playlist = {song1, song2, song3, song4, song5, song6};

    public static void main(String[] args) {

        MusicPlayers[] players = new MusicPlayers[6];

        players[0] = new Player1(4.4);
        players[1] = new Player2(6.0);
        players[2] = new Player3(1.4);
        players[3] = new Player4(4.4);
        players[4] = new Player5(5.4);
        players[5] = new Player6(9.9);


        setSongs(players);
        playSongs(players);

    }

    private static void setSongs (MusicPlayers[] players) {
        for (MusicPlayers player : players) {
            player.setSong(song1);
            if (player instanceof PlaySongList) ((PlaySongList) player).setPlaylist(playlist);
        }
    }

    private static void playSongs(MusicPlayers[] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i+1));
            players[i].playSong();
            if (players[i] instanceof PlaySongList) ((PlaySongList) players[i]).playAllSongs();
            if (players[i] instanceof Player6) {
                ((Player6) players[i]).shuffle();
                System.out.println("---Shuffling playlist---");
                ((Player6) players[i]).playAllSongs();
            }
            System.out.println();
        }
    }
}
