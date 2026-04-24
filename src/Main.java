public class Main {
    public static void main(String[] args) {
        System.out.println("=== Section 1: Resizable Array ===");
        IntArray arr1 = new IntArray(new int[]{1, 2, 3, 4});
        IntArray arr2 = new IntArray(new int[]{3, 4, 5, 6});
        System.out.println("Array A: " + arr1);
        System.out.println("Array B: " + arr2);
        System.out.println("Intersection: " + ArrayIntersection.intersect(arr1, arr2));

        System.out.println("\n=== Section 2: LinkedList ===");
        IntList list = new IntList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println("Original List: " + list);
        list.reverse();
        System.out.println("Reversed List: " + list);

        System.out.println("\n=== Section 3: Stack (via Queue) ===");
        StackQueue stack = new StackQueue();
        stack.push(1);
        stack.push(2);
        System.out.println("Stack Pop (should be 2): " + stack.pop());

        System.out.println("\n=== Section 4: Queue (via Stack) ===");
        QueueStack queue = new QueueStack();
        queue.add(100);
        queue.add(200);
        System.out.println("Queue Remove (should be 100): " + queue.remove());

        System.out.println("\n=== Section 5: MinHeap & Sort ===");
        int[] toSort = {15, 5, 20, 1, 10};
        MinHeap heap = new MinHeap();
        for (int x : toSort) heap.add(x);

        System.out.print("Sorted Descending: ");
        IntArray sorted = new IntArray();
        while (!heap.empty()) sorted.add(heap.remove());
        // Вывод с конца для убывающего порядка
        for (int i = sorted.size() - 1; i >= 0; i--) {
            System.out.print(sorted.get(i) + " ");
        }
        System.out.println();
    }
}