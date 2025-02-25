/**
 * Esta clase representa un paciente del hospital
 */
public class Paciente {
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Constante para representar a un Hombre
     */
    public final static int HOMBRE = 1;

    /**
     * Constante para representar a una mujer
     */
    public final static int MUJER = 2;

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * El c�digo del paciente
     */
    private int codigo;

    /**
     * El nombre del paciente
     */
    private String nombre;

    /**
     * Cl�nica a la que asiste el paciente
     */
    private String clinica;

    /**
     * La informaci�n m�dica del paciente
     */
    private String informacionMedica;

    /**
     * Sexo del paciente
     */
    private int sexo;

    /**
     * El siguiente paciente de la lista
     */
    private Paciente siguiente;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye un paciente con la informaci�n proporcionada
     */
    public Paciente(int cod, String nom, String clin, String infoMed, int sex) {
        codigo = cod;
        nombre = nom;
        clinica = clin;
        informacionMedica = infoMed;
        sexo = sex;
        siguiente = null; // Al crear un nuevo paciente, no tiene un siguiente paciente
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna el c�digo del paciente
     */
    public int darCodigo() {
        return codigo;
    }

    /**
     * Retorna el nombre del paciente
     */
    public String darNombre() {
        return nombre;
    }

    /**
     * Retorna la cl�nica asignada al paciente
     */
    public String darClinica() {
        return clinica;
    }

    /**
     * Retorna la informaci�n m�dica del paciente
     */
    public String darInformacionMedica() {
        return informacionMedica;
    }

    /**
     * Retorna el sexo del paciente
     */
    public int darSexo() {
        return sexo;
    }

    /**
     * Retorna el siguiente paciente de la lista
     */
    public Paciente darSiguiente() {
        return siguiente;
    }

    /**
     * Cambia el paciente que le sigue al actual
     */
    public void cambiarSiguiente(Paciente pac) {
        siguiente = pac;
    }

    /**
     * Desconecta el paciente que le sigue en la lista al paciente actual
     */
    public void desconectarSiguiente() {
        siguiente = siguiente.siguiente;
    }

    /**
     * Inserta el paciente despu�s del actual en la lista
     */
    public void insertarDespues(Paciente pac) {
        pac.siguiente = siguiente;
        siguiente = pac;
    }

    /**
     * Retorna una representaci�n en cadena de la informaci�n del paciente
     */
    public String toString() {
        return "[ " + codigo + " ]: " + nombre;
    }

    /**
     * Cambia la informaci�n m�dica del paciente
     */
    public void cambiarInformacionMedica(String informacion) {
        informacionMedica = informacion;
    }
}
