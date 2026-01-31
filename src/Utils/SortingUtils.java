package utils;

import model.MediaContentBase;
import java.util.List;

public class SortingUtils {

    public static void sortByName(List<MediaContentBase> list) {
        list.sort((m1, m2) -> m1.getName().compareToIgnoreCase(m2.getName()));
    }

    public static void sortByDuration(List<MediaContentBase> list) {
        list.sort((m1, m2) -> Integer.compare(m1.getDuration(), m2.getDuration()));
    }
}