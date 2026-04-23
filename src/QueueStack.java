// QueueStack.java
public class QueueStack implements IntQueue {
    private StackArray s1 = new StackArray();
    private StackArray s2 = new StackArray();

    public boolean empty() { return s1.empty() && s2.empty(); }
    public void add(int item) { s1.push(item); }
    public int remove() { move(); return s2.pop(); }
    public int peek() { move(); return s2.peek(); }
    private void move() {
        if (s2.empty()) while (!s1.empty()) s2.push(s1.pop());
    }
}