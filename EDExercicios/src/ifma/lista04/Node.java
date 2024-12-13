package ifma.lista04;

public class Node {
    private Aluno aluno;
    private Node next;
    private Node previous;

    public Node(){}

    public Node(Aluno aluno) {
        this.aluno = aluno;
        this.next = null;
        this.previous = null;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return ""+aluno;
    }
}