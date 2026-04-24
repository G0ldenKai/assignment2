public class StackArray implements IntStack {
    private IntArray data = new IntArray();
    public boolean empty() { return data.isEmpty(); }
    public int peek() { return data.get(data.size() - 1); }
    public int pop() { return data.removeLast(); }
    public void push(int item) { data.add(item); }
}