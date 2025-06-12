/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 *
 * @author aarchondo
 */
public class Archivos {
    
    public static void writeFile(byte[] data, String fileName) {
        try {
            OutputStream out = new FileOutputStream(fileName);
            out.write(data);
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void delete(File file) throws Exception {
        if (file.isDirectory()) {
            //directory is empty, then delete it
            if (file.list().length == 0) {
                file.delete();
                System.out.println("Directory is deleted : " + file.getAbsolutePath());
            } else {
                //list all the directory contents
                String files[] = file.list();
                for (String temp : files) {
                    //construct the file structure
                    File fileDelete = new File(file, temp);
                    //recursive delete
                    delete(fileDelete);
                }
                //check the directory again, if empty then delete it
                if (file.list().length == 0) {
                    file.delete();
                    System.out.println("Directory is deleted : " + file.getAbsolutePath());
                }
            }
        } else {
            //if file, then delete it
            file.delete();
            System.out.println("File is deleted : " + file.getAbsolutePath());
        }
    }    
}
