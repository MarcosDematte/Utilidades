/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.text.DecimalFormat;

/**
 *
 * @author aarchondo
 */
public class Numeros {

    public static String formatearDecimalParaLeer(String numero) {
        return formatearDecimalParaLeer(numero, 2);
    }
    
    public static String formatearDecimalParaLeer(String numero, int decimales) {
        String dec = "";
        for (int i = 0; i < decimales; i++){
            dec = dec + "0";
        }
        double amount = Double.parseDouble(numero);
        DecimalFormat formatter = new DecimalFormat("#,##0." + dec);
        
        //return formatter.format(amount).replace(".", "¿").replace(",", ".").replace("¿", ",");
        return formatter.format(amount);
    }
    
    public static String formatearDecimalParaLeerComa(String numero, int decimales) {
        return formatearDecimalParaLeer(numero, decimales).replace(".", "P").replaceAll(",", ".").replace("P", ",");
    }
    

    //este está solo para 2 --,
    public static String numeroATexto(float numero, int largo, int decimales) {
        String[] aux2;
        if (String.valueOf(numero).replace(".", "").length() != String.valueOf(numero).length()) {
            //aux2 = explode(".", String.valueOf(numero));
            aux2 = String.valueOf(numero).replace(".", ",").split(",");
            while (aux2[1].length() < decimales) {
                aux2[1] = aux2[1] + "0";
            }
            return utilidades.DebitoAutomatico.ajustarCampoNum(aux2[0] + aux2[1], largo);
        } else if (String.valueOf(numero).replace(",", "").length() != String.valueOf(numero).length()) {
            aux2 = String.valueOf(numero).replace(".", ",").split(",");
            while (aux2[1].length() < decimales) {
                aux2[1] = aux2[1] + "0";
            }
            return utilidades.DebitoAutomatico.ajustarCampoNum(aux2[0] + aux2[1], largo);
        } else {
            return "E";
        }
    }

    public static String numeroATexto(float numero, int largo) {
        return numeroATexto(numero, largo, 2);
    }

    public static String numeroATexto(String numero, int largo) {
        return numeroATexto(Float.valueOf(numero), largo, 2);
    }

    public static String cedulaFormatoParaImprimir(String ci) {
        String cedula = "";
        String[] c = ci.split("");
        int i = 0;
        for (int j = c.length - 1; j >= 0; j--) {
            cedula = c[j] + cedula;
            if(j == c.length - 1){
                cedula = "-" + cedula;
            }else{
                i++;
                if(i == 3){
                    cedula = "." + cedula;
                    i = 0;
                }
            }
        }
        return cedula.replaceAll("^\\.", "");
    }
    
    public static boolean telefonoFijoValido(String telefono){
        
        boolean result = false;
        
        if (telefono == null || telefono.length() != 8 || telefono.length() != telefono.replaceAll("[^0-9]", "").length() ) {
            result = false;
        }else if (telefono.length() == telefono.replaceAll("^2|^4", "").length() ) {
            //no empiezan con 2 o 4
            result = false;
        }else{
            result = true;
        }
        
        return result;
    }
      
     
    public static boolean celularValido(String celular){
        
        boolean result;
        
        if (celular == null
                || celular.replaceAll("[^0-9]", "").length() != celular.length()
                || celular.replaceAll("^09", "").length() == celular.length()
                || !celular.matches("^09\\d{7}$")
                || !celular.matches("^09\\d(\\d)\\1{5}$")) {
            result = false;
        }else{
            result = true;
        }
        
        return result;
    }
    
    public static boolean celularOTelefonoValido(String numero){
        
        boolean result = false;
        
        if(numero == null){
            result = true;
        }else if (numero.equals("0") ){
            result = true;
        }else if (numero.length() > 9 || numero.length() < 8 || numero.replaceAll("[^0-9]", "").length() != numero.length()){
            result = false;
        }else if(numero.length() == 8 && !telefonoFijoValido(numero)){
            result = false;
        }else if(numero.length() == 9 && !celularValido(numero)){
            result = false;
        }else{
            result = true;
        }
        
        return result;
    
    }
    
}
