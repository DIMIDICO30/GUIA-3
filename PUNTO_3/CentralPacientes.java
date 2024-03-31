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
     * Número de pacientes en la central
     */
    private int numPacientes;

    /**
     * Vector de clínicas manejadas por la central
     */
    private ArrayList<String> listaClinicas;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea una nueva central sin pacientes y con una lista predefinida de clínicas
     */
    public CentralPacientes() {
        // Al iniciar la central, no hay pacientes ni clínicas registradas
        primero = null;
        numPacientes = 0;

        // Se crea una lista de clínicas predefinidas
        listaClinicas = new ArrayList<>();
        listaClinicas.add("Clínica del Country");
        listaClinicas.add("Clínica Palermo");
        listaClinicas.add("Clínica Reina Sofía");
        listaClinicas.add("Clínica El Bosque");
        listaClinicas.add("Clínica San Ignacio");
        listaClinicas.add("Otra");
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Retorna el número de pacientes de la clínica
     *
     * @return El número de pacientes de la clínica
     */
    public int darNumeroPacientes() {
        return numPacientes;
    }

    /**
     * Adiciona un paciente al principio de la lista
     *
     * @param pac El paciente a ser agregado al comienzo de la lista
     *            pac!=null y no existe un paciente con código igual a pac.codigo
     */
    public void agregarPacienteAlComienzo(Paciente pac) {
        // Si no hay ningún paciente registrado, el nuevo paciente se convierte en el primero
        if (primero == null) {
            primero = pac;
        } else {
            // Si ya hay pacientes registrados, se añade el nuevo paciente al principio de la lista
            pac.cambiarSiguiente(primero);
            primero = pac;
        }
        numPacientes++; // Se incrementa el contador de pacientes
    }

    /**
     * Adiciona un paciente al final de la lista. Si la lista está vacía, el paciente queda de primero.
     *
     * @param pac El paciente a ser agregado al final de la lista
     *            pac!=null y no existe un paciente con código igual a pac.codigo
     */
    public void agregarPacienteAlFinal(Paciente pac) {
        if (primero == null) {
            // Si no hay ningún paciente registrado, el nuevo paciente se convierte en el primero
            primero = pac;
        } else {
            // Si ya hay pacientes registrados, se añade el nuevo paciente al final de la lista
            // Buscamos el último paciente y lo enlazamos con el nuevo paciente
            Paciente ultimo = localizarUltimo();
            ultimo.insertarDespues(pac);
        }
        numPacientes++; // Se incrementa el contador de pacientes
    }

}
