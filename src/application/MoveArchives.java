package application;

import java.io.File;

public class MoveArchives {
    public static void moveArchives(){

        // Archives to be moved
        File folder1 = new File("files/unzip/car-system/ferrari/maserati");
        File folder2 = new File("files/unzip/car-system/maserati/porsche");
        File file1 = new File("files/unzip/car-system/porsche/maserati-grandturismo.jpg");
        File file2 = new File("files/unzip/car-system/ferrari-enzon.jpg");
        File file3 = new File("files/unzip/car-system/porsche-cayenne.webp");

        // Directory Destine
        File directoryDestine = new File("files/unzip/car-system/");
        File directoryDestine3 = new File("files/unzip/car-system/maserati");
        File directoryDestine4 = new File("files/unzip/car-system/ferrari");
        File directoryDestine5 = new File("files/unzip/car-system/porsche");

        // Move files to new directory
        folder1.renameTo(new File(directoryDestine, folder1.getName()));
        folder2.renameTo(new File(directoryDestine, folder2.getName()));
        file1.renameTo(new File(directoryDestine3, file1.getName()));
        file2.renameTo(new File(directoryDestine4, file2.getName()));
        file3.renameTo(new File(directoryDestine5, file3.getName()));
    }
}

