package model;

public class Podcast extends MediaContentBase {
    private String host;

    public Podcast(int id, String name, int duration, String host) {
        super(id, name, duration);
        this.host = host;
    }

    @Override
    public void play() {
        System.out.println("Streaming podcast: " + getName() + " hosted by " + host);
    }

    @Override
    public String getDetails() {
        return "Podcast [Host: " + host + ", Duration: " + getDuration() + "s]";
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}