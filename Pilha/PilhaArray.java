public class PilhaArray implements Pilha {
    private int capacidade;
    private int vetor[];
    private int T;
    private int FC;

    public PilhaArray(int capacidade, int crescimento){ 
        this.capacidade = capacidade;
        T = -1; // representa o topo da pilha, indica que ela está vazia
        FC = crescimento; //define o fator de crescimento da pilha, ou seja, como deve crescer quando atinge sua capacidade max
        if (crescimento <= 0) { // se o fator de crescimento for menor ou igual a 0, o fc é definido como 0. Ou seja ele não pode crescer automaticamente
            FC = 0;
        vetor = new int[capacidade]; //inicializa o vetor com a capacidade especificada. 
        }
    }

    public Object pop() throws PilhaVaziaExcecao {
        if(isEmpty()) { //verifica se a pilha não ta vazia, usando o outro metódo
            throw new PilhaVaziaExcecao("Pilha vazia");
        }
        return vetor[T--]; //se não estiver vazia, mostrar topo da pilha eliminando o ultimo elemento decrementando. 
    }

    public void push(Object o){
        if(T+1 >= capacidade) { //verif se a capacidade ta cheia
            if (FC > 0) { //verif se o fc é positivo e se sim, crescer a capacidade automaticamente
                int[] novoVetor = new int[capacidade + FC]; //criar novo vetor com a capacidade aumentada de acordo com oq foi det no fc
                System.arraycopy(vetor, 0, novoVetor, 0, vetor.length); //copia os valores ja existente do antigo vetor pro nv
                capacidade += FC; //atualiza a capacidade da pilha
                vetor = novoVetor; //Substitui o vetor antigo pelo novo
            } else {
                throw new PilhaVaziaExcecao("Pilha cheia");
            } //se for excedido a capacidade e o fc for 0
        } 
    }

     public int size(){ 
        return T+1; //retorna o numero de indices mais um pra ser igual ao valor de total de elementos
    }

    public boolean isEmpty() { 
        return T==-1; //se for igual a -1 o tamanho da lista então é pq não tem elementos, portanto está vazia
    }

    public Object top() throws PilhaVaziaExcecao {
        if (isEmpty()) {
            throw new PilhaVaziaExcecao("A pilha esta vazia");
        }
        return a[T]; //retorna o topo
    }
}