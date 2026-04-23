public class MinHeap implements IntQueue {
    private IntArray heap = new IntArray();

    public boolean empty() { return heap.isEmpty(); }
    public int peek() { return heap.get(0); }

    public void add(int item) {
        heap.add(item);
        bubbleUp(heap.size() - 1);
    }

    private void bubbleUp(int i) {
        while (i > 0 && heap.get(i) < heap.get((i - 1) / 2)) {
            swap(i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    public int remove() {
        int root = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.removeLast();
        if (!empty()) bubbleDown(0);
        return root;
    }

    private void bubbleDown(int i) {
        int smallest = i;
        int left = 2 * i + 1, right = 2 * i + 2;
        if (left < heap.size() && heap.get(left) < heap.get(smallest)) smallest = left;
        if (right < heap.size() && heap.get(right) < heap.get(smallest)) smallest = right;
        if (smallest != i) { swap(i, smallest); bubbleDown(smallest); }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    static void main() {
        int[] arr = {5, 1, 9, 3, 7};
        MinHeap mh = new MinHeap();
        for (int x : arr) mh.add(x);

        IntArray sorted = new IntArray();
        while (!mh.empty()) sorted.add(mh.remove());

        // Вывод в убывающем порядке
        for (int i = sorted.size() - 1; i >= 0; i--) System.out.print(sorted.get(i) + " ");
    }
}