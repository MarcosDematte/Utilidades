/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.ArrayList;

/**
 *
 * @author masis
 */
public class Validaciones {

    public static boolean validarMail(String mail) {
        if (mail != null && !mail.equals("")) {
            return (mail.contains("@") && mail.contains("."));
        }
        return true;

    }
    
    public static boolean validarDocumento(String documento) {

        boolean verifica = false;

        if (documento.length() == 7 || documento.length() == 8) {
            String digitos_cedula = documento.substring(0, documento.length() - 1);
            String digito_verificador = documento.substring(documento.length() - 1, documento.length());

            if (digitos_cedula.length() == 6) {
                digitos_cedula = '0' + digitos_cedula;
            }

            ArrayList<String> ci_vector_validacion = new ArrayList<String>();
            ci_vector_validacion.add("8");
            ci_vector_validacion.add("1");
            ci_vector_validacion.add("2");
            ci_vector_validacion.add("3");
            ci_vector_validacion.add("4");
            ci_vector_validacion.add("7");
            ci_vector_validacion.add("6");

            long contador = 0;

            for (int p = 0; p < digitos_cedula.length(); p++) {
                contador = contador + Long.valueOf(digitos_cedula.substring(p, p + 1)) * Long.valueOf(ci_vector_validacion.get(p));
            }

            verifica = (contador % 10) == Long.valueOf(digito_verificador);

        }

        return verifica;
    }
}
