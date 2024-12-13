package ifma.lista04;

public class Teste {
    public static void main(String[] args) {

        Deques dequeList = new Deques();

        Aluno aluno1 = new Aluno("Augusto", 7.0, 9.0);
        Aluno aluno2 = new Aluno("João", 1.43, 2.0);
        Aluno aluno3 = new Aluno("Vitor", 5.7, 2.3);
        Aluno aluno4 = new Aluno("Neymar", 1.0, 4.5);
        Aluno aluno5 = new Aluno("Cristiano", 3.23, 1.19);

        System.out.println("Adicionando os alunos na lista");

        dequeList.addFirst(aluno1);
        dequeList.addFirst(aluno2);
        dequeList.addFirst(aluno3);
        dequeList.addLast(aluno4);
        dequeList.addLast(aluno5);

        System.out. println(dequeList);

        System.out.println("Removi o primeiro aluno");
        System.out.println("Aluno removido: "+dequeList.removeFirst());
        System.out.println(dequeList);

        System.out.println("Removi o ultimo aluno");
        System.out.println("Aluno removido: "+dequeList.removeLast());
        System.out.println(dequeList);

        System.out.println("Em busca do aluno Neymar");
        System.out.println(dequeList.search("Neymar"));


    }
}