import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello world!");

        String currentDir = "C:\\BM\\codehub\\FolderWatcher\\changeFiles";
        System.out.println("Current dir using System 1:" + currentDir);

        boolean recursive = false;
        recursive = true;

        // register directory and process its events
        Path dir = Paths.get(currentDir);
        WatchDir watchDir = new WatchDir(dir, recursive);
        watchDir.processEvents();

    }
}