public class FilaInc implements IFila {
    private int array[];
    private int capacidade;
    private int size;
    private int first;
    private int last;

    public FilaInc (int capacidade) {
        this.capacidade = capacidade;
        array = new int[capacidade];
        this.first = 0;
        this.last = 0; 
        this.size =0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

}