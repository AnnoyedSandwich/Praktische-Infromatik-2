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

    public int remove(int m) {
        if (m >= a.length) return -1;
        if (a[m]==1) {
            a[m]=0;
            return 1;
        }
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

    //vorgabe der aufgabe um das array von 0 bis wert zu füllen
    public ExtendedBitmap(int arraySize, int wert) {
        super(arraySize);
        for (int i = 0; i < wert; i++){
            add(i);
        }

    }

    //über array loope, sobald ein eintrag mit 1 gefunden wird fals zurückgeben, sonst true zuruückgeben
    public boolean isEmpty() {
        for (int i : a) {
            if (i==1) return false;
        }
        return true;
    }

    //einträge machen ziwschen 2 werten
    //mehthode rangeCheck um zu testen op top zwischen 0 und der länge des arrays ist; und ob bottom zwischen 0 und top ist
        //regex ist hier iwie sehr übertrieben, stattdessen kann man auch if(bottom >= a.length || top >=a.length || bottom < 0 || top > bottom) return -1 nehmen
        //wenn check erfolgreich dann via for loop von bottom+1 bis top jeden wert auf 1 setzen (siehe add methode)
    public int add(int bottom, int top) {
        if (rangeCheck(bottom, top)) return -1;
        for (int e = bottom+1; e < top; e++) {
            add(e);
        }
        return 0;
    }

    public int exists(int x) {
        if (remove(x) == 1) {
            add(x);
            return 1;
        }
        return 0;
    }

    //variable zu String und dann testen ob sie im Intervall liegt
    public boolean rangeCheck(int bottom, int top) {
        return String.valueOf(top).matches("[0]*" + a.length + "}") && String.valueOf(bottom).matches("[0]*" + top + "}");
    }
}