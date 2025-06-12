/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author masis
 */
public class Logger {

    public static void Log(Exception ex) {
        System.out.println("==================================================================================================================================");
        System.out.println(ex.getMessage());
        System.out.println(ex.getLocalizedMessage());
        System.out.println(ex.getStackTrace());
        ex.printStackTrace();            
        System.out.println("$==================================================================================================================================");
    }
}
