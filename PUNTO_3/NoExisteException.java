/**
 * Excepción generada cuando un paciente con un código dado no existe
 */
public class NoExisteException extends Exception {
    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor de la excepción con el código del paciente
     *
     * @param codigo Código del paciente que no está registrado en la central
     */
    public NoExisteException(int codigo) {
        // Llama al constructor de la clase base (Exception) con un mensaje personalizado
        // que indica que el paciente con el código especificado no está registrado.
        super("El paciente con código " + codigo + " no está registrado");
    }
}
