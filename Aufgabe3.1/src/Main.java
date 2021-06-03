import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)
            throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("pls enter max list size");
        int arraySize = Integer.parseInt(in.readLine());
        ArrayIntegerList list = new ArrayIntegerList(arraySize);

        //gleich wie 1.1/1.2/2.1/2.2
        int input;
        do {
            System.out.println("Enter action: 1-getLenght|2-insertLast|3-getFirst|4-deleteFirst|5-search|6-print|0-exit");
            input = Integer.parseInt(in.readLine());
            switch (input) {
                case 1 -> System.out.println(list.getLength());
                case 2 -> {
                    System.out.println("insert value to add");
                    int value = Integer.parseInt(in.readLine());
                    System.out.println(list.insertLast(value));
                }
                case 3 -> System.out.println(list.getFirst());
                case 4 -> System.out.println(list.deleteFirst());
                case 5 -> {
                    System.out.println("insert value to search");
                    int value = Integer.parseInt(in.readLine());
                    System.out.println(list.search(value));
                }
                case 6 -> list.print();
                case 0 -> System.out.println("Exiting program...");
                default -> System.out.println("input was trash");
            }
        } while (!(input==0));
    }
}