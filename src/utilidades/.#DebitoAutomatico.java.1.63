/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author aarchondo
 */
public class DebitoAutomatico {

    //para ajustar campos, retorna error si se eliminan datos
    public static String eliminarCerosYEspaciosDesdeElComienzo(String field, int largo) {
        String aux = field;
        if (field == null) {
            aux = "";
        } else {
            aux = field;
        }
        int i = 0;
        while (aux.length() > largo) {
            if (aux.substring(1, 2).equals("0") || aux.substring(1, 2).equals(" ")) {
                aux = aux.substring(1, aux.length());
            } else {
                //error, se intento borrar un caracter distinto de cero o distinto de espacio
                aux = "!";
            }
            i++;
        }
        return aux;
    }

    public static String eliminarCerosYEspaciosDesdeElComienzo(String field) {
        boolean marca = false;
        String aux = field;
        if (field == null || field.replaceAll("0", "").trim().equals("")) {
            return "";
        } else {
            aux = field;
        }
        while (marca == false) {
            if (aux.substring(0, 1).equals("0") || aux.substring(0, 1).equals(" ")) {
                aux = aux.substring(1, aux.length());
            } else {
                marca = true;
            }
        }
        return aux;
    }

    public static String completarCampoConCeros(String field, int largo) {
        String string;
        if (field == null) {
            string = "";
        } else {
            string = field;
        }
        if (string.length() > largo) {
            string = "error campo mas largo que ";
        } else {
            for (int i = string.length(); i < largo; i++) {
                string = "0" + string;
            }
        }
        return string;
    }

    public static String completarCampoConEspacios(String field, int largo) {
        String string;
        if (field == null) {
            string = "";
        } else {
            string = field;
        }
        if (string.length() > largo) {
            string = "error campo mas largo que ";
        } else {
            for (int i = string.length(); i < largo; i++) {
                string = " " + string;
            }
        }
        return string;
    }

    public static String ajustarCampoNum(String field, int largo) {
        String aux = field;
        aux = eliminarCerosYEspaciosDesdeElComienzo(aux, largo);
        aux = completarCampoConCeros(aux, largo);
        return aux;
    }

    public static String ajustarCampoAlfa(String field, int largo) {
        String aux = field;
        aux = eliminarCerosYEspaciosDesdeElComienzo(aux, largo);
        aux = completarCampoConEspacios(aux, largo);
        return aux;
    }

    public static String[] getNumerosComercioSucive() {
        return new String[]{"28400208006", "28430092002", "13482607016", "13482608019", "13484880015", "28445096019", "28430086003", "28400233004", "28425554001", "28426322007", "28430090006", "28430264009", "28430147009", "28430918005", "28435941002", "28426931007", "28428707006", "28436559008", "28426579007"};
    }

    public static String getNumerosComercioSuciveParaIN() {
        return "'28400208006', '28430092002', '13482607016', '13482608019', '13484880015', '28445096019', '28430086003', '28400233004', '28425554001', '28426322007', '28430090006', '28430264009', '28430147009', '28430918005', '28435941002', '28426931007', '28428707006', '28436559008', '28426579007'";
    }

    public static String getDepartamentoNameFromComercioCabal(String comercioCabal) {
        String result;
        //'28400208006', '28430092002', '13482607016', '13482608019', '13484880015', '28445096019', '28430086003', '28400233004', '28425554001', '28426322007', '28430090006', '28430264009', '28430147009', '28430918005', '28435941002', '28426931007', '28428707006', '28436559008', '28426579007'
        if (comercioCabal.equals("28400208006")) {
            result = "MONTEVIDEO";
        } else if (comercioCabal.equals("28430092002")) {
            result = "MALDONADO";
        } else if (comercioCabal.equals("13482607016")) {
            result = "ROCHA";
        } else if (comercioCabal.equals("13482608019")) {
            result = "LAVALLEJA";
        } else if (comercioCabal.equals("13484880015")) {
            //result = "TREINTAYTRES";
            result = "TYTRES";
        } else if (comercioCabal.equals("28445096019")) {
            result = "CERROLARGO";
        } else if (comercioCabal.equals("28430086003")) {
            result = "RIVERA";
        } else if (comercioCabal.equals("28400233004")) {
            result = "TACUAREMBO";
        } else if (comercioCabal.equals("28425554001")) {
            result = "SALTO";
        } else if (comercioCabal.equals("28426322007")) {
            result = "FLORIDA";
        } else if (comercioCabal.equals("28430090006")) {
            result = "PAYSANDU";
        } else if (comercioCabal.equals("28430264009")) {
            result = "RIONEGRO";
        } else if (comercioCabal.equals("28430147009")) {
            result = "COLONIA";
        } else if (comercioCabal.equals("28430918005")) {
            result = "SORIANO";
        } else if (comercioCabal.equals("28435941002")) {
            result = "SANJOSE";
        } else if (comercioCabal.equals("28426931007")) {
            result = "FLORES";
        } else if (comercioCabal.equals("28428707006")) {
            result = "CANELONES";
        } else if (comercioCabal.equals("28436559008")) {
            result = "ARTIGAS";
        } else if (comercioCabal.equals("28426579007")) {
            result = "DURAZNO";
        } else {
            result = "0";
        }

        return result;
    }
    
    public static String getDepartamentoFromComercioCabal(String comercioCabal) {
        String result = "";

        if (comercioCabal.equals("28400208006")) {
            result = "19";//MONTEVIDEO
        }else if (comercioCabal.equals("28430092002")) {
            result = "14";//MALDONADO
        }else if(comercioCabal.equals("13482607016")){
            result = "15";//ROCHA
        }else if(comercioCabal.equals("13482608019")){
            result = "18";//LAVALLEJA
        }else if(comercioCabal.equals("13484880015")){
            result = "13";//TREINTA Y TRES
        }else if (comercioCabal.equals("28445096019")) {
            result = "3";//CERRO LARGO
        } else if (comercioCabal.equals("28430086003")) {
            result = "17";//RIVERA
        } else if (comercioCabal.equals("28400233004")) {
            result = "9";//TACUAREMBO
        } else if (comercioCabal.equals("28425554001")) {
            result = "7";//SALTO
        } else if (comercioCabal.equals("28426322007")) {
            result = "16";//FLORIDA
        } else if (comercioCabal.equals("28430090006")) {
            result = "8";//PAYSANDU
        } else if (comercioCabal.equals("28430264009")) {
            result = "11";//RIO NEGRO
        } else if (comercioCabal.equals("28430147009")) {
            result = "4";//COLONIA
        } else if (comercioCabal.equals("28430918005")) {
            result = "10";//SORIANO
        } else if (comercioCabal.equals("28435941002")) {
            result = "12";//SAN JOSE
        } else if (comercioCabal.equals("28426931007")) {
            result = "6";//FLORES
        } else if (comercioCabal.equals("28428707006")) {
            result = "2";//CANELONES
        } else if (comercioCabal.equals("28436559008")) {
            result = "1";//ARTIGAS
        } else if (comercioCabal.equals("28426579007")) {
            result = "5";//DURAZNO
        } else {
            result = "0";
        }

        return result;
    }  

