/**
 * Excepción que informa que el paciente que se va a agregar ya está registrado en la central
 */
public class YaExisteException extends Exception {
    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor de la excepción con el código del paciente
     */
    public YaExisteException(int codigo) {
        // Llama al constructor de la clase base (Exception) con un mensaje personalizado
        // que indica que el paciente con el código especificado ya está registrado.
        super("El paciente con código " + codigo + " ya está registrado");
    }
}
