import controller.MusicController;
import service.MusicService;
import repository.MusicRepository;
import model.Song;
import utils.ReflectionUtils;

public class Main {
    public static void main(String[] args) {
        MusicRepository repo = new MusicRepository();
        MusicService service = new MusicService(repo);
        MusicController controller = new MusicController(service);

        ReflectionUtils.inspect(new Song(1, "Test", 100, "Artist"));
        controller.start();
    }
}