    public static HashMap getFieldsNames(String numeroComercio) {
        //CAMBIO AHORA ESTÁ EN padronDebitoVO
        //Ancel           Contratro y Nº de móvil
        //Antel           Nº de cuenta
        //Ute             Nº de cuenta
        //Ose             Nª de cuenta
        //Gaseba  Nº de cliente
        HashMap result = new HashMap();
        
        result.put("referencia", "unnamed");
        result.put("campoAuxiliar1", "unnamed");
        result.put("campoAuxiliar2", "unnamed");
        result.put("campoAuxiliar3", "unnamed");
        result.put("campoAuxiliar4", "unnamed");
        result.put("cuotas", "unnamed");        
        
        if (numeroComercio.equals(Codigos.ID_BSE_DOLARES) || numeroComercio.equals(Codigos.ID_BSE_PESOS)) { //BSE
            result.put("referencia", Codigos.DEBITOS_AUTOMATICOS_COLUMNA5);
            result.put("campoAuxiliar1", Codigos.DEBITOS_AUTOMATICOS_COLUMNA9);
            result.put("campoAuxiliar2", "Certificado");//Certificado
            result.put("campoAuxiliar3", "Verificadores");//Verificadores
        } else if (numeroComercio.equals(Codigos.ID_GASEBA)) { //gaseba
            result.put("referencia", Codigos.DEBITOS_AUTOMATICOS_COLUMNA6);
        } else if (numeroComercio.equals(Codigos.ID_STM)) { //stm
            result.put("referencia", "C.I.");
        } else if (numeroComercio.equals(Codigos.ID_OSE)) { //ose
            result.put("referencia", Codigos.DEBITOS_AUTOMATICOS_COLUMNA4);
        } else if (numeroComercio.equals(Codigos.ID_UTE)) { //ute
            result.put("referencia", Codigos.DEBITOS_AUTOMATICOS_COLUMNA4);
        } else if (numeroComercio.equals(Codigos.ID_ANCEL)) { //ancel
            result.put("referencia", Codigos.DEBITOS_AUTOMATICOS_COLUMNA7);
            result.put("campoAuxiliar1", Codigos.DEBITOS_AUTOMATICOS_COLUMNA8);
        } else if (numeroComercio.equals(Codigos.ID_ANTEL)) { //antel
            result.put("referencia", Codigos.DEBITOS_AUTOMATICOS_COLUMNA4);
        } else if (isSucive(numeroComercio)) {
            result.put("campoAuxiliar1", Codigos.DEBITOS_AUTOMATICOS_COLUMNA1);//padron
            result.put("campoAuxiliar2", Codigos.DEBITOS_AUTOMATICOS_COLUMNA2);//matricula
            result.put("cuotas", "Sucive [1 o 6 ]#1=1 Contado (20% descuento);6=6 Cuotas Bimensuales Sucive ( 10% descuento en cada cuota )#");
        } else if (numeroComercio.equals(Codigos.ID_CPU_APORTES) || numeroComercio.equals(Codigos.ID_CPU_PRESTAMOS_DOLARES)) {
            result.put("referencia", Codigos.DEBITOS_AUTOMATICOS_COLUMNA6);
        } else if (numeroComercio.equals(Codigos.ID_IM_DURAZNO_CONT_URBANA)) {
            result.put("referencia", Codigos.DEBITOS_AUTOMATICOS_COLUMNA1);
            result.put("cuotas", "Cuotas (0-cont 1-cuot)#0=Contado;1=Cuotas#");
            result.put("extraFields", "Sección Judicial;Letra;Block;Localidad;Apartamento");//<- Uso campo auxiliar 3 para esto
        } else if (numeroComercio.equals(Codigos.ID_IM_DURAZNO_CONT_RURAL)) {
            result.put("referencia", Codigos.DEBITOS_AUTOMATICOS_COLUMNA1);
            result.put("campoAuxiliar1", "Sección Judicial");
            result.put("cuotas", "Cuotas (0-cont 1-cuot)#0=Contado;1=Cuotas#");
        } else if (numeroComercio.equals(Codigos.ID_ANCEL)) {
            result.put("referencia", Codigos.DEBITOS_AUTOMATICOS_COLUMNA7);
            result.put("campoAuxiliar1", Codigos.DEBITOS_AUTOMATICOS_COLUMNA8);
        } else if (numeroComercio.equals(Codigos.ID_ANTEL)) {
            result.put("referencia", Codigos.DEBITOS_AUTOMATICOS_COLUMNA7);
        } else if (numeroComercio.equals(Codigos.ID_PRIMARIA)) {
            result.put("campoAuxiliar1", Codigos.DEBITOS_AUTOMATICOS_COLUMNA1);
            result.put("campoAuxiliar2", "Depto.(Ej. MONRU - MONUR)");
            result.put("cuotas", "Cuotas (1=cont 3=cuot)#1=Contado;3=Cuotas#");
            result.put("extraFields", "Apartamento;Block;Planta;Torre;Zona;Localidad;Sección Judicial");//<- Uso campo auxiliar 3 para esto
        } else if (numeroComercio.equals(Codigos.ID_IM_MONTEVIDEO_CONTRIBUCION )) {
            result.put("referencia", Codigos.DEBITOS_AUTOMATICOS_COLUMNA3);
            result.put("cuotas", "Cuotas (1-cont 3-cuot)#1=Contado;3=Cuotas#");           
        } else if (numeroComercio.equals(Codigos.ID_IM_MONTEVIDEO_TRIBUTOS_DOMICILIARIOS )) {
            result.put("referencia", Codigos.DEBITOS_AUTOMATICOS_COLUMNA3);        
        } else if (numeroComercio.equals(Codigos.ID_IM_MONTEVIDEO_TASA_SANEAMIENTO )) {
            result.put("referencia", Codigos.DEBITOS_AUTOMATICOS_COLUMNA3);          
        } else if (numeroComercio.equals(Codigos.ID_IM_SORIANO_CONT_RURAL) || numeroComercio.equals(Codigos.ID_IM_SORIANO_CONT_URBANA)) {
            result.put("referencia", Codigos.DEBITOS_AUTOMATICOS_COLUMNA1);
            //result.put("campoAuxiliar1", "Sección Judicial");
            //result.put("campoAuxiliar2", "Apartamento");
            result.put("cuotas", "Cuotas (0=cont 1=cuot)#0=Contado;1=Cuotas#");           
            result.put("extraFields", "Sección Judicial;Apartamento;Letra;Localidad");//<- Uso campo auxiliar 3 para esto             
        } else if (numeroComercio.equals(Codigos.ID_IM_SALTO_CONT_RURAL) || numeroComercio.equals(Codigos.ID_IM_SALTO_CONT_URBANA)) {
            result.put("referencia", Codigos.DEBITOS_AUTOMATICOS_COLUMNA1);
            result.put("campoAuxiliar1", "Apartamento");
            result.put("campoAuxiliar2", "Localidad");
            result.put("cuotas", "Cuotas (0=cont 1=cuot 2=12pagos)#0=Contado;1=4 Cuotas;2=12 Cuotas#");           
        } else if (numeroComercio.equals(Codigos.ID_IM_DURAZNO_CONT_RURAL) || numeroComercio.equals(Codigos.ID_IM_DURAZNO_CONT_URBANA)) {
            result.put("referencia", Codigos.DEBITOS_AUTOMATICOS_COLUMNA1);
            result.put("campoAuxiliar1", "Apartamento");
            result.put("campoAuxiliar2", "Localidad");
            result.put("cuotas", "Cuotas (0=cont 1=cuot 2=12pagos)#0=Contado;1=4 Cuotas;2=12 Cuotas#");           
        } else if (numeroComercio.equals(Codigos.ID_IM_PAYSANDU_CONT_RURAL) || numeroComercio.equals(Codigos.ID_IM_PAYSANDU_CONT_URBANA)) {
            result.put("referencia", Codigos.DEBITOS_AUTOMATICOS_COLUMNA1);
            result.put("campoAuxiliar1", "Apartamento");
            result.put("campoAuxiliar2", "Localidad");
            result.put("campoAuxiliar3", Codigos.DEBITOS_AUTOMATICOS_COLUMNA11);
            result.put("cuotas", "Cuotas (2=cont 1=cuot)#2=Contado;1=Cuotas#");           
        } else if (numeroComercio.equals(Codigos.ID_IM_SAN_JOSE_CONT_RURAL)) {
            result.put("referencia", Codigos.DEBITOS_AUTOMATICOS_COLUMNA1);
            result.put("campoAuxiliar1", "Sección Judicial");
            result.put("cuotas", "Cuotas (0=cont 1=cuot)#0=Contado;1=Cuotas#");           
        } else if (numeroComercio.equals(Codigos.ID_IM_SAN_JOSE_CONT_URBANA)) {
            result.put("referencia", Codigos.DEBITOS_AUTOMATICOS_COLUMNA1);
            result.put("campoAuxiliar1", "Localidad");
            result.put("campoAuxiliar2", "Apartamento");
            result.put("cuotas", "Cuotas (0=cont 1=cuot)#0=Contado;1=Cuotas#");           
        } else if (numeroComercio.equals(Codigos.ID_IM_CANELONES_CONT_RURAL) || numeroComercio.equals(Codigos.ID_IM_CANELONES_CONT_URBANA)) {
            result.put("referencia", "Código Municipal");
            result.put("campoAuxiliar1", "Padrón");
            result.put("campoAuxiliar2", "Localidad");
            result.put("cuotas", "Cuotas (1=cont 6=cuot)#1=Contado;6=Cuotas#");           
        } else if (numeroComercio.equals(Codigos.ID_IM_RIVERA_CONT_RURAL) || numeroComercio.equals(Codigos.ID_IM_RIVERA_CONT_URBANA)) {
            result.put("referencia", "Padrón");
//            result.put("campoAuxiliar1", "Sección Judicial");
//            result.put("campoAuxiliar2", "Apartamento");
//            result.put("campoAuxiliar3", "Localidad");
            result.put("extraFields", "Sección Judicial;Apartamento;Localidad");
            result.put("cuotas", "Cuotas (0=cont 1=cuot)#0=Contado;1=Cuotas#");           
        } else if (numeroComercio.equals(Codigos.ID_IM_FLORIDA_CONT_RURAL) || numeroComercio.equals(Codigos.ID_IM_FLORIDA_CONT_URBANA)) {
            result.put("referencia", "Padrón");
            result.put("campoAuxiliar1", "Localidad");
            result.put("campoAuxiliar2", "Apartamento");
            result.put("cuotas", "Cuotas (0=cont 1=cuot)#0=Contado;1=Cuotas#");           
        } else if (numeroComercio.equals(Codigos.ID_IM_TACUAREMBO_CONT_RURAL) || numeroComercio.equals(Codigos.ID_IM_TACUAREMBO_CONT_URBANA)) {
            result.put("referencia", "Padrón");
//            result.put("campoAuxiliar1", "Sección Judicial");
//            result.put("campoAuxiliar2", "Apartamento");
//            result.put("campoAuxiliar3", "Localidad");
            result.put("extraFields", "Sección Judicial;Apartamento;Localidad");
            result.put("cuotas", "Cuotas (0=cont 1=cuot)#0=Contado;1=Cuotas#");  
        } else if (numeroComercio.equals(Codigos.ID_IM_FLORES_CONT_RURAL) || numeroComercio.equals(Codigos.ID_IM_FLORES_CONT_URBANA)) {
            result.put("referencia", "Padrón");
//            result.put("campoAuxiliar1", "Sección Judicial");
//            result.put("campoAuxiliar2", "Apartamento");
//            result.put("campoAuxiliar3", "Localidad");
            result.put("extraFields", "Sección Judicial;Apartamento;Localidad");
            result.put("cuotas", "Cuotas (0=cont 1=cuot)#0=Contado;1=Cuotas#");  
        } else if (numeroComercio.equals(Codigos.ID_IM_MALDONADO_CONT_RURAL_Y_URBANA)) {
            result.put("referencia", "Codigo Municipal");
            result.put("campoAuxiliar1", "Padrón");
            result.put("campoAuxiliar2", "Apartamento");
            result.put("campoAuxiliar3", "Tipo(URBANA/RURAL)");
            result.put("campoAuxiliar4", "Localidad");
            //result.put("cuotas", "Cuotas (0=cont 1=cuot)#0=Contado;1=Cuotas#");  // siempre 1
        } else if (numeroComercio.equals(Codigos.ID_IM_ARTIGAS_CONT_RURAL) || numeroComercio.equals(Codigos.ID_IM_ARTIGAS_CONT_URBANA)) {
            result.put("referencia", "Padrón");
            result.put("campoAuxiliar1", "Localidad");
            result.put("campoAuxiliar2", "Sec. Judicial");
            result.put("campoAuxiliar3", "Apto");
            result.put("cuotas", "Cuotas (0=cont 1=cuot)#0=Contado;1=Cuotas#");
        } else if (numeroComercio.equals(Codigos.ID_IM_COLONIA_CONT_RURAL) || numeroComercio.equals(Codigos.ID_IM_COLONIA_CONT_URBANA)) {
            result.put("referencia", "Padrón");
            result.put("campoAuxiliar1", "Sec.Cat");
            result.put("campoAuxiliar2", "Nro.Loc");
            result.put("extraFields", "LOCPAG;DESC.LOCALIDAD;HORIZ;TIPH;BLOCK");
            result.put("campoAuxiliar4", "mz");
            result.put("cuotas", "Cuotas (1=cont 5=cuot)#1=Contado;5=Cuotas#");
        } else if (numeroComercio.equals(Codigos.ID_TELEPEAJE)) {
            result.put("campoAuxiliar2", Codigos.DEBITOS_AUTOMATICOS_COLUMNA2);//matricula
        }
        return result;
    }

