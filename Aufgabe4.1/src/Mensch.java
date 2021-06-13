import java.io.Serializable;

public class Mensch implements Serializable {

    private String name;
    private double size;
    private int age;
    private int arraySize;
    Mensch [] menschArr;

    Mensch(String name, double size, int age) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.menschArr = new Mensch[arraySize];
    }

    public void showData(){
        System.out.println("Name: "+name+", Size: "+size+", Age: "+age);
        System.out.println();
    }
}
