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
