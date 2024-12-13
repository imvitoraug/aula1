package ifma.lista04;

public class Deques {
    private Node header;
    private Node trailer;
    private int size;

    public Deques() {
        size = 0;
        header = new Node(null);
        trailer = new Node(null);
        header.setNext(trailer);
        trailer.setPrevious(header);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(Aluno aluno) {
        Node first = header.getNext();
        Node newNode = new Node(aluno);

        newNode.setNext(first);
        newNode.setPrevious(header);

        first.setPrevious(newNode);
        header.setNext(newNode);

        size++;
    }

    public void addLast(Aluno aluno){
        Node last = trailer.getPrevious();
        Node newNode = new Node(aluno);

        newNode.setNext(trailer) ;
        newNode.setPrevious(last);

        last.setNext(newNode);
        trailer.setPrevious(newNode);

        size++;
    }

    public Aluno removeFirst() {
        if(isEmpty()){
            throw new RuntimeException("Lista vazia");
        }

        Node first = getFirst();
        Node second = first.getNext();

        header.setNext(second);
        second.setPrevious(header);

        size--;
        return first.getAluno();
    }

    public Aluno removeLast() {
        if(isEmpty()){
            throw new RuntimeException("Lista vazia");
        }

        Node last = getLast();
        Node before = last.getPrevious();

        before.setNext(trailer);
        trailer.setPrevious(before);

        size--;
        return last.getAluno();
    }

    public Node getFirst() {
        if(isEmpty()){
            throw new RuntimeException("Lista vazia");
        }
        return header.getNext();
    }

    public Node getLast() {
        if(isEmpty()){
            throw new RuntimeException("Lista vazia");
        }
        return trailer.getPrevious();
    }

    public Node search(String searched){
        Node node = header.getNext();
        while(node!= null){
            if(node.getAluno().getNome().equals(searched)){
                return node;
            }
            node = node.getNext();
        }
        throw new RuntimeException("Aluno não encontrado");
    }

    @Override
    public String toString() {
        if(isEmpty()){
            return "[]";
        }
        Node node = header.getNext();
        String result = "[" + node.getAluno();
        node = node.getNext();
        while(node != trailer){
            result += ", "+node.getAluno();
            node = node.getNext();
        }
        return result + " ]" ;
    }

}