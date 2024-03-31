/**
 * Excepci�n que informa que el paciente que se va a agregar ya est� registrado en la central
 */
public class YaExisteException extends Exception {
    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor de la excepci�n con el c�digo del paciente
     */
    public YaExisteException(int codigo) {
        // Llama al constructor de la clase base (Exception) con un mensaje personalizado
        // que indica que el paciente con el c�digo especificado ya est� registrado.
        super("El paciente con c�digo " + codigo + " ya est� registrado");
    }
}
