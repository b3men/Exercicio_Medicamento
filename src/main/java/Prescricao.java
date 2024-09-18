import java.util.ArrayList;

public class Prescricao {

    private Paciente paciente;
    private ArrayList<Medicamento> medicamentos = new ArrayList<>();

    public Prescricao(Paciente paciente) {
    }

    public Prescricao(String nome, Medicamento medicamento) {
    }

    public void adicionaMedicamentoPrescricao(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }

    public Prescricao(Paciente paciente, ArrayList<Medicamento> medicamentos) {
        this.paciente = paciente;
        this.medicamentos = medicamentos;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
}
