public class IntArray {
    private int[] array;
    private int size;

    public IntArray(){
        array = new int[4];
        size = 0;
    }

    public IntArray(int []items){
        this();
        for (int item : items) add(item);
    }

    public int size() { return size; }

    public boolean isEmpty(){ return size == 0; }

    private void ensureCapacity() {
        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            for (int i = 0; i < size; i++) newArray[i] = array[i];
            array = newArray;
        }
    }

    public int get(int index){
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return array[index];
    }

    public int set(int index, int item){
        int old = get(index);
        array[index] = item;
        return old;
    }

    public void add(int item){
        ensureCapacity();
        array[size++] = item;
    }

    public void addAt(int index, int item){
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        ensureCapacity();
        for (int i = size; i > index; i--) array[i] = array[i-1];
        array[index] = item;
        size++;
    }

    public int remove(int index){
        int removed = get(index);
        for (int i = index; i < size - 1; i++) array[i] = array[i+1];
        size--;
        return removed;
    }

    public int removeFirst(){ return remove(0); }
    public int removeLast(){ return remove(size - 1); }

    public boolean removeItem(int item){
        int index = indexOf(item);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }

    public int indexOf(int item){
        for (int i = 0; i < size; i++) if (array[i] == item) return i;
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]).append(i == size - 1 ? "" : ", ");
        }
        return sb.append("]").toString();
    }
}