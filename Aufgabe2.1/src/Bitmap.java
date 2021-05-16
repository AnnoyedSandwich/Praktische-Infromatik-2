import java.util.Arrays;

public class Bitmap {
    int arraySize;
    public byte [] a;

    public Bitmap(int arraySize) {
        this.arraySize = arraySize;
        this.a = new byte[arraySize];
    }


    //wenn der index and dem hinzugefügt werden soll größer ist als die Bitmap return -1
    //sonst array an stelle m gleich 1 setzen
    public int add(int m) {
        if (m >= a.length) return -1;
        a[m] = 1;
        return 0;
    }

    //über array loopen und alle einträge die 1 sind zählen
    public int size() {
        int counter = 0;
        for (int j : a) {
            if (j == 1) counter++;
        }
        return counter;
    }

    //print array
    public void print() {System.out.println(Arrays.toString(a));}
}
