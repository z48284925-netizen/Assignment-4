package controller;

import service.MusicService;
import model.MediaContentBase;
import java.util.List;

public class MusicController {
    private final MusicService service;

    public MusicController(MusicService service) {
        this.service = service;
    }

    public void start() {
        System.out.println("--- Music Management System Starting ---");
        List<MediaContentBase> mediaList = service.getSortedMedia();
        if (mediaList.isEmpty()) {
            System.out.println("No media found in database.");
        } else {
            for (MediaContentBase m : mediaList) {
                System.out.println(m.getDetails());
            }
        }
    }
}