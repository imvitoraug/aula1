package ifma.lista01;

public class Aluno {
    private int codigo;
    private String matricula;
    private String nome;

    public Aluno(String nome, String matricula, int codigo){
        this.nome = nome;
        this.matricula = matricula;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return ", nome='" + nome +
                "codigo=" + codigo + '\'' +
                ", matricula='" + matricula + '\'' + '\n';
    }
}
