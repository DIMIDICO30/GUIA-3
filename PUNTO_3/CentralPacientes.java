/**
 * Esta clase representa una central en la que se maneja una lista de pacientes
 */
public class CentralPacientes {
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Primer paciente de la lista
     */
    private Paciente primero;

    /**
     * N�mero de pacientes en la central
     */
    private int numPacientes;

    /**
     * Vector de cl�nicas manejadas por la central
     */
    private ArrayList<String> listaClinicas;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea una nueva central sin pacientes y con una lista predefinida de cl�nicas
     */
    public CentralPacientes() {
        // Al iniciar la central, no hay pacientes ni cl�nicas registradas
        primero = null;
        numPacientes = 0;

        // Se crea una lista de cl�nicas predefinidas
        listaClinicas = new ArrayList<>();
        listaClinicas.add("Cl�nica del Country");
        listaClinicas.add("Cl�nica Palermo");
        listaClinicas.add("Cl�nica Reina Sof�a");
        listaClinicas.add("Cl�nica El Bosque");
        listaClinicas.add("Cl�nica San Ignacio");
        listaClinicas.add("Otra");
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna el n�mero de pacientes de la cl�nica
     *
     * @return El n�mero de pacientes de la cl�nica
     */
    public int darNumeroPacientes() {
        return numPacientes;
    }

    /**
     * Adiciona un paciente al principio de la lista
     *
     * @param pac El paciente a ser agregado al comienzo de la lista
     *            pac!=null y no existe un paciente con c�digo igual a pac.codigo
     */
    public void agregarPacienteAlComienzo(Paciente pac) {
        // Si no hay ning�n paciente registrado, el nuevo paciente se convierte en el primero
        if (primero == null) {
            primero = pac;
        } else {
            // Si ya hay pacientes registrados, se a�ade el nuevo paciente al principio de la lista
            pac.cambiarSiguiente(primero);
            primero = pac;
        }
        numPacientes++; // Se incrementa el contador de pacientes
    }

    /**
     * Adiciona un paciente al final de la lista. Si la lista est� vac�a, el paciente queda de primero.
     *
     * @param pac El paciente a ser agregado al final de la lista
     *            pac!=null y no existe un paciente con c�digo igual a pac.codigo
     */
    public void agregarPacienteAlFinal(Paciente pac) {
        if (primero == null) {
            // Si no hay ning�n paciente registrado, el nuevo paciente se convierte en el primero
            primero = pac;
        } else {
            // Si ya hay pacientes registrados, se a�ade el nuevo paciente al final de la lista
            // Buscamos el �ltimo paciente y lo enlazamos con el nuevo paciente
            Paciente ultimo = localizarUltimo();
            ultimo.insertarDespues(pac);
        }
        numPacientes++; // Se incrementa el contador de pacientes
    }

}
