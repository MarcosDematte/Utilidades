/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Random;

/**
 *
 * @author masis
 */
public class GeneraAlfanumerico {

    public static String getCadenaAlfanumAleatoria(long longitud) {
        String cadenaAleatoria = "";
        long milis = new java.util.GregorianCalendar().getTimeInMillis();
        Random r = new Random(milis);
        while (cadenaAleatoria.length() < longitud) {
            char c = (char) r.nextInt(255);
            if ((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                cadenaAleatoria += c;
            }
        }
        return cadenaAleatoria;
    }
}
