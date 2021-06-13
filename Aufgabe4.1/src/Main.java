import java.io.*;
import java.util.Scanner;

public class Main implements Serializable {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("daten.txt"));

        int arraySize;
        String name;
        double size;
        int age;

        //arraysize aus file lesen
        arraySize = scanner.nextInt();

        //arrays initialisieren
        Mensch[] objArray = new Mensch[arraySize];
        Mensch[] dataArray = new Mensch[arraySize];

        //ab zeile 2 5 mal jeweils ein string ein double und ein int einlesen
        //und diese das hinzufügen
        for (int i = 0; i < arraySize; i++) {
            name = scanner.next();
            size = Double.parseDouble(scanner.next());
            age = Integer.parseInt(scanner.next());
            //System.out.println(name + " " + size + " " + age);
            objArray[i] = new Mensch(name, size, age);
        }

        //ausgeben des Arrays
        for(int i = 1; i < arraySize+1; i++) {
            System.out.println("Mensch "+i);
            objArray[i-1].showData();
        }

        //serialize ObjectOutputStream verbunden mit FileoutputStream erstellen, object array reinschreiben und dann wieder schließen
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("daten2.txt"));
            out.writeObject(objArray);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //deserialize: gleiches prinzip wie serialize
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("daten2.txt"));
            dataArray = (Mensch[]) in.readObject();
            in.close();
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        //asugabe des neuen arrays
        System.out.println("-----------------hier das zweite array-----------------");
        for(int i = 1; i < arraySize+1; i++) {
            System.out.println("Mensch "+i);
            dataArray[i-1].showData();
        }

    }
}




