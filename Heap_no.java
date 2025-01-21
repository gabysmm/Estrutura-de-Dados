import java.util.ArrayList;

class Node {
    int key;

    public Node(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}

public class Heap {
    private ArrayList<Node> heap;
    private int size;

    public Heap() {
        heap = new ArrayList<>();
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Node min() {
        if (size == 0) {
            throw new IllegalStateException("Heap vazio");
        }
        return heap.get(0);
    }

    public void insert(Node element) {
        heap.add(element);
        size++;
        upheap(heap.size() - 1);
    }

    private void upheap(int i) {
        while (i > 0) {
            int parentI = (i - 1) / 2;
            if (heap.get(i).getKey() >= heap.get(parentI).getKey()) {
                break;
            }
            swap(i, parentI);
            i = parentI;
        }
    }

    public Node removeMin() {
        if (size == 0) {
            throw new IllegalStateException("Heap vazio");
        }
        Node minElement = heap.get(0);
        heap.set(0, heap.remove(size - 1));
        size--;
        if (size > 0) {
            downheap(0);
        }
        return minElement;
    }

    private void downheap(int i) {
        int lastI = size - 1;
        while (i <= lastI) {
            int leftChildI = 2 * i + 1;
            int rightChildI = 2 * i + 2;
            int smallI = i;

            if (leftChildI <= lastI && heap.get(leftChildI).getKey() < heap.get(smallI).getKey()) {
                smallI = leftChildI;
            }
            if (rightChildI <= lastI && heap.get(rightChildI).getKey() < heap.get(smallI).getKey()) {
                smallI = rightChildI;
            }
            if (smallI == i) {
                break;
            }
            swap(i, smallI);
            i = smallI;
        }
    }

    private void swap(int a, int b) {
        Node temp = heap.get(a);
        heap.set(a, heap.get(b));
        heap.set(b, temp);
    }
}
