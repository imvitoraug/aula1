package ifma.lista01;

public class TestarAlunos {
    public static void main(String[] args) {
        CadastrarAlunos alun = new CadastrarAlunos(4);

        System.out.println("Aluno adicionado: ");
        Aluno al1 = new Aluno("Vitor", "IFMA001", 1);
        alun.adicionarNoFInal(al1);
        System.out.println(alun);

        System.out.println("Aluno adicionado: ");
        Aluno al2 = new Aluno("Augusto", "IFMA002", 2);
        alun.adicionarNoFInal(al2);
        System.out.println(alun);

        System.out.println("Aluno adicionado: ");
        Aluno al3 = new Aluno("Carlos", "IFMA003", 3);
        alun.adicionarNoFInal(al3);
        System.out.println(alun);

        System.out.println("Ordenar alunos: ");
        alun.ordenarVetor();
        System.out.println(alun);

        System.out.println("Remover Último aluno: ");
        alun.removerNoFinal();
        System.out.println(alun);

        System.out.println("Remover Primeiro aluno: ");
        alun.removerNoInicio();
        System.out.println(alun);

        System.out.println("Adicionando em último: ");
        Aluno al5 = new Aluno("José", "IFMA005", 005);
        alun.adicionarNoFInal(al5);
        System.out.println(alun);

        System.out.println("Remover por indice: ");
        alun.removerComIndice(1);
        System.out.println(alun);
    }

}
