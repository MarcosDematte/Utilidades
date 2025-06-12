/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.math.BigDecimal;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.BigDecimalConverter;
import org.apache.commons.beanutils.converters.DateConverter;


/**
 *
 * @author masis
 */
public class CopyProp {

    public static void copyTo(Object destino, Object origen) {
        try {
            java.util.Date defaultValue = null;
            BigDecimal defaultBigDec = null;
            BigDecimalConverter bigDConverter = new BigDecimalConverter(defaultBigDec);
            DateConverter converter = new DateConverter(defaultValue);
            ConvertUtils.register(converter, java.util.Date.class);
            ConvertUtils.register(bigDConverter, BigDecimal.class);
            if (origen != null && destino != null) {
                BeanUtils.copyProperties(destino, origen);
            }
            //BeanUtils.copyProperties(destino, origen);
        } catch (Exception ex) {
            Logger.Log(ex);
        }
    }
}
