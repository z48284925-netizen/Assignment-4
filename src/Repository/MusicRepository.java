package repository;

import model.MediaContentBase;
import model.Song;
import model.Podcast;
import repository.interfaces.CrudRepository;
import utils.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MusicRepository implements CrudRepository<MediaContentBase> {
    @Override
    public void create(MediaContentBase entity) {}

    @Override
    public MediaContentBase read(int id) { return null; }

    @Override
    public List<MediaContentBase> readAll() {
        List<MediaContentBase> list = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getInstance().getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM media_contents")) {
            while (rs.next()) {
                if ("SONG".equals(rs.getString("type"))) {
                    list.add(new Song(rs.getInt("id"), rs.getString("title"), rs.getInt("duration"), rs.getString("extra_info")));
                } else {
                    list.add(new Podcast(rs.getInt("id"), rs.getString("title"), rs.getInt("duration"), rs.getString("extra_info")));
                }
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return list;
    }

    @Override
    public void update(MediaContentBase entity) {}

    @Override
    public void delete(int id) {}
}