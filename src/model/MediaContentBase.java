package model;

public abstract class MediaContentBase {
    private int id;
    private String name;
    private int duration;

    public MediaContentBase(int id, String name, int duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }

    public abstract void play();
    public abstract String getDetails();

    public String getName() { return name; }
    public int getId() { return id; }
    public int getDuration() { return duration; }
}