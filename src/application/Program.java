package application;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

        UnzipFile.unzipFile();
        MoveArchives.moveArchives();
        ZipDirectory.makeNewZipDirectory();

        System.out.println("Done!");
    }
}
