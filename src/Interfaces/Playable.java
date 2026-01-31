package interfaces;

public interface Playable {
    void start();

    default void stop() {
        System.out.println("Playback stopped.");
    }

    static String getDeviceType() {
        return "Audio System";
    }
}