public class Album {
    private String title = "";
    private String artist = "";
    private int tracks = 0;
    private double playTime = 0.0;
    public Album(String title, String artist, int tracks, double playTime) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
        this.playTime = 0.01 * Math.round(playTime * 100.0);
    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public int getNumTracks() {
        return tracks;
    }
    public double getPlayTime() {
        return playTime;
    }
}
