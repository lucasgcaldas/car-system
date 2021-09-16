package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.function.BiFunction;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipFile {
    public static void unzipFile() throws IOException{

        String fileZip = "files/car-system.zip";
        File destDir = new File("files/unzip/");

        byte[] buffer = new byte[1024];

        File newFile;

        ZipInputStream zis = new ZipInputStream(new FileInputStream(fileZip));
        ZipEntry zipEntry = zis.getNextEntry();

        while (zipEntry != null) {

             BiFunction<File,ZipEntry, File> makingNewfile = (File destDir2, ZipEntry zipEntry2) -> {
                File destFile = new File(destDir2, zipEntry2.getName());

                 String destDirPath = null;
                 String destFilePath = null;
                 try {
                     destDirPath = destDir2.getCanonicalPath();
                     destFilePath = destFile.getCanonicalPath();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }

                 if (!destFilePath.startsWith(destDirPath + File.separator)) {
                    try {
                        throw new IOException("Entry is outside of the target dir: " + zipEntry2.getName());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                return destFile;
            };

             newFile = makingNewfile.apply(destDir, zipEntry);
            if (zipEntry.isDirectory()) {
                if (!newFile.isDirectory() && !newFile.mkdirs()) {
                    throw new IOException("Failed to create directory " + newFile);
                }
            } else {
                // fix for Windows-created archives
                File parent = newFile.getParentFile();
                if (!parent.isDirectory() && !parent.mkdirs()) {
                    throw new IOException("Failed to create directory " + parent);
                }

                // write file content
                FileOutputStream fos = new FileOutputStream(newFile);
                int len;
                while ((len = zis.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }
                fos.close();
            }
            zipEntry = zis.getNextEntry();
        }
        zis.closeEntry();
        zis.close();
    }
}