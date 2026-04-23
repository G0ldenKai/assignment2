public class IntList {
    private Node head;
    private int size;

    public int size(){ return size; }
    public boolean isEmpty(){ return head == null; }

    public void addFirst(int item){
        head = new Node(item, head);
        size++;
    }

    public void addLast(int item){
        if (isEmpty()) addFirst(item);
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = new Node(item);
            size++;
        }
    }

    public int getFirst(){ return head.value; }

    public int removeFirst(){
        int val = head.value;
        head = head.next;
        size--;
        return val;
    }

    public void reverse(){
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    static class Node {
        int value;
        Node next;
        Node(int value) { this.value = value; }
        Node(int value, Node next) { this.value = value; this.next = next; }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node temp = head;
        while (temp != null) {
            sb.append(temp.value).append(temp.next == null ? "" : ", ");
            temp = temp.next;
        }
        return sb.append("]").toString();
    }
}