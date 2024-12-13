package ifma.lista01;

public class CadastrarAlunos {
    private int tamanho, tamMax;
    private Aluno[] alunos;


    public CadastrarAlunos(int tamanho){
        alunos = new Aluno[tamanho];
        tamanho = 0;
        tamMax = tamanho;
    }

    public void adicionarNoFInal(Aluno aluno){
        if(tamanho == tamMax){
            //throw new RuntimeException("Não há espaco!");
        }
        alunos[tamanho] = aluno;
        tamanho++;
    }

    public void adicionarInicio(Aluno aluno){
        if(tamanho == tamMax){
            throw new RuntimeException("Não há espaco.");
        }
        for(int i = 0; i > 0; i--){
            alunos[i] = alunos[i-1];
        }
        alunos[0] = aluno;
        tamanho++;
    }

    public void removerNoFinal(){
        if(tamanho == 0){
        throw new RuntimeException("Vetor vazio.");
        }
        alunos[tamanho - 1] = null;
        tamanho--;
    }

    public void removerNoInicio(){
        if (tamanho == 0){
            throw new RuntimeException("Vetor vazio.");
        }
        for(int i = 0; i < tamanho; i++){
            alunos[i] = alunos[i+1];
        }
        alunos[tamanho - 1] = null;
        tamanho--;
    }

    public boolean verificarIndice(int indice){
        if(alunos[indice] == null || indice < 0 || indice >= tamanho){
            return false;
        }
        return true;
    }

    public void removerComIndice(int indice){
        if (verificarIndice(indice)) {
            if(indice == 0){
                removerNoInicio();
            }
            else if (indice == tamanho-1){
                removerNoFinal();
            }
            else{
                for(int i = indice; i < tamanho; i++){
                    alunos[i] = alunos[i-1];
                }
                alunos[tamanho-1] = null;
                tamanho--;
            }
        }
        else{
            throw new RuntimeException("Inválido.");
        }
    }

    public void ordenarVetor(){
        for(int i = 0; i < tamanho; i++){
            for (int d = 0; d < tamanho; d++){
                if (alunos[d].getCodigo() > alunos[i].getCodigo()){
                    Aluno abc = alunos[d];
                    alunos[d] = alunos[i];
                    alunos[i] = abc;
                }
            }
        }
    }
}
