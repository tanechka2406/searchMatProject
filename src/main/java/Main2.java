import lombok.SneakyThrows;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

/**
 * Created by JavaSchoolStudent on 31.08.2016.
 */
public class Main2 {
    final
    @SneakyThrows
    public static void main(String[] args) {

        Path start = Paths.get("C:\\Users\\JavaSchoolStudent\\Desktop\\myFolder");
        ArrayList<String> list = new ArrayList<>();
        list.add("хуй");
        list.add("блять");
        System.out.println(WalkForWords.containsWords(start, list));
    }

}
