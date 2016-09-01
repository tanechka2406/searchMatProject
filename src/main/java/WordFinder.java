import lombok.SneakyThrows;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by JavaSchoolStudent on 31.08.2016.
 */
public class WordFinder {
    /*
    /*
     * file - путь по которому искать плоие слова (файл или директория)
     * list - список матерных слов
     * возвращает true, если содержит метрные слова, false иначе
     */
/*
    @SneakyThrows
    public static boolean containsWordsInFolder(Path path, List<String> list) {
        if (Files.isRegularFile(path)) {
            return containsWordsInFile(path, list);
        } else {

        }

        return false;
    }

    @SneakyThrows
    private static boolean containsWordsInFile(Path path, List<String> list) {
        if (!Files.isRegularFile(path)) {
            throw new RuntimeException("Method should receive a normal file.");
        }

        return false;
    }


    @SneakyThrows
    private static boolean containsWordInFile(Path path, String word) {

    }
    */
}