    public static String getNombreDescarga(String numeroComercio, int descarga) {
//        HashMap hashMap = new HashMap();
//        hashMap = getFieldsNames(numeroComercio);
//        if()
//        cargar todo en 1 sola funcion, llamar con esta y devolver unnamed si no se impelemto

        if (numeroComercio.equals(utilidades.Codigos.ID_BSE_DOLARES) || numeroComercio.equals(utilidades.Codigos.ID_BSE_PESOS)) { //BSE
            if (descarga == 1) {
                return "BANCODEB";
            } else if (descarga == 2) {
                return "DEB-AUT-REMESAS";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_GASEBA)) { //gaseba
            if (descarga == 1) {
                return "BANCODEB";
            } else if (descarga == 2) {
                return "DEB-AUT-REMESAS";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_OSE)) { //ose
            if (descarga == 1) {
                return "BANCODEB";
            } else if (descarga == 2) {
                return "DEB-AUT-REMESAS";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_UTE)) { //ute
            if (descarga == 1) {
                return "BANCODEB";
            } else if (descarga == 2) {
                return "DEB-AUT-REMESAS";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_ANTEL)) {
            if (descarga == 1) {
                return "BANCODEB";
            } else if (descarga == 2) {
                return "DEB-AUT-REMESAS";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_ANCEL)) {
            if (descarga == 1) {
                return "BANCODEB";
            } else if (descarga == 2) {
                return "DEB-AUT-REMESAS";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_CPU_APORTES) || numeroComercio.equals(utilidades.Codigos.ID_CPU_PRESTAMOS_DOLARES)) {
            if (descarga == 1) {
                return "unnamed";
            } else if (descarga == 2) {
                return "DEB-AUT-REMESAS";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_IM_DURAZNO_CONT_RURAL) || numeroComercio.equals(utilidades.Codigos.ID_IM_DURAZNO_CONT_URBANA)) {
            if (descarga == 1) {
                return "unnamed";
            } else if (descarga == 2) {
                return "DEB-AUT-REMESAS";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_IM_SALTO_CONT_RURAL) || numeroComercio.equals(utilidades.Codigos.ID_IM_SALTO_CONT_URBANA)) {
            if (descarga == 1) {
                return "DEB-AUT-REMESAS";
            } else if (descarga == 2) {
                return "unnamed";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_IM_SORIANO_CONT_RURAL) || numeroComercio.equals(utilidades.Codigos.ID_IM_SORIANO_CONT_URBANA)) {
            if (descarga == 1) {
                return "DEB-AUT-REMESAS";
            } else if (descarga == 2) {
                return "unnamed";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_IM_SAN_JOSE_CONT_RURAL) || numeroComercio.equals(utilidades.Codigos.ID_IM_SAN_JOSE_CONT_URBANA)) {
            if (descarga == 1) {
                return "DEB-AUT-REMESAS";
            } else if (descarga == 2) {
                return "unnamed";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_IM_FLORIDA_CONT_RURAL) || numeroComercio.equals(utilidades.Codigos.ID_IM_FLORIDA_CONT_URBANA)) {
            if (descarga == 1) {
                return "DEB-AUT-REMESAS";
            } else if (descarga == 2) {
                return "unnamed";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_IM_RIVERA_CONT_RURAL) || numeroComercio.equals(utilidades.Codigos.ID_IM_RIVERA_CONT_URBANA)) {
            if (descarga == 1) {
                return "DEB-AUT-REMESAS";
            } else if (descarga == 2) {
                return "unnamed";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_IM_CANELONES_CONT_RURAL) || numeroComercio.equals(utilidades.Codigos.ID_IM_CANELONES_CONT_URBANA)) {
            if (descarga == 1) {
                return "Archivo Devolución";
            } else if (descarga == 2) {
                return "DEB-AUT-REMESAS";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_IM_TACUAREMBO_CONT_RURAL) || numeroComercio.equals(utilidades.Codigos.ID_IM_TACUAREMBO_CONT_URBANA)) {
            if (descarga == 1) {
                return "DEB-AUT-REMESAS";
            } else if (descarga == 2) {
                return "unnamed";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_IM_FLORES_CONT_RURAL) || numeroComercio.equals(utilidades.Codigos.ID_IM_FLORES_CONT_URBANA)) {
            if (descarga == 1) {
                return "unnamed";
            } else if (descarga == 2) {
                return "DEB-AUT-REMESAS";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_IM_PAYSANDU_CONT_RURAL) || numeroComercio.equals(utilidades.Codigos.ID_IM_PAYSANDU_CONT_URBANA)) {
            if (descarga == 1) {
                return "PAYSANDU-DEB-AUT-REMESAS";
            } else if (descarga == 2) {
                return "unnamed";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_IM_COLONIA_CONT_RURAL) || numeroComercio.equals(utilidades.Codigos.ID_IM_COLONIA_CONT_URBANA)) {
            if (descarga == 1) {
                return "COLONIA-DEB-AUT-REMESAS";
            } else if (descarga == 2) {
                return "unnamed";
            } else {
                return "unnamed";
            }
        } else if (isSucive(numeroComercio)) {//sucive
            if (descarga == 1) {
                return "Excel";
            } else if (descarga == 2) {
                return "HG";
            } else if (descarga == 3) {
                return "unnamed";
            } else if (descarga == 4) {
                return "unnamed";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_PRIMARIA)) { //gaseba
            if (descarga == 1) {
                return "unnamed";
            } else if (descarga == 2) {
                return "DEB-AUT-REMESAS";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_IM_MONTEVIDEO_CONTRIBUCION)) {
            if (descarga == 1) {
                return "bajas.txt";
            } else if (descarga == 2) {
                return "DEB-AUT-REMESAS";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_IM_MONTEVIDEO_TASA_SANEAMIENTO)) {
            if (descarga == 1) {
                return "bajas.txt";
            } else if (descarga == 2) {
                return "DEB-AUT-REMESAS";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_IM_MONTEVIDEO_TRIBUTOS_DOMICILIARIOS)) {
            if (descarga == 1) {
                return "bajas.txt";
            } else if (descarga == 2) {
                return "DEB-AUT-REMESAS";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_IM_MALDONADO_CONT_RURAL_Y_URBANA)) {
            if (descarga == 1) {
                return "MALDONADO-DEB-AUT-REMESAS";
            } else if (descarga == 2) {
                return "unnamed";
            } else {
                return "unnamed";
            }
        } else if (numeroComercio.equals(utilidades.Codigos.ID_IM_ARTIGAS_CONT_RURAL) || numeroComercio.equals(utilidades.Codigos.ID_IM_ARTIGAS_CONT_URBANA)) {
            if (descarga == 1) {
                return "ARTIGAS-DEB-AUT-REMESAS";
            } else if (descarga == 2) {
                return "unnamed";
            } else {
                return "unnamed";
            }
        } else {
            return "unnamed";
        }

    }

