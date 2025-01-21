import java.util.*;

public class Heap {
    private ArrayList<Integer> heap;

    public Heap() {
        heap = new ArrayList<>();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }

    public int min() {
        if (heap.size() == 0) {
            throw new IllegalStateException("Heap vazio");
        }
        return heap.get(0);
    }

    public void insert(int element) {
        heap.add(element);
        upheap(heap.size() - 1);
    }

    private void upheap(int i) {
        while (i > 0) {
            int parentI = (i - 1) / 2;
            if (heap.get(i) >= heap.get(parentI)) {
                break;
            }
            swap(i, parentI);
            i = parentI;
        }
    }

    public int removeMin() {
        if (heap.size() == 0) {
            throw new IllegalStateException("Heap vazio");
        }
        int minElement = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        if (heap.size() > 0) {
            downheap(0);
        }
        return minElement;
    }

    private void downheap(int i) {
        int lastI = heap.size() - 1;
        while (i <= lastI) {
            int leftChildI = 2 * i + 1;
            int rightChildI = 2 * i + 2;
            int smallI = i;

            if (leftChildI <= lastI && heap.get(leftChildI) < heap.get(smallI)) {
                smallI = leftChildI;
            }
            if (rightChildI <= lastI && heap.get(rightChildI) < heap.get(smallI)) {
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
        int temp = heap.get(a);
        heap.set(a, heap.get(b));
        heap.set(b, temp);
    }
}
