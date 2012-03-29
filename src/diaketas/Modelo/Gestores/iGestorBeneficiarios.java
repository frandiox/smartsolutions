/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.Modelo.Gestores;

import diaketas.Modelo.ONG.Beneficiario;
import diaketas.Modelo.ONG.Familiar;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kesada
 */
public interface iGestorBeneficiarios {
    
    /*
     * Crea un nuevo beneficiario en el sistema, lo registra en el sistema y 
     * registra la operacion
     */
    public void confirmarAltaBeneficiario();
    
    /*
     * Elimina un beneficiario del sistema y registra la operacion
     */
    public void confirmarBajaBeneficiario();
    
    /*
     * Elimina la relación de parentesco entre un familiar y un beneficiario
     * El familiar sigue perteneciendo al sistema
     */
    public void confirmarEliminacion();
    
    /*
     * Introduce un nuevo familiar al Beneficiario
     */
    public void confirmarInsercion();
    
    /*
     * Modifica los datos de un beneficiario y registra la operacion en el sistema
     */
    public void confirmarModificacionBeneficiario();
    
    /*
     * Devuelve los datos de un beneficiario para su posterior consulta
     */
    public Beneficiario consultarBeneficiario(String dniBeneficiario);
    
    /*
     * Devuelve un ArrayList, donde el primer objeto es de tipo familiar y
     * el segundo objeto es de tipo Parentesco
     */
    public Familiar consultarFamiliar(String Nombre_Apellidos);

    /*
     * Devuelve el listado de familiares de un beneficiario
     */
    public ArrayList<Familiar> iniciarConsultarFamiliar();
    
    /*
     * Devuelve el listado de familiares de un beneficiario
     */
    public ArrayList<Familiar> inicioModificarFamiliar();
    
    /*
     * Modifica los datos de un beneficiario
     * Devuelve un boolean indicando si se ha encontrado el DNI del voluntario 
     * que va a realizar la modificación
     */
    public boolean introducirDatosBeneficiario(String NIF_CIF, String Nombre,
            String Apellidos, Date FechaNac, String Localidad, int Activo, Date Fecha_Desac,
            String Email, int Telefono, String Nacionalidad,
            String Estado_civil, String Domicilio, int Codigo_Postal,
            Date Fecha_Inscripcion, int Expediente, String Motivo,
            Double Precio_Vivienda, String Tipo_Vivienda, String Observaciones_Datos_Personales,
            String Observaciones_Familiares, String Observaciones_Vivienda,
            String Ciudad_Nacimiento, String Situacion_Economica, String Nivel_Estudios,
            String Profesion, String Experiencia_Laboral, String NIF_Vol);
    
    /*
     * Introduce los datos de un nuevo familiar del beneficiario
     */
    public void introducirDatosFamiliar(String Nombre_Apellidos, Date Fecha_Nac,
            String Parentesco, String Ocupacion);
    
    /*
     * Modifica los datos de un familiar ya existente
     */
    public void modificarDatosFamiliar (String Nombre_Apellidos,
            Familiar nuevosDatosFamiliar, String parentesco);
}