    public static boolean isSucive(String numeroComercio) {
        return numeroComercio.equals("28400208006") || numeroComercio.equals("28400233004") || numeroComercio.equals("28425554001")
                || numeroComercio.equals("28426322007") || numeroComercio.equals("28426579007") || numeroComercio.equals("28426931007")
                || numeroComercio.equals("28428707006") || numeroComercio.equals("28430086003") || numeroComercio.equals("28430090006")
                || numeroComercio.equals("28430092002") || numeroComercio.equals("28430147009") || numeroComercio.equals("28430264009")
                || numeroComercio.equals("28430918005") || numeroComercio.equals("28435941002") || numeroComercio.equals("28436559008")
                || numeroComercio.equals("13482607016") || numeroComercio.equals("13482608019") || numeroComercio.equals("13484880015")
                || numeroComercio.equals("28445096019") || numeroComercio.equals(Codigos.ID_SUCIVE);
    }

    public static boolean isSTM(String nComercio) {
        return nComercio.equals(utilidades.Codigos.ID_STM) || 
               nComercio.equals("7790076015") || 
               nComercio.equals("7792443019") || 
               nComercio.equals("7792445015") || 
               nComercio.equals("7792449017") || 
               nComercio.equals("7792451014") || 
               nComercio.equals("7700046060") || 
               nComercio.equals("7700046091") || 
               nComercio.equals("7700046022") || 
               nComercio.equals("7700046053") || 
               nComercio.equals("7700046084") || 
               nComercio.equals("7700046015") || 
               nComercio.equals("7700046046") || 
               nComercio.equals("7700046077") || 
               nComercio.equals("7700046008") || 
               nComercio.equals("7700046039") || 
               nComercio.equals("7700049014");
    }

