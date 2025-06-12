/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author abaher
 */
public class UtilFile {

    public static void zip(List<String> fileNames, String outFilename) {
        // Create a buffer for reading the files
        byte[] buf = new byte[1024];
        String name = "";
        int slash = 0;
        try {
            // Create the ZIP file
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outFilename));
            // Compress the files
            for (int i = 0; i < fileNames.size(); i++) {
                FileInputStream in = new FileInputStream(fileNames.get(i));

                // Add ZIP entry to output stream.
                if (fileNames.get(i).lastIndexOf('\\') != -1) {
                    slash = fileNames.get(i).lastIndexOf('\\');
                } else {
                    slash = fileNames.get(i).lastIndexOf('/');
                }
                name = fileNames.get(i).substring(slash + 1);


                // Add ZIP entry to output stream.
                out.putNextEntry(new ZipEntry(name));
                // Transfer bytes from the file to the ZIP file
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
                // Complete the entry
                out.closeEntry();
                in.close();
            }
            // Complete the ZIP file
            out.close();
        } catch (IOException e) {
        }
    }

    public static void zipAndDelete(List<String> fileNames, String outFilename) {
        zip(fileNames, outFilename);
        try {
            for (String fileName : fileNames) {
                File f = new File(fileName);
                f.delete();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<String> unZip(String strZipFile) {
        List<String> fileNames = new ArrayList<String>();
        try {
            File fSourceZip = new File(strZipFile);
            String zipPath = strZipFile.substring(0, strZipFile.length() - 4);
            File temp = new File(zipPath);
            temp.mkdir();
            System.out.println(zipPath + " created");
            ZipFile zipFile = new ZipFile(fSourceZip);
            Enumeration e = zipFile.entries();
            while (e.hasMoreElements()) {
                ZipEntry entry = (ZipEntry) e.nextElement();
                File destinationFilePath = new File(zipPath, entry.getName());
                destinationFilePath.getParentFile().mkdirs();
                if (entry.isDirectory()) {
                    continue;
                } else {
                    System.out.println("Extracting " + destinationFilePath);
                    fileNames.add(destinationFilePath.getAbsolutePath());
                    BufferedInputStream bis = new BufferedInputStream(zipFile.getInputStream(entry));
                    int b;
                    byte buffer[] = new byte[1024];
                    FileOutputStream fos = new FileOutputStream(destinationFilePath);
                    BufferedOutputStream bos = new BufferedOutputStream(fos,1024);
                    while ((b = bis.read(buffer, 0, 1024)) != -1) {
                        bos.write(buffer, 0, b);
                    }
                    bos.flush();
                    bos.close();
                    bis.close();
                }
            }
        } catch (IOException ioe) {
            System.out.println("IOError :" + ioe);
        }
        return fileNames;
    }

    public static boolean existsFile(String prmFile){
        return (new File(prmFile)).exists();
    }
}
