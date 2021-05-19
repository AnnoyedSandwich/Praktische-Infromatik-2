import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)
            throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println("pls enter stack size");
        int arraySize = 10;
        //arraySize = Integer.parseInt(in.readLine());

        ExtendedBitmap bitmap = new ExtendedBitmap(10, 3);

        //gleich wie 1.1/1.2
        int input;
        do {
            System.out.println("Enter action: 1-add|2-size|3-print|4-extendedAdd|0-exit");
            input = Integer.parseInt(in.readLine());
            switch (input) {
                case 1 -> {
                    System.out.println("pls enter m:");
                    int m = Integer.parseInt(in.readLine());
                    System.out.println(bitmap.add(m));
                }
                case 2 -> System.out.println(bitmap.size());
                case 3 -> bitmap.print();
                case 4 -> {
                    System.out.println("enter bottom and top values");
                    System.out.println("bottom");
                    int bottom = Integer.parseInt(in.readLine());
                    System.out.println("top");
                    int top = Integer.parseInt(in.readLine());
                    System.out.println(bitmap.add(bottom, top));
                }
                case 0 -> System.out.println("Exiting program...");
                default -> System.out.println("input was trash");
            }
        } while (!(input==0));
    }
}

