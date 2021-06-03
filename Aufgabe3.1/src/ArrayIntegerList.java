

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
        if (listSize == 0) return -1;
        System.arraycopy(a, 1, a, 0, --listSize);
        return 0;
    }

    public boolean search(int value) {
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
