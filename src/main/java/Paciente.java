public class Paciente {
    private String nome;
    private String sintoma;

    public Paciente(String nome, String sintoma) {
        this.nome = nome;
        this.sintoma = sintoma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }
}
