import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Farmacia {


    static ArrayList<Paciente> pacientes = new ArrayList<>();
    static ArrayList<Medicamento> medicamentos = new ArrayList<>();
    static ArrayList<Prescricao> prescricoes = new ArrayList<>();

    public static void cadastraPaciente(String nome, String sintoma) {//cadastra paciente
        pacientes.add(new Paciente(nome, sintoma));
    }

    public static void cadastraMedicamento(String nome, String administracao, ArrayList<String> indicacoes) {//cadastra medicamento
        medicamentos.add(new Medicamento(nome, administracao, indicacoes));
    }

    public class validaPacienteMedicamento {//valida e faz a prescrição no mesmo momento
        public static void fazPrescricao(Paciente paciente, Medicamento medicamento) {
            String ret = " ";
            if (medicamento.getIndicacoes().contains(paciente.getSintoma())) {
                prescricoes.add(new Prescricao(paciente, medicamentos));
                ret += "O medicamento " + medicamento.getNome() + " não é indicado para o" +
                        paciente.getNome() + ", pois o sintoma " + paciente.getSintoma() + "não é compatível com as indicações";
            } else {
                Prescricao prescricao = new Prescricao(paciente);
                prescricao.adicionaMedicamentoPrescricao(medicamento);
                prescricoes.add(prescricao);
                ret += "Prescrição salva!";
            }
            JOptionPane.showMessageDialog(null, ret);
        }
    }

    public String listaPacienteMedicamento(Paciente paciente) {//lista os pacientes e suas prescrições
        String ret = " ";
        for (Prescricao p : prescricoes) {
            if (p.getPaciente().getNome().equalsIgnoreCase(paciente.getNome())) {
                ret += prescricoes + "\n";
            }
        }
        return ret;
    }
}