    public static boolean isListgra(String numeroComercio) {
        return numeroComercio.equals("91383052010") || numeroComercio.equals("28445185012");
    }

    
    public static String getClassNameFromNumeroComercio(String numeroComercio) {
        String result = "";
        if (numeroComercio.equals(utilidades.Codigos.ID_GASEBA)) {
            result = "Gaseba";
        } else if (numeroComercio.equals(utilidades.Codigos.ID_OSE)) {
            result = "Ose";
        } else if (numeroComercio.equals(utilidades.Codigos.ID_UTE)) {
            result = "Ute";
        } else if (utilidades.DebitoAutomatico.isSucive(numeroComercio)) {
            result = "Sucive";
        } else if (utilidades.DebitoAutomatico.isListgra(numeroComercio)) {
            result = "Listgra";
        }else if (numeroComercio.equals(utilidades.Codigos.ID_ANCEL)) {
            result = "Ancel";
        }else if (numeroComercio.equals(utilidades.Codigos.ID_ANTEL)) {
            result = "Antel";
        }else if (numeroComercio.equals(utilidades.Codigos.ID_BSE_DOLARES) || numeroComercio.equals(utilidades.Codigos.ID_BSE_PESOS)) {
            result = "Bse";
        }else if (numeroComercio.equals(utilidades.Codigos.ID_CPU_APORTES) || numeroComercio.equals(utilidades.Codigos.ID_CPU_PRESTAMOS_DOLARES)) {
            result = "Cpu";
        }else if (numeroComercio.equals(utilidades.Codigos.ID_IM_DURAZNO_CONT_RURAL) || numeroComercio.equals(utilidades.Codigos.ID_IM_DURAZNO_CONT_URBANA)) {
            result = "IMDuraznoContribucion";
        }else if (numeroComercio.equals(utilidades.Codigos.ID_PRIMARIA)) {
            result = "Primaria";
        }else if (numeroComercio.equals(utilidades.Codigos.ID_IM_MONTEVIDEO_CONTRIBUCION)) {
            result = "IMMontevideoContribucion";
        }else if (numeroComercio.equals(utilidades.Codigos.ID_IM_MONTEVIDEO_TASA_SANEAMIENTO)) {
            result = "IMMontevideoTasaSaneamiento";
        }else if (numeroComercio.equals(utilidades.Codigos.ID_IM_MONTEVIDEO_TRIBUTOS_DOMICILIARIOS)) {
            result = "IMMontevideoTributosDomiciliarios";
        }

        return result;
    }

    public static String descargar1(Long fechaEntecad, Date fechaProc, String numeroComercio) throws Exception {

        String nombreArchivo = "descarga_1_GENERICA"+ utilidades.Fechas.formatDateForFile(new Date()) +".txt";

        if (numeroComercio.equals(Codigos.ID_GASEBA)) { //gaseba
            //28428801005-505-20140505.0430
            String aux = fechaEntecad.toString();
            aux = utilidades.DebitoAutomatico.ajustarCampoNum(aux, 8);
            nombreArchivo = "BANCODEB-" + numeroComercio + "-505-" + aux.substring(4, 8) + aux.substring(2, 4) + aux.substring(0, 2) + "." + aux.substring(2, 4) + aux.substring(0, 2);
        } else if (numeroComercio.equals(Codigos.ID_OSE)) { //ose
            //BANCODEB-nnnnnnnnnnn-505-yyyymmdd.mmdd ( nnnnnnnnnnn = nro de comercio cabal / yyyymmdd = fecha vencimiento / mmdd = mes/dia de generación
            String aux = fechaEntecad.toString();
            aux = utilidades.DebitoAutomatico.ajustarCampoNum(aux, 8);
            nombreArchivo = "505" + aux.substring(4, 8) + aux.substring(2, 4) + aux.substring(0, 2) + "." + aux.substring(2, 4) + aux.substring(0, 2);
        } else if (numeroComercio.equals(Codigos.ID_UTE)) { //ute
            nombreArchivo = "BANCODEB";
        } else if (numeroComercio.equals(Codigos.ID_BSE_PESOS)) { //bse pesos
            nombreArchivo = utilidades.DebitoAutomatico.getNombreDescarga(Codigos.ID_BSE_PESOS, 1) + ".txt";
        } else if (numeroComercio.equals(Codigos.ID_BSE_DOLARES)) { //bse dolares
            nombreArchivo = utilidades.DebitoAutomatico.getNombreDescarga(Codigos.ID_BSE_DOLARES, 1) + ".txt";
        } else if (utilidades.DebitoAutomatico.isSucive(numeroComercio)) {
            nombreArchivo = "Sucive_" + utilidades.Fechas.formatDateAAAAmmdd(new Date()) + ".xls";
        } else if (numeroComercio.equals(Codigos.ID_ANCEL)) { //ancel
            nombreArchivo = "BANCODEB-ANCEL";
        } else if (numeroComercio.equals(Codigos.ID_ANTEL)) { //antel
            nombreArchivo = "BANCODEB-ANTEL";
        } else if (numeroComercio.equals(Codigos.ID_IM_CANELONES_CONT_URBANA)) { //antel
            nombreArchivo = "URBPRCAN";
        } else if (numeroComercio.equals(Codigos.ID_IM_MALDONADO_CONT_RURAL_Y_URBANA)) { //antel
            nombreArchivo = "ID_IM_MALDONADO_CONT_RURAL_Y_URBANA.txt";
        } else if (numeroComercio.equals(utilidades.Codigos.ID_IM_MONTEVIDEO_CONTRIBUCION)
                || numeroComercio.equals(utilidades.Codigos.ID_IM_MONTEVIDEO_TASA_SANEAMIENTO)
                || numeroComercio.equals(utilidades.Codigos.ID_IM_MONTEVIDEO_TRIBUTOS_DOMICILIARIOS)) {
            nombreArchivo = "bajas.txt";
        }else if (numeroComercio.equals(Codigos.ID_IM_SAN_JOSE_CONT_RURAL) || numeroComercio.equals(Codigos.ID_IM_SAN_JOSE_CONT_URBANA)) { 
            nombreArchivo = "BANCODEB" + utilidades.Fechas.formatDateForFile(new Date()) +".txt";
        }else if (numeroComercio.equals(Codigos.ID_IM_TACUAREMBO_CONT_RURAL)) { 
            nombreArchivo = "BANCODEB.RURAL-" + utilidades.Fechas.formatDateForFile(new Date()) +".txt";
        }else if (numeroComercio.equals(Codigos.ID_IM_TACUAREMBO_CONT_URBANA)) { 
            nombreArchivo = "BANCODEB.URBANA-" + utilidades.Fechas.formatDateForFile(new Date()) +".txt";
        }else if (numeroComercio.equals(Codigos.ID_IM_COLONIA_CONT_URBANA)) { 
            nombreArchivo = "COLONIA.URBANA-" + utilidades.Fechas.formatDateForFile(new Date()) +".txt";
        }else if (numeroComercio.equals(Codigos.ID_IM_COLONIA_CONT_RURAL)) { 
            nombreArchivo = "COLONIA.RURAL-" + utilidades.Fechas.formatDateForFile(new Date()) +".txt";
        }

        return nombreArchivo;
    }

    public static String descargar2(Long fechaEntecad, Date fechaProc, String numeroComercio) throws Exception {

        String result = "descarga_2_GENERICA" + utilidades.Fechas.formatDateForFile(new Date()) + ".txt";

        if (numeroComercio.equals(Codigos.ID_GASEBA)) { //gaseba
            //DEB-AUT-REMESAS-28428801005-20140505.lst.0430.RPC
            String aux = fechaEntecad.toString();
            aux = utilidades.DebitoAutomatico.ajustarCampoNum(aux, 8);
            result = "DEB-AUT-REMESAS-" + aux.substring(4, 8) + aux.substring(2, 4) + aux.substring(0, 2) + ".lst." + aux.substring(2, 4) + aux.substring(0, 2) + ".RPC";
        } else if (numeroComercio.equals(Codigos.ID_OSE)) { //ose
            //BANCODEB-nnnnnnnnnnn-505-yyyymmdd.mmdd ( nnnnnnnnnnn = nro de comercio cabal / yyyymmdd = fecha vencimiento / mmdd = mes/dia de generación
            String aux = fechaEntecad.toString();
            aux = utilidades.DebitoAutomatico.ajustarCampoNum(aux, 8);
            result = "DEB-AUT-REMESAS-" + aux.substring(4, 8) + "-" + aux.substring(2, 4) + "-" + aux.substring(0, 2) + ".RPC";
        } else if (numeroComercio.equals(Codigos.ID_UTE) || numeroComercio.equals(Codigos.ID_ANTEL) || numeroComercio.equals(Codigos.ID_ANCEL)) { //ute
            String aux = fechaEntecad.toString();
            aux = utilidades.DebitoAutomatico.ajustarCampoNum(aux, 8);
            result = "DEB-AUT-REMESAS-" + numeroComercio + "-20" + utilidades.Fechas.formatDateyyMMdd(fechaProc) + ".lst." + aux.substring(2, 4) + aux.substring(0, 2) + ".RPC";
        } else if (numeroComercio.equals(Codigos.ID_UTE) || numeroComercio.equals(Codigos.ID_CPU_APORTES) || numeroComercio.equals(Codigos.ID_CPU_PRESTAMOS_DOLARES)) { //ute
            String aux = fechaEntecad.toString();
            aux = utilidades.DebitoAutomatico.ajustarCampoNum(aux, 8);
            result = "DEB-AUT-REMESAS-" + numeroComercio + "-20" + utilidades.Fechas.formatDateyyMMdd(fechaProc) + ".lst." + aux.substring(2, 4) + aux.substring(0, 2) + ".RPC";
        } else if (numeroComercio.equals(Codigos.ID_BSE_PESOS)) { //bse pesos
            result = utilidades.DebitoAutomatico.getNombreDescarga(Codigos.ID_BSE_PESOS, 2) + ".txt";
        } else if (numeroComercio.equals(Codigos.ID_BSE_DOLARES)) { //bse dolares
            result = utilidades.DebitoAutomatico.getNombreDescarga(Codigos.ID_BSE_DOLARES, 2) + ".txt";
        } else if (numeroComercio.equals(Codigos.ID_ANCEL)) { //ancel
            result = "Entecad Cabal " + utilidades.Fechas.getMesTexto(fechaProc) + " " + fechaProc.toString().substring(fechaProc.toString().length() - 2, fechaProc.toString().length());
        } else if (numeroComercio.equals(Codigos.ID_ANTEL)) { //antel
            result = "Entecad Cabal " + utilidades.Fechas.getMesTexto(fechaProc) + " " + fechaProc.toString().substring(fechaProc.toString().length() - 2, fechaProc.toString().length());
        } else if (numeroComercio.equals(Codigos.ID_IM_DURAZNO_CONT_RURAL)) {
            result = "DEB-AUT-REMESAS-IM_DURAZNO_CONT_RURAL-" + fechaEntecad + "-" + numeroComercio + ".txt";
        } else if (numeroComercio.equals(Codigos.ID_IM_DURAZNO_CONT_URBANA)) {
            result = "DEB-AUT-REMESAS-IM_DURAZNO_CONT_URBANA-" + fechaEntecad + "-" + numeroComercio + ".txt";
        } else if (numeroComercio.equals(Codigos.ID_PRIMARIA)) {
            result = "DEB-AUT-REMESAS-PRIMARIA-" + fechaEntecad + "-" + numeroComercio + ".txt";
        } else if (isSucive(numeroComercio)) {
            result = "922_" + utilidades.Fechas.formatDateAAAAmmdd(new Date()) + ".txt";
        }

        return result;

    }

