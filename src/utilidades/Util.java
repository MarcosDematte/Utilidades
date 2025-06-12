/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.*;
import java.util.regex.*;

/**
 *
 * @author masis
 */
public class Util {

    public static Date FECHA_NULL = new Date(1900, 1, 1);

    public static String formatearBigDecimal(BigDecimal bd) {
        Locale localeITALY = Locale.ITALY;
        try {
            String format = NumberFormat.getNumberInstance(localeITALY).format(bd);
            if (!format.contains(",")) {
                format += ",00";
            } else {
                while ((format.length() - format.replaceAll(",.*", "").length()) > 3) {
                    format = format.substring(0, format.length() - 1);
                }
            }
            return format;
        } catch (Exception e) {
            Logger.Log(e);
            return "Error: formatearBigDecimal.";
        }
    }

    public static String formatearBigDecimal(double bd) {
        Locale localeITALY = Locale.ITALY;
        try {
            String format = NumberFormat.getNumberInstance(localeITALY).format(bd);
            if (!format.contains(",")) {
                format += ",00";
            }
            return format;
        } catch (Exception e) {
            Logger.Log(e);
            return "Error: formatearBigDecimal.";
        }
    }

    public static String aMayusSinTilde(String str) {
        str = str.toUpperCase();
        str = str.replace("Á", "A");
        str = str.replace("É", "E");
        str = str.replace("Í", "I");
        str = str.replace("Ó", "O");
        str = str.replace("Ú", "U");
        return str;
    }

    /**
     *
     * @param cadena
     * @param largo
     * @param chr
     * @return completa la cadena el caracter chr al ppio., hasta llegar a largo
     */
    public static String lPad(String cadena, int largo, char chr) {
        if (cadena != null && cadena != "") {
            StringBuffer strPad = new StringBuffer();
            for (int i = 0; i < largo - cadena.length(); i++) {
                strPad.append(chr);
            }
            return strPad.append(cadena).toString();
        } else {
            StringBuffer strPad = new StringBuffer();
            for (int i = 0; i < largo; i++) {
                strPad.append(chr);
            }
            return strPad.toString();
        }
    }

    /**
     *
     * @param cadena
     * @param largo
     * @param chr
     * @return completa la cadena el caracter chr al ppio., hasta llegar a largo
     */
    public static String rPad(String cadena, int largo, char chr) {

        if (cadena != null && cadena != "") {
            StringBuffer strPad = new StringBuffer(cadena);
            for (int i = 0; i < largo - cadena.length(); i++) {
                strPad.append(chr);
            }
            return strPad.toString();
        } else {
            StringBuffer strPad = new StringBuffer();
            for (int i = 0; i < largo; i++) {
                strPad.append(chr);
            }
            return strPad.toString();
        }
    }

    /**
     *
     * @param cadena
     * @param largo
     * @param chr
     * @return completa la cadena el caracter chr al ppio., hasta llegar a largo
     */
    public static String cPad(String cadena, int largo, char chr) {
        int l = Math.round(largo / 2);
        int r = Math.round(largo / 2 + largo % 2);

        String cadenaL = lPad(cadena.substring(0, (cadena.length() / 2 + (cadena.length() % 2))), l, chr);
        String cadenaR = rPad(cadena.substring((cadena.length() / 2) + (cadena.length() % 2), cadena.length()), r, chr);

        return cadenaL + cadenaR;
    }

    public boolean noEsVacio(String parametro) {
        if (parametro != null) {
            if (!parametro.equals("")) {
                return true;
            }
        }
        return false;
    }

    public static int darResultadoInt(Vector v) {
        BigDecimal result = (BigDecimal) ((Vector) (v.get(0))).get(0);
        BigInteger bI = result.toBigInteger();
        return bI.intValue();
    }

    public static BigDecimal darResultadoBigDecimal(Object o) {
        return (BigDecimal) o;
    }

    public static String darResultadoString(Object o) {
        //Vector v = (Vector) o;
        return String.valueOf(o);
    }

    public static boolean isEmail(String correo) {
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        mat = pat.matcher(correo);
        if (mat.find()) {
            System.out.println("[" + mat.group() + "]");
            return true;
        } else {
            return false;
        }
    }

    public static boolean isNumber(String num) {
        try {
            Long.parseLong(num);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static Integer toInteger(String numero) {
        Integer integer = new Integer(0);
        if (isNumber(numero)) {
            integer = Integer.parseInt(numero);
        }
        return integer;
    }

    public static Long toLong(String numero) {
        Long sLong = new Long(0);
        if (isNumber(numero)) {
            sLong = Long.parseLong(numero);
        }
        return sLong;
    }

    public static long tolong(String numero) {
        long retorno = 0;
        Long sLong = new Long(0);
        if (isNumber(numero)) {
            sLong = Long.parseLong(numero);
        }
        retorno = sLong.longValue();
        return retorno;
    }

    public static String toUpper(String parametro) {
        if (parametro != null) {
            return parametro.toUpperCase();
        }
        return null;
    }

    public static Object getSingleResult(Object o) {
        if (o != null && o instanceof Vector && ((Vector) o).size() > 0) {
            return ((Vector) o).firstElement();
        }
        return o;
    }

    public static Object[] getResultList(Object o) {
        if (o != null && o instanceof Vector && ((Vector) o).size() > 0) {
            Vector v = (Vector) o;
            Object[] nuevo = new Object[v.size()];
            nuevo = v.toArray();
            return nuevo;
        }
        return (Object[]) o;
    }

    public static long dispToLong(String disp) {
        int signo = 1;
        if (disp.indexOf("-") >= 0) {
            signo = -1;
        }
        disp = disp.replace("-", "0");
        return (signo * Long.parseLong(disp));
    }

    public static String obtenerDigitoVerificadorDocumentoUruguay(String digitos_cedula) {

        // si viene con digito verificador se lo saco
        if (digitos_cedula.length() >= 8) {
            return "";
        }

        digitos_cedula = utilidades.Util.lPad(digitos_cedula, 7, '0');

        int digito_verificador = 0;


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

        digito_verificador = (int) (contador % 10);


        return digito_verificador + "";
    }

    public static String convertStringToHex(String str) {

        char[] chars = str.toCharArray();

        StringBuffer hex = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            hex.append(Integer.toHexString((int) chars[i]));
        }

        return hex.toString();
    }

    public static String convertHexToString(String hex) {

        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        //49204c6f7665204a617661 split into two characters 49, 20, 4c...
        for (int i = 0; i < hex.length() - 1; i += 2) {

            //grab the hex in pairs
            String output = hex.substring(i, (i + 2));
            //convert hex to decimal
            int decimal = Integer.parseInt(output, 16);
            //convert the decimal to character
            sb.append((char) decimal);

            temp.append(decimal);
        }
        System.out.println("Decimal : " + temp.toString());

        return sb.toString();
    }

    public static Date truncDate(Date prmDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(prmDate);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.HOUR, 0);

        return calendar.getTime();
    }
    
    public static boolean isFloat(String number){
        Pattern p = Pattern.compile("^([0-9]+(,[0-9]+))$");
        if(number == null){
            return false;
        } else {
            Matcher m = p.matcher(number);
            return m.matches();
        }
    }
}