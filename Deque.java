import java.util.ArrayList;
public class Deque {
    private int tam = -1;
    private ArrayList<Object> deque;

public Deque(){ 
    this.deque = new ArrayList<>();
 }
public void inserirInicio(Object element) {
    this.tam++;
    deque.add(0, element);
}
public Object removerInicio() {
    if (deque.isEmpty()) {
        System.out.println("Deque ta vazio homi");
    }
    this.tam--;
    return deque.remove(deque.size() - 1);
}

public void inserirFim(Object element) {
    this.tam++;
    deque.add(element);
}

public Object removerFim() {
    if (deque.isEmpty()) {
        System.out.println("Deque ta vazio homi");
    }
    this.tam--;
    return deque.remove(deque.size() - 1);
}

public Object primeiro(){
    if (deque.isEmpty()) {
        System.out.println("ta vazio coleguinha");
    }
    return deque.get(0);
}

public Object ultimo(){
    if (deque.isEmpty()){
        System.out.println("ta vazio, o chupa-cabra robou tudo");
    }
    return deque.get(deque.size() - 1);
}

public Boolean estaVazio(){
    return deque.isEmpty();
}

public int tamanho(){
    return this.tam;
}
public static void main(String[] args) { 
    Deque deque = new Deque(); 
    deque.inserirInicio(1); 
    deque.inserirFim(2); 
    System.out.println(deque.removerInicio()); 
}
}
