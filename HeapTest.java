import java.util.*;

public class HeapTest {
    public static void main(String[] args) {
        //prim teste
        HeapArray heapArray = new HeapArray();

        heapArray.insert(10);
        heapArray.insert(20);
        heapArray.insert(5);
        heapArray.insert(7);
        heapArray.insert(8);

        System.out.println("Tamanho: " + heapArray.size());
        System.out.println("Menor elemento: " + heapArray.min());
        System.out.println("Remove: " + heapArray.removeMin());
        System.out.println("Está vazio? " + heapArray.isEmpty());
        System.out.println("Menor elemento pós remove: " + heapArray.min());
        System.out.println("Tamanho pós remove: " + heapArray.size());

        while (!heapArray.isEmpty()) {
            System.out.println("Removendo elemento: " + heapArray.removeMin());
        }

        System.out.println("Está vazio? " + heapArray.isEmpty());

        //Segundo teste 
        HeapNode heapNode = new HeapNode();

        heapNode.insert(new Node(10));
        heapNode.insert(new Node(20));
        heapNode.insert(new Node(5));
        heapNode.insert(new Node(7));
        heapNode.insert(new Node(8));

        System.out.println("Tamanho " + heapNode.size());
        System.out.println("Menor elemento " + heapNode.min().getKey());
        System.out.println("Remove: " + heapNode.removeMin().getKey());
        System.out.println("Menor elemento " + heapNode.min().getKey());
        System.out.println("Tamanho pós remoção: " + heapNode.size());
        System.out.println("Está vazio? " + heapNode.isEmpty());

        while (!heapNode.isEmpty()) {
            System.out.println("Removendo elemento: " + heapNode.removeMin().getKey());
        }

        System.out.println("Está vazio? " + heapNode.isEmpty());
}
