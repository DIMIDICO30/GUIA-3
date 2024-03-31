/**
 * Excepci�n generada cuando un paciente con un c�digo dado no existe
 */
public class NoExisteException extends Exception {
    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor de la excepci�n con el c�digo del paciente
     *
     * @param codigo C�digo del paciente que no est� registrado en la central
     */
    public NoExisteException(int codigo) {
        // Llama al constructor de la clase base (Exception) con un mensaje personalizado
        // que indica que el paciente con el c�digo especificado no est� registrado.
        super("El paciente con c�digo " + codigo + " no est� registrado");
    }
}
