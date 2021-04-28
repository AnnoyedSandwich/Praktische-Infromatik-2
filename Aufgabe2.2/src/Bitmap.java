import java.util.Arrays;

public class Bitmap {
    int arraySize;
    public byte [] a;

    public Bitmap(int arraySize) {
        this.arraySize = arraySize;
        this.a = new byte[arraySize];
    }



    public int add(int m) {
        if (m >= a.length) return -1;
        a[m] = 1;
        return 0;
    }

    public int size() {
        int counter = 0;
        for (int j : a) {
            if (j == 1) counter++;
        }
        return counter;
    }

    public void print() {System.out.println(Arrays.toString(a));}
}

class ExtendedBitmap extends Bitmap {

    public ExtendedBitmap(int arraySize, int wert) {
        super(arraySize);
        for (int i = 0; i < wert; i++){
            add(i);
        }

    }

    public boolean isEmpty() {
        for (int i : a) {
            if (i==1) return false;
        }
        return true;
    }

    public int add(int bottom, int top) {
        if (bottom >= a.length || top >=a.length) return -1;
        for (int e = bottom+1; e < top; e++) {
            add(e);
        }
        return 0;
    }
}