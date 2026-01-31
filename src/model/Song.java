package model;

public class Song extends MediaContentBase {
    private String artist;

    public Song(int id, String name, int duration, String artist) {
        super(id, name, duration);
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing song: " + getName() + " by " + artist);
    }

    @Override
    public String getDetails() {
        return "Song [Artist: " + artist + ", Duration: " + getDuration() + "s]";
    }
}