    public static String descargarPadron(String numeroComercio) throws Exception {

        String nombreArchivo = "NoSeHaAsignadoNombre" + utilidades.Fechas.formatDateForFile(new Date());

        if (numeroComercio.equals(utilidades.Codigos.ID_IM_PAYSANDU_CONT_URBANA)) {
            nombreArchivo = "parEimpar.txt";
        }else if (numeroComercio.equals(utilidades.Codigos.ID_OSE)) {
            nombreArchivo = "505BANCOAB";
        } else if (numeroComercio.equals(utilidades.Codigos.ID_BSE_DOLARES)) {
            nombreArchivo = "503BANCOAB_DOLARES";
        } else if (numeroComercio.equals(utilidades.Codigos.ID_BSE_PESOS)) {
            nombreArchivo = "503BANCOAB_PESOS";
        } else if (numeroComercio.equals(utilidades.Codigos.ID_UTE)) {
            nombreArchivo = "270BANCOAB";
        } else if (numeroComercio.equals(utilidades.Codigos.ID_GASEBA)) {
            nombreArchivo = "280BANCOAB";
        } else if (numeroComercio.equals(utilidades.Codigos.ID_ANCEL)) {
            nombreArchivo = "Ancel.txt";
        } else if (numeroComercio.equals(utilidades.Codigos.ID_ANTEL)) {
            nombreArchivo = "Antel.txt";
        } else if (numeroComercio.equals(utilidades.Codigos.ID_CPU_APORTES)) {
            nombreArchivo = "CpuAportes";
        } else if (numeroComercio.equals(utilidades.Codigos.ID_CPU_PRESTAMOS_DOLARES)) {
            nombreArchivo = "CpuPrestamosDolares";
        } else if (numeroComercio.equals(utilidades.Codigos.ID_IM_MONTEVIDEO_TRIBUTOS_DOMICILIARIOS) || numeroComercio.equals(utilidades.Codigos.ID_IM_MONTEVIDEO_CONTRIBUCION) || numeroComercio.equals(utilidades.Codigos.ID_IM_MONTEVIDEO_TASA_SANEAMIENTO)) {
            nombreArchivo = "cuentas.txt";
        }else if (numeroComercio.equals(utilidades.Codigos.ID_IM_MALDONADO_CONT_RURAL_Y_URBANA)) {
            nombreArchivo = "URBANA_Y_RURAL.zip";
        }else if (numeroComercio.equals(Codigos.ID_IM_DURAZNO_CONT_RURAL)) {
            nombreArchivo = "AB-IM_DURAZNO_CONT_RURAL-" + utilidades.Fechas.formatDateddMMyyyy(new Date()).replaceAll("/", "-") + ".txt";
        } else if (numeroComercio.equals(Codigos.ID_IM_DURAZNO_CONT_URBANA)) {
            nombreArchivo = "AB-IM_DURAZNO_CONT_URBANA-" + utilidades.Fechas.formatDateddMMyyyy(new Date()).replaceAll("/", "-") + ".txt";
        }else if (numeroComercio.equals(Codigos.ID_IM_FLORIDA_CONT_RURAL)) {
            nombreArchivo = "AB-IM_FLORIDA_CONT_RURAL-" + utilidades.Fechas.formatDateddMMyyyy(new Date()).replaceAll("/", "-") + ".txt";
        } else if (numeroComercio.equals(Codigos.ID_IM_FLORIDA_CONT_URBANA)) {
            nombreArchivo = "AB-IM_FLORIDA_CONT_URBANA-" + utilidades.Fechas.formatDateddMMyyyy(new Date()).replaceAll("/", "-") + ".txt";
        }else if (numeroComercio.equals(Codigos.ID_IM_SALTO_CONT_RURAL)) { //antel
            nombreArchivo = "SaltoRURAL.xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_SALTO_CONT_URBANA)) { //antel
            nombreArchivo = "SaltoURBANA.xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_FLORES_CONT_RURAL)) { //antel
            nombreArchivo = "FloresRURAL.xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_FLORES_CONT_URBANA)) { //antel
            nombreArchivo = "FloresURBANA.xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_FLORES_CONT_RURAL)) { //antel
            nombreArchivo = "FloresRURAL.xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_FLORES_CONT_URBANA)) { //antel
            nombreArchivo = "FloresURBANA.xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_RIVERA_CONT_RURAL)) { //antel
            nombreArchivo = "RiveraRURAL.xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_RIVERA_CONT_URBANA)) { //antel
            nombreArchivo = "RiveraURBANA.xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_SALTO_CONT_RURAL)) { //antel
            nombreArchivo = "SaltoRURAL.xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_SALTO_CONT_URBANA)) { //antel
            nombreArchivo = "SaltoURBANA.xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_SAN_JOSE_CONT_RURAL)) { //antel
            nombreArchivo = "SanJoseRURAL.xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_SAN_JOSE_CONT_URBANA)) { //antel
            nombreArchivo = "SanJoseURBANA.xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_SORIANO_CONT_RURAL)) { //antel
            nombreArchivo = "SorianoRURAL.xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_SORIANO_CONT_URBANA)) { //antel
            nombreArchivo = "SorianoURBANA.xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_TACUAREMBO_CONT_RURAL)) { //antel
            nombreArchivo = "TacuaremoboRURAL.xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_TACUAREMBO_CONT_URBANA)) { //antel
            nombreArchivo = "TacuaremboURBANA.xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_ARTIGAS_CONT_RURAL)) { //antel
            nombreArchivo = "ArtigasRURAL.xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_ARTIGAS_CONT_URBANA)) { //antel
            nombreArchivo = "ArtigasURBANA.xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_CANELONES_CONT_URBANA)) { //antel
            nombreArchivo = "CanelonesURBANA.xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_CANELONES_CONT_RURAL)) { //antel
            nombreArchivo = "CanelonesRURAL.xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_COLONIA_CONT_URBANA)) { //antel
            nombreArchivo = "ColoniaURBANA-"+utilidades.Fechas.formatDateForFile(new Date())+".xls";
        }else if (numeroComercio.equals(Codigos.ID_IM_COLONIA_CONT_RURAL)) { //antel
            nombreArchivo = "ColoniaRURAL-"+utilidades.Fechas.formatDateForFile(new Date())+".xls";
        }
        return nombreArchivo;
    }

    public static String getUrlSource(String url) {
        StringBuilder a = new StringBuilder();
        try{
        URL yahoo = new URL(url);
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream(), "UTF-8"));
        String inputLine;
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        while ((inputLine = in.readLine()) != null) {
            a.append(inputLine);
            System.out.println(inputLine);            
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");        
        in.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        //return a.toString();
        return a.toString().replaceAll(".*?</pre>", "");
    }

    // HTTP POST request
    public static String getUrlSourcePost(String url, String urlParameters) throws Exception {

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("POST");
        
        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
//        System.out.println("\nSending 'POST' request to URL : " + url);
//        System.out.println("Post parameters : " + urlParameters);
//        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println("##########################################");
        System.out.println("##########################################");
        System.out.println("##########################################");
        System.out.println(">>>>>>>>>"+response.toString());
        System.out.println("##########################################");
        System.out.println(">>>>>>>>>"+response.toString().replaceAll(".*?</pre>", ""));
        System.out.println("##########################################");
        System.out.println("##########################################");
        System.out.println("##########################################");        
        
        return response.toString().replaceAll(".*?</pre>", "");
    }
    
    public static  boolean isIntendenciaMunicipalPromo2017(String getDrpSucursalSelectedComercio) {
        //Salto, Paysandú, Rivera, Tacuarembo, Durazno, Soriano, Colonia, San José, Flores, Florida, Canelones, Montevideo, Maldonado.
        return  getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_SALTO_CONT_RURAL) || getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_SALTO_CONT_URBANA) ||
                getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_PAYSANDU_CONT_RURAL) || getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_PAYSANDU_CONT_URBANA) ||
                getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_RIVERA_CONT_RURAL) || getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_RIVERA_CONT_URBANA) ||
                getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_TACUAREMBO_CONT_RURAL) || getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_TACUAREMBO_CONT_URBANA) ||
                getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_DURAZNO_CONT_RURAL) || getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_DURAZNO_CONT_URBANA) ||
                getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_SORIANO_CONT_RURAL) || getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_SORIANO_CONT_URBANA) ||
                getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_SAN_JOSE_CONT_RURAL) || getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_SAN_JOSE_CONT_URBANA) ||
                getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_FLORES_CONT_RURAL) || getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_FLORES_CONT_URBANA) ||
                getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_FLORIDA_CONT_RURAL) || getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_FLORIDA_CONT_URBANA) ||
                getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_CANELONES_CONT_RURAL) || getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_CANELONES_CONT_URBANA) ||
                getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_ARTIGAS_CONT_RURAL) || getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_ARTIGAS_CONT_URBANA) ||
                getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_COLONIA_CONT_RURAL) || getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_COLONIA_CONT_URBANA) ||
                getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_MONTEVIDEO_CONTRIBUCION) ||                
                getDrpSucursalSelectedComercio.equals(utilidades.Codigos.ID_IM_MALDONADO_CONT_RURAL_Y_URBANA);
    }       

    public static boolean aplicaPromo(String nComercio, String cuotas) {
        boolean result = false;
        
        if(cuotas == null){
            return false;
        }
        
        if(nComercio.equals(utilidades.Codigos.ID_IM_PAYSANDU_CONT_RURAL) || nComercio.equals(utilidades.Codigos.ID_IM_PAYSANDU_CONT_URBANA) ){
            if(cuotas.equals("2")){
                result = true;
            }
        }           
        
        if(nComercio.equals(utilidades.Codigos.ID_IM_MALDONADO_CONT_RURAL_Y_URBANA)){
            result = true;
        }
        
        if(nComercio.equals(utilidades.Codigos.ID_IM_CANELONES_CONT_RURAL) || nComercio.equals(utilidades.Codigos.ID_IM_CANELONES_CONT_URBANA) ){
            if(cuotas.equals("1")){
                result = true;
            }
        }
        
        if(
            nComercio.equals(utilidades.Codigos.ID_IM_ARTIGAS_CONT_RURAL) || nComercio.equals(utilidades.Codigos.ID_IM_ARTIGAS_CONT_URBANA) || 
            nComercio.equals(utilidades.Codigos.ID_IM_DURAZNO_CONT_RURAL) || nComercio.equals(utilidades.Codigos.ID_IM_DURAZNO_CONT_URBANA) || 
            nComercio.equals(utilidades.Codigos.ID_IM_FLORES_CONT_RURAL) || nComercio.equals(utilidades.Codigos.ID_IM_FLORES_CONT_URBANA) || 
            nComercio.equals(utilidades.Codigos.ID_IM_FLORIDA_CONT_RURAL) || nComercio.equals(utilidades.Codigos.ID_IM_FLORIDA_CONT_URBANA) || 
            nComercio.equals(utilidades.Codigos.ID_IM_RIVERA_CONT_RURAL) || nComercio.equals(utilidades.Codigos.ID_IM_RIVERA_CONT_URBANA) || 
            nComercio.equals(utilidades.Codigos.ID_IM_SALTO_CONT_RURAL) || nComercio.equals(utilidades.Codigos.ID_IM_SALTO_CONT_URBANA) ||
            nComercio.equals(utilidades.Codigos.ID_IM_SAN_JOSE_CONT_RURAL) || nComercio.equals(utilidades.Codigos.ID_IM_SAN_JOSE_CONT_URBANA) ||
            nComercio.equals(utilidades.Codigos.ID_IM_SORIANO_CONT_RURAL) || nComercio.equals(utilidades.Codigos.ID_IM_SORIANO_CONT_URBANA) ||
            nComercio.equals(utilidades.Codigos.ID_IM_TACUAREMBO_CONT_RURAL) || nComercio.equals(utilidades.Codigos.ID_IM_TACUAREMBO_CONT_URBANA) ||
            nComercio.equals(utilidades.Codigos.ID_IM_COLONIA_CONT_RURAL) || nComercio.equals(utilidades.Codigos.ID_IM_COLONIA_CONT_URBANA)
                ){
            if(cuotas.equals("0")){
                result = true;
            }
        }
        
        return result;
    }
    
    public static String getNombreComercio(String numeroComercio) {
        String result = "";
        if (numeroComercio.equals(utilidades.Codigos.ID_GASEBA)) {
            result = "GASEBA";
        }else if (numeroComercio.equals(utilidades.Codigos.ID_OSE)) {
            result = "OSE";
        }else if (numeroComercio.equals(utilidades.Codigos.ID_UTE)) {
            result = "UTE";
        }else if (utilidades.DebitoAutomatico.isSucive(numeroComercio)) {
            result = "SUCIVE";
        }else if (numeroComercio.equals(utilidades.Codigos.ID_ANCEL)) {
            result = "ANCEL";
        }else if (numeroComercio.equals(utilidades.Codigos.ID_ANTEL)) {
            result = "ANTEL";
        }else if (numeroComercio.equals(utilidades.Codigos.ID_BSE_DOLARES) || numeroComercio.equals(utilidades.Codigos.ID_BSE_PESOS)) {
            result = "Banco de Seguros";
        }else if (numeroComercio.equals(utilidades.Codigos.ID_CPU_APORTES) || numeroComercio.equals(utilidades.Codigos.ID_CPU_PRESTAMOS_DOLARES)) {
            result = "C.P.U.";
        }else if (numeroComercio.equals(utilidades.Codigos.ID_PRIMARIA)) {
            result = "PRIMARIA";
        }else if(numeroComercio.equals(utilidades.Codigos.ID_STM)){
            result = "STM";
        }
        return result;
    }
}
