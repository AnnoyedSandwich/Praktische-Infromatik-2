
//kommentare sind in 3.2

import java.util.Arrays;

interface IntegerList {
    int getLength();
    int insertLast(int value);
    int getFirst();
    int deleteFirst();
    boolean search(int value);
    void print();
}

public class ArrayIntegerList implements IntegerList {
    private int [] a;
    private int listSize;

    public ArrayIntegerList(int arraySize) {
        this.a = new int[arraySize];
        listSize = 0;
    }

    public int getLength() {
        return listSize;
    }
    public int insertLast(int value) {
        if (listSize >= a.length) return -1;
        a[listSize] = value;
        listSize++;
        return 0;
    }

    public int getFirst() {
        if (listSize == 0) return -999;
        return a[0];
    }

    public int deleteFirst() {
        //array copy von a[1] zu a[0] und dann den höchsten wert auf 0 setzen
        if (listSize == 0) return -1;
        System.arraycopy(a, 1, a, 0, --listSize);
        a[listSize++] = 0;
        return 0;
    }

    public boolean search(int value) {
        for (int i = 0; i < listSize; i++) {if (a[i] == value) return true;}
        return false;
    }

    public void print() { System.out.println(Arrays.toString(a));}
}
