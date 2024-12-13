package ifma.lista01;

public class TestarAlunos {
    public static void main(String[] args) {
        CadastrarAlunos aluno = new CadastrarAlunos(3);

        System.out.println("Aluno adicionado: ");
        Alunos al1 = new Alunos("Vitor", "IFMA001", 001);
        aluno.adicionarNoFInal(al1);
        System.out.println(aluno);

        System.out.println("Aluno adicionado: ");
        Alunos al2 = new Alunos("Augusto", "IFMA002", 002);
        aluno.adicionarNoFInal(al2);
        System.out.println(aluno);

        System.out.println("Aluno adicionado: ");
        Alunos al3 = new Alunos("Vitor", "IFMA003", 003);
        aluno.adicionarNoFInal(al1);
        System.out.println(aluno);

        System.out.println("a");
    }
}
