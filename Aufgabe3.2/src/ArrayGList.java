

interface GList<T> {
    int getLength();
    int insertLast(T value);
    T getFirst();
    int deleteFirst();
    boolean search(T value);
    void print();
}

public class ArrayGList<T> implements GList<T> {
    private T[] a ;
    private int listSize;

    public ArrayGList(int arraySize) {
        a = (T[]) new Object[arraySize];
        listSize = 0;
    }

    public int getLength() {
        return listSize;
    }

    public int insertLast(T value) {
        if (listSize >= a.length) return -1;
        a[listSize] = value;
        listSize++;
        return 0;
    }

    public T getFirst() {
        if (listSize == 0) return null;
        return a[0];
    }

    public int deleteFirst() {
        if (listSize == 0) return -1;
        System.arraycopy(a, 1, a, 0, --listSize);
        return 0;
    }

    public boolean search(T value) {
        for (int i = 0; i < listSize; i++) {if (a[i] == value) return true;}
        return false;
    }

    public void print() {
        for (int i = 0; i < listSize; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }
}
