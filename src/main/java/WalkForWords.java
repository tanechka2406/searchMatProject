import lombok.SneakyThrows;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by JavaSchoolStudent on 31.08.2016.
 */
public class WalkForWords {

    @SneakyThrows
    public static boolean containsWords (Path start, List<String> list) {
        final StringBuffer log = new StringBuffer();
        Files.walkFileTree(start, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
                    throws IOException
            {

                for (String word : list) {
                    Stream<String> lines = Files.lines(file, StandardCharsets.UTF_8);
                    if (lines.anyMatch(line -> line.contains(word))) {
                        log.append("\"" + word + "\" found in file " + file +"\n\n");
                    }
                }

                //Files.delete(file);
                return FileVisitResult.CONTINUE;
            }
        });
        System.out.println(log);
        return (log.length() > 0);

    }



}
