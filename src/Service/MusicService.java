package service;

import model.MediaContentBase;
import repository.interfaces.CrudRepository;
import exception.DuplicateResourceException;
import exception.ResourceNotFoundException;
import java.util.List;

public class MusicService {
    private final CrudRepository<MediaContentBase> repository;

    public MusicService(CrudRepository<MediaContentBase> repository) {
        this.repository = repository;
    }

    public void addMedia(MediaContentBase media) throws DuplicateResourceException {
        if (repository.read(media.getId()) != null) {
            throw new DuplicateResourceException();
        }
        repository.create(media);
    }

    public List<MediaContentBase> getSortedMedia() {
        List<MediaContentBase> list = repository.readAll();
        list.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));
        return list;
    }

    public MediaContentBase findMedia(int id) throws ResourceNotFoundException {
        MediaContentBase media = repository.read(id);
        if (media == null) {
            throw new ResourceNotFoundException();
        }
        return media;
    }
}