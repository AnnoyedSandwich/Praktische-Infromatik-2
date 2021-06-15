import java.util.Arrays;

//interface
interface GList<T> {
    int getLength();
    int insertLast(T value);
    T getFirst();
    int deleteFirst();
    boolean search(T value);
    void print();
}
@SuppressWarnings("unchecked")
public class ArrayGList<T> implements GList<T> {
    private T[] a ;
    private int listSize;
    private T[] tmp;

    public ArrayGList(int arraySize) {
        a = (T[]) new Object[arraySize];
        tmp = (T[]) new Object[arraySize];
        listSize = 0;

    }

    //gibt listSize zurück
    public int getLength() {
        return listSize;
    }

    //am ende der liste value setzen und dann liste um 1 vergrößern
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

    //
    public int deleteFirst() {
        if (listSize == 0) return -1;
        tmp = Arrays.copyOfRange(a, 1, a.length+1);
        a = tmp;
        listSize --;
        return 0;
    }

    //durch array loopen und wenn gefunden true returnen
    public boolean search(T value) {
        for (int i = 0; i < listSize; i++) {if (a[i].equals(value))return true;}
        return false;
    }

    public void print() { System.out.println(Arrays.toString(a));}
}


