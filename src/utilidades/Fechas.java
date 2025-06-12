/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import static java.util.Calendar.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author masis
 */
public class Fechas {

    public static Date getFechaSistema() {
        return new Date();
    }

    public static String formatDateForQuery(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return " to_date(" + sdf.format(date) + ",'dd/MM/yyyy') ";
    }

    public static String formatDateBD(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(date);
    }
    
    public static String formatDateForFile(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
        return sdf.format(date);
    }

    public static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(date);
    }

    public static String formatDateyyMMdd(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        return sdf.format(date);
    }

    public static String formatDateddMMyyyy(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }

    public static String formatDateddMMyy(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        return sdf.format(date);
    }

    public static String formatDateAAmmdd(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        return sdf.format(date);
    }

    public static String formatDateAAAAmmdd(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(date);
    }
    
    public static String formatDateAAAA_mm_dd(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
    
    public static String formatDateAAmm(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyMM");
        return sdf.format(date);
    }
    
    public static String formatDateMMdd(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MMdd");
        return sdf.format(date);
    }

    public static String formatDateHHmmss(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
        return sdf.format(date);
    }

    public static String formatDateHH_mm_ss(java.util.Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(date);
    }

    public static String formatDateddMMyyyyHHmm(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyHHmm");
        return sdf.format(date);
    }

    public static String formatDateddMMyyHHmm(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyHHmm");
        if(date != null){
            return sdf.format(date);
        }else{
            return null;
        }
    }

    public static String formatDateddMMyyHH(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyHH");
        return sdf.format(date);
    }
    
    public static String formatDateMMyyyy(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MMyyyy");
        return sdf.format(date);
    }
    
    public static String formatDateddMMyyyy_HH_mm(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        if (date != null) {
            return sdf.format(date);
        } else {
            return null;
        }
    }

    public static String formatDateddMMyyyy_HH_mm_ss(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(date);
    }

    //devuelve null si el formato ingresado no es DD/MM/YYYY
    public static Date StringDDMMYYYYToDate(String fecha) {
        
        String[] aux = fecha.split("/");
        
        if(aux.length != 3 && aux[0].length() > 2 && aux[0].length() < 1 && aux[1].length() > 2 && aux[1].length() < 1 && aux[2].length() != 4){
            return null;
        }
       
        Calendar c = Calendar.getInstance();
        c.set(Integer.valueOf(aux[2]), Integer.valueOf(aux[1])-1, Integer.valueOf(aux[0]), 0, 0, 0);

        return c.getTime();
    }
    
    /*
     * Suma n dias a la fecha date
     * TODO Agregar consideraciones de dias no laborales
     */
    public static int age(Date birthDate, Date nowDate) {
        // get todays date
        Calendar now = Calendar.getInstance();
        now.setTime(nowDate);
        // get a calendar representing their birth date
        Calendar cal = Calendar.getInstance();
        cal.setTime(birthDate);

        // calculate age as the difference in years.
        int age = now.get(Calendar.YEAR) - cal.get(Calendar.YEAR);

        // now for the tricky bit.
        // set the "birth" calendar to be this year
        // this now represents the date of the birthday THIS year.
        // if that date has not occurred yet, subtract one from age
        cal.set(Calendar.YEAR, now.get(Calendar.YEAR));
        if (now.before(cal)) {
            age = age - 1;
        }
        return age;
    }

    public static Date addToDate(Date date, long n) {

        Date result;

        Calendar cal = java.util.GregorianCalendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, (int) n);

        result = cal.getTime();

        return result;
    }

    public static Date addMonthToDate(Date today, long months) {

        boolean isLastDayOfMonth = false;

        Calendar cal = java.util.GregorianCalendar.getInstance();

        cal.setTime(today);

        if (cal.getActualMaximum(Calendar.DAY_OF_MONTH) == cal.get(Calendar.DATE)) {
            isLastDayOfMonth = true;
        }

        cal.add(Calendar.MONTH, (int) months);

        if (isLastDayOfMonth) {
            cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        }

        return cal.getTime();

    }

    public static Date sameDayNextMonth(Date today) {

        Date result;

        int day;
        int month;
        int year;

        Calendar cal = java.util.GregorianCalendar.getInstance();

        cal.setTime(today);

        day = cal.get(Calendar.DATE);
        month = cal.get(Calendar.MONTH);
        year = cal.get(Calendar.YEAR);

        //cal.add(Calendar.MONTH, 1);

        if (cal.getActualMaximum(Calendar.DAY_OF_MONTH) == 31) {
            if (day > 30 && month > Calendar.JANUARY) {
                result = addToDate(today, 30);
            } else if (day > 28 && month == Calendar.JANUARY) {
                result = addToDate(today, 28);
            } else {
                result = addToDate(today, 31);
            }
        } else if (month == Calendar.FEBRUARY) {
            result = addToDate(today, 28);
        } else {
            result = addToDate(today, 30);
        }

        //result = cal.getTime();

        return result;
    }

    public static double fix(double number, int n) {

        double pos = Math.pow(10, n);

        return (Math.floor(number * pos) / pos);

    }

    public static double round(double number, int n) {

        double pos = Math.pow(10, n);
        double rnd = (new Double("0.5")).doubleValue();

        return ((Math.floor(number * pos + 0.5d)) / pos);

    }

    public static boolean equivalent(double a, double b, double eps) {

        double error = Math.abs(a - b);

        return (error <= eps);

    }

    public static String lPad(
            String cadena, int largo, char chr) {

        if (cadena != null && cadena != "") {
            StringBuffer strPad = new StringBuffer();
            for (int i = 0; i <
                    largo - cadena.length(); i++) {
                strPad.append(chr);
            }

            return strPad.append(cadena).toString();
        } else {
            StringBuffer strPad = new StringBuffer();
            for (int i = 0; i <
                    largo; i++) {
                strPad.append(chr);
            }

            return strPad.toString();
        }

    }

    /*
     * Completa la cadena con el caracter chr al final, hasta llegar a largo
     */
    public static String rPad(
            String cadena, int largo, char chr) {

        if (cadena != null && cadena != "") {
            StringBuffer strPad = new StringBuffer(cadena);
            for (int i = 0; i <
                    largo - cadena.length(); i++) {
                strPad.append(chr);
            }

            return strPad.toString();
        } else {
            StringBuffer strPad = new StringBuffer();
            for (int i = 0; i <
                    largo; i++) {
                strPad.append(chr);
            }

            return strPad.toString();
        }

    }

    public static String emptyIfIsNull(
            String param) {
        if (param == null) {
            return "";
        }

        return param;
    }

    public static Date emptyIfIsNull(
            Date param) {
        if (param == null) {
            try {
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                Date date = df.parse("01/01/1801");
                return date;
            } catch (Exception e) {
            }
            return null;
        }

        return param;
    }

    public static Date trunc(
            Date fecha) {

        Calendar cal = new GregorianCalendar();
        cal.setTime(fecha);

        Calendar cal2 = new GregorianCalendar();
        cal2.clear();
        cal2.set(Calendar.YEAR, cal.get(Calendar.YEAR));
        cal2.set(Calendar.MONTH, cal.get(Calendar.MONTH));
        cal2.set(Calendar.DATE, cal.get(Calendar.DATE));

        return cal2.getTime();
    }

    public static Date fillHour(
            Date fecha) {

        Calendar cal = new GregorianCalendar();
        cal.setTime(fecha);

        Calendar cal2 = new GregorianCalendar();
        cal2.clear();
        cal2.set(Calendar.HOUR_OF_DAY, (int) 23);
        cal2.set(Calendar.MINUTE, (int) 59);
        cal2.set(Calendar.SECOND, (int) 59);

        return cal2.getTime();
    }

    public static String getMesTexto(int mes) {
        Calendar cal = java.util.GregorianCalendar.getInstance();
        cal.setTime(new Date());
        cal.set(2018, mes-1, 1);  
        return getMesTexto(cal.getTime());
    }
    
    public static String getMesTexto(Date fecha) {

        String result = "";

        int month;

        Calendar cal = java.util.GregorianCalendar.getInstance();

        cal.setTime(fecha);

        month = cal.get(Calendar.MONTH);

        switch (month) {
            case 0:
                result = "Enero";
                break;

            case 1:
                result = "Febrero";
                break;

            case 2:
                result = "Marzo";
                break;

            case 3:
                result = "Abril";
                break;

            case 4:
                result = "Mayo";
                break;

            case 5:
                result = "Junio";
                break;

            case 6:
                result = "Julio";
                break;

            case 7:
                result = "Agosto";
                break;

            case 8:
                result = "Setiembre";
                break;

            case 9:
                result = "Octubre";
                break;

            case 10:
                result = "Noviembre";
                break;

            case 11:
                result = "Diciembre";
                break;

        }

        return result;
    }

    public static String getMonthText3CharEngToInt(String mes3Caracteres) {

        String result = "00";

        String month = mes3Caracteres.toUpperCase();

        //["JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"]
        if(month.equals("JAN") || month.equals("ENE")){
            result = "01";
        }
        if(month.equals("FEB")){
            result = "02";
        }
        if(month.equals("MAR")){
            result = "03";
        }
        if(month.equals("APR") || month.equals("ABR")){
            result = "04";
        }
        if(month.equals("MAY")){
            result = "05";
        }
        if(month.equals("JUN")){
            result = "06";
        }
        if(month.equals("JUL")){
            result = "07";
        }
        if(month.equals("AUG") || month.equals("AGO")){
            result = "08";
        }
        if(month.equals("SEP") || month.equals("SET")){
            result = "09";
        }
        if(month.equals("OCT")){
            result = "10";
        }
        if(month.equals("NOV")){
            result = "11";
        }
        if(month.equals("DEC") || month.equals("DIC")){
            result = "12";
        }      

        return result;
    }
    
    
    public static String getMonthFromIntToText3CharEng(String month) {

        String result = "ERR";

        //["JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"]
        if(month.equals("1") || month.equals("01")){
            result = "JAN";
        }
        else if(month.equals("2") || month.equals("02")){
            result = "FEB";
        }
        else  if(month.equals("3") || month.equals("03")){
            result = "MAR";
        }
        else if(month.equals("4") || month.equals("04")){
            result = "APR";
        }
        else if(month.equals("5") || month.equals("05")){
            result = "MAY";
        }
        else if(month.equals("6") || month.equals("06")){
            result = "JUN";
        }
        else if(month.equals("7") || month.equals("07")){
            result = "JUL";
        }
        else if(month.equals("8") || month.equals("08")){
            result = "AUG";
        }
        else if(month.equals("9") || month.equals("09")){
            result = "SEP";
        }
        else if(month.equals("10")){
            result = "OCT";
        }
        else if(month.equals("11")){
            result = "NOV";
        }
        else if(month.equals("12")){
            result = "DEC";
        }      

        return result;
    }
    
    public static String getMesTextoFromNumber(int mes) {
        String result = "";
        int month = mes - 1;

        switch (month) {
            case 0:
                result = "Enero";
                break;

            case 1:
                result = "Febrero";
                break;

            case 2:
                result = "Marzo";
                break;

            case 3:
                result = "Abril";
                break;

            case 4:
                result = "Mayo";
                break;

            case 5:
                result = "Junio";
                break;

            case 6:
                result = "Julio";
                break;

            case 7:
                result = "Agosto";
                break;

            case 8:
                result = "Setiembre";
                break;

            case 9:
                result = "Octubre";
                break;

            case 10:
                result = "Noviembre";
                break;

            case 11:
                result = "Diciembre";
                break;

        }

        return result;
    }
    
    public static int getDiff(Date firstDate, Date secondDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        
        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        return (int) diff;
    }
    
    public static int getDiffBetweenYears(Date first, Date last) {
        Calendar a = getCalendar(first);
        Calendar b = getCalendar(last);
        int diff = b.get(YEAR) - a.get(YEAR);
        if (a.get(MONTH) > b.get(MONTH) || 
            (a.get(MONTH) == b.get(MONTH) && a.get(DATE) > b.get(DATE))) {
            diff--;
        }
        return diff;
    }

    public static Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }
    
    public static long obtenerDiferenciaEntreFechasEnMilisegundos(Date desde, Date hasta){
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.setTime(desde);
        calendar2.setTime(hasta);
        long milliseconds1 = calendar1.getTimeInMillis();
        long milliseconds2 = calendar2.getTimeInMillis();
        long diff = milliseconds2 - milliseconds1;
        return diff;
    }
    
    public static long obtenerDiferenciaEntreFechasEnSegundos(Date desde, Date hasta){
        return obtenerDiferenciaEntreFechasEnMilisegundos(desde, hasta) / 1000;
    }
    
    public static long obtenerDiferenciaEntreFechasEnMinutos(Date desde, Date hasta){
        return obtenerDiferenciaEntreFechasEnMilisegundos(desde, hasta) / (1000 * 60);
    }
    
    public static long obtenerDiferenciaEntreFechasEnHoras(Date desde, Date hasta){
        return obtenerDiferenciaEntreFechasEnMilisegundos(desde, hasta) / (1000 * 60 * 60);
    }
    
    public static long obtenerDiferenciaEntreFechasEnDias(Date desde, Date hasta){
        return obtenerDiferenciaEntreFechasEnMilisegundos(desde, hasta) / (1000 * 60 * 60 * 24);
    }
    
    public static Date getUltimoDiaDelMes(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // Set the calendar to the first day of the next month
        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        // Subtract one day to get the last day of the current month
        calendar.add(Calendar.DAY_OF_MONTH, -1);

        // Return the date
        return calendar.getTime();
    }
    
    public static List<Date> getDatesByDayOfWeek(Date startDate, Date endDate, int dayOfWeek) {
        List<Date> dates = new ArrayList<Date>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        
        if (dayOfWeek < Calendar.SUNDAY || dayOfWeek > Calendar.SATURDAY) {
            throw new IllegalArgumentException("Invalid day of the week");
        }
        
        while (calendar.get(Calendar.DAY_OF_WEEK) != dayOfWeek) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        
        while (!calendar.getTime().after(endDate)) {
            dates.add(calendar.getTime());
            calendar.add(Calendar.DAY_OF_MONTH, 7);
        }

        return dates;
    }
    
    public static String getCoveredDays(List<Date> dates, Date from, Date to) {
        // Map to track all occurrences of each day within the range
        Map<Integer, List<Date>> requiredDays = new HashMap<Integer, List<Date>>();
        for (int i = Calendar.SUNDAY; i <= Calendar.SATURDAY; i++) {
            List<Date> aux = getDatesByDayOfWeek(from, to, i);
            if (!aux.isEmpty()) {
                requiredDays.put(i, aux);
            }
        }
        // Populate required days in the range
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(from);

        while (!calendar.getTime().after(to)) {
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            requiredDays.get(dayOfWeek).add(calendar.getTime());
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }

        // Convert list of dates to a Set for quick lookup
        Set<Long> dateSet = new HashSet<Long>();
        for (Date date : dates) {
            dateSet.add(date.getTime()); // Use milliseconds for comparison
        }

        // Determine fully covered days
        StringBuilder result = new StringBuilder();
        String[] dayNames = {"Domingos", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábados"};

        for (int i = Calendar.SUNDAY; i <= Calendar.SATURDAY; i++) {
            List<Date> occurrences = requiredDays.get(i);
            boolean allCovered = true;

            for (Date d : occurrences) {
                if (!dateSet.contains(d.getTime())) {
                    allCovered = false;
                    break;
                }
            }

            if (allCovered) {
                if (result.length() > 0) {
                    result.append(", ");
                }
                result.append(dayNames[i - 1]);
            }
        }

        // Replace the last ", " with " y "
        int lastCommaIndex = result.lastIndexOf(", ");
        if (lastCommaIndex != -1) {
            result.replace(lastCommaIndex, lastCommaIndex + 2, " y ");
        }
        
        if(result.length() == 0){
            result.append("-");
        }

        return result.toString();
    }
}
