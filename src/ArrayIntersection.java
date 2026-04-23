public class ArrayIntersection {
    public static IntArray intersect(IntArray A, IntArray B){
        IntArray result = new IntArray();
        for (int i = 0; i < A.size(); i++) {
            int val = A.get(i);
            if (B.indexOf(val) != -1 && result.indexOf(val) == -1) {
                result.add(val);
            }
        }
        return result;
    }
}