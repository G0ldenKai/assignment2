public class QueueList implements IntQueue {
    private IntList data = new IntList();
    public boolean empty() { return data.isEmpty(); }
    public void add(int item) { data.addLast(item); }
    public int peek() { return data.getFirst(); }
    public int remove() { return data.removeFirst(); }
}