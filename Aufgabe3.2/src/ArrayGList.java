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

    public ArrayGList(int arraySize) {
        a = (T[]) new Object[arraySize];
        listSize = 0;

    }

    /*public Class getGenericType() {
        return type.getClass();
    }*/

    public int getLength() {
        return listSize;
    }

    //am ende der liste value setzen und dann liste um 1 vergrößern
    public int insertLast(T value) {
        if (listSize >= a.length) return -1;
        a[listSize] = value;
        listSize++;
        System.out.println(value.getClass().getSimpleName());
        System.out.println(a.getClass().getSimpleName());
        return 0;
    }

    public T getFirst() {
        if (listSize == 0) return null;
        return a[0];
    }

    //array wird um eine stelle nach vorne kopiert - pos1 wird zu pos0, pos2 zu pos1 etc das ganze wird listsize-1 mal gemacht
    public int deleteFirst() {
        if (listSize == 0) return -1;
        System.arraycopy(a, 1, a, 0, --listSize);
        return 0;
    }

    //durch array loopen und wenn gefunden true returnen
    public boolean search(T value) {
        for (int i = 0; i < listSize; i++) {if (a[i] == value) return true;}
        return false;
    }

    public void print() { System.out.println(Arrays.toString(a));}
}


