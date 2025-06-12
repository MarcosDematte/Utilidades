/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author masis
 */
public class CodigosResultados {

    public static final long CODIGO_OK = 0;
    public static final String DESCRIPCION_OK = "Ok";
    public static final long CODIGO_ERROR_DOCUMENTO_INVALIDO = 1;
    public static final String DESCRIPCION_ERROR_DOCUMENTO_INVALIDO = "Documento inválido";
    public static final long CODIGO_ERROR_DOCUMENTO_YA_REGISTRADO = 2;
    public static final String DESCRIPCION_ERROR_DOCUMENTO_YA_REGISTRADO = "El documento ya está registrado en el sistema";
    public static final long CODIGO_ERROR_TIPO_DOCUMENTO_INVALIDO = 3;
    public static final String DESCRIPCION_ERROR_TIPO_DOCUMENTO_INVALIDO = "Tipo de documento inválido";
    public static final long CODIGO_ERROR_APELLIDO_VACIO = 4;
    public static final String DESCRIPCION_ERROR_APELLIDO_VACIO = "El apellido no puede ser vacío";
    public static final long CODIGO_ERROR_NOMBRE_VACIO = 5;
    public static final String DESCRIPCION_ERROR_NOMBRE_VACIO = "El nombre no puede ser vacío";
    public static final long CODIGO_ERROR_USUARIO_CONTRASENIA_INCORRECTO = 6;
    public static final String DESCRIPCION_ERROR_USUARIO_CONTRASENIA_INCORRECTO = "Usuario y/o contraseña incorrectos";
    public static final long CODIGO_ERROR_NO_EXISTE_PERSONA = 7;
    public static final String DESCRIPCION_ERROR_NO_EXISTE_PERSONA = "No existe la persona";
    public static final long CODIGO_ERROR_NO_EXISTE_TARJETA = 8;
    public static final String DESCRIPCION_ERROR_NO_EXISTE_TARJETA = "No existe la tarjeta";
    public static final long CODIGO_ERROR_TARJETA_INCORRECTA = 9;
    public static final String DESCRIPCION_ERROR_TARJETA_INCORRECTA = "Tarjeta incorrecta";
    public static final long CODIGO_ERROR_TARJETA_NO_OPERATIVA = 10;
    public static final String DESCRIPCION_ERROR_TARJETA_NO_OPERATIVA = "La tarjeta no se encuentra operativa";
    public static final long CODIGO_ERROR_CALLE_MAX_LARGO = 11;
    public static final String DESCRIPCION_ERROR_CALLE_MAX_LARGO = "Largo máximo para calle: 50";
    public static final long CODIGO_ERROR_CALLE_VACIO = 12;
    public static final String DESCRIPCION_ERROR_CALLE_VACIO = "Debe ingresar una calle";
    public static final long CODIGO_ERROR_DEPTO_VACIO = 13;
    public static final String DESCRIPCION_ERROR_DEPTO_VACIO = "Debe ingresar un departamento";
    public static final long CODIGO_ERROR_CIUDAD_VACIO = 14;
    public static final String DESCRIPCION_ERROR_CIUDAD_VACIO = "Debe ingresar una ciudad";
    public static final long CODIGO_ERROR_CIUDAD_NO_CORRESPONDE_DEPTO = 15;
    public static final String DESCRIPCION_ERROR_CIUDAD_NO_CORRESPONDE_DEPTO = "La ciudad no corresponde con el departamento";
    public static final long CODIGO_ERROR_TOKEN_CLIENTE = 16;
    public static final String DESCRIPCION_ERROR_TOKEN_CLIENTE = "ID de cliente invalido";    
    public static final long CODIGO_ERROR_YA_TIENE_TOKEN = 17;
    public static final String DESCRIPCION_YA_TIENE_TOKEN = "Cliente ya tiene token";
    public static final long CODIGO_ERROR_TOKEN_ANULADO = 18;
    public static final String DESCRIPCION_ERROR_TOKEN_ANULADO = "ID de cliente ya dado de baja";
    public static final long CODIGO_ERROR_AVISO_VIAJE_EXISTENTE = 19;
    public static final String DESCRIPCION_ERROR_VIAJE_EXISTENTE = "Ya tiene un aviso de viaje para las fechas indicadas";
    public static final long CODIGO_SOLICITUD_DUPLICADA = 20;
    public static final String DESCRIPCION_SOLICITUD_DUPLICADA = "Ya ingresaste esta solicitud anteriormente. Te notificaremos cuando la misma sea gestionada. Si tienes alguna duda puedes escribirnos a registrodedatos@cabal.com.uy";
    public static final long CODIGO_PADRON_DEBITO_DUPLICADO = 21;
    public static final String DESCRIPCION_PADRON_DEBITO_DUPLICADO = "Ya existe un débito automático para los datos ingresados. ";
    public static final long CODIGO_PADRON_O_MATRICULA_NO_VALIDOS = 22;
    public static final String DESCRIPCION_PADRON_O_MATRICULA_NO_VALIDOS = "Padrón y/o mátricula inválidos.";
    public static final long CODIGO_ERROR_OTRO = 99;
    public static final String DESCRIPCION_ERROR_OTRO = "Error desconocido";
    public static final String DESCRIPCION_MAIL_REGISTRO_DE_DATOS = "Si tienes alguna duda puedes escribirnos a registrodedatos@cabal.com.uy";
    public static final String DESCRIPCION_MAIL_SUCIVE = "Si tienes alguna duda puedes escribirnos a sucive@cabal.com.uy";
    public static final String KEY_USUARIO = "usuario";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_DATOS = "datos";
    public static final String KEY_TOKEN_CLIENTE = "tokenCliente";
    public static final String KEY_NUMERO_CUENTA = "numeroCuenta";
    public static final String KEY_ULT_4_TARJ = "ult4tarj";
    public static final String KEY_TARJETA = "tarjeta";
    public static final String KEY_FECHA_VENCIMIENTO = "fechaVencimiento";
    public static final String KEY_CVV = "cvv";
    public static final String KEY_PERIODO = "periodo";
    public static final String KEY_COD_RESULTADO = "codResultado";
    public static final String KEY_DESC_RESULTADO = "descResultado";
    public static final String KEY_IS_NUMERO_CUENTA_TITULAR = "isNumeroCuentaTitular";
    public static final String KEY_DOCUMENTO = "documento";
    public static final String KEY_TIPO_DOCUMENTO = "tipoDocumento";
    public static final String KEY_PARAMETROS = "parametros";
    public static final String KEY_TOKEN_DISPOSITIVO = "tokenDispositivo";
    public static final String KEY_EVENTO = "evento";
    public static final String KEY_DURACION = "duracion";
    
}
