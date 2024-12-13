package ifma.lista04;

public class Aluno {
    private String nome;
    private double segundoNome;
    private double sobrenome;

    public Aluno(String nome, double segundoNome, double sobrenome){
        this.nome = nome;
        this.segundoNome = segundoNome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "(" + nome + ", " + segundoNome + ", "+sobrenome + ")";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(double segundoNome) {
        this.segundoNome = segundoNome;
    }

    public double getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(double sobrenome) {
        this.sobrenome = sobrenome;
    }
}
