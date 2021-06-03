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



        String typ;
        System.out.println("welcher Typ");
        System.out.println("für Integer - i; für Double - d");
        typ = in.readLine();
        do {
            switch (typ) {
                case "i" -> {
                    ArrayGList<Integer> listI = new ArrayGList<>(arraySize);
                    mainMenu(listI, true);
                }
                case "d" -> {
                    ArrayGList<Double> listD = new ArrayGList<>(arraySize);
                    mainMenu(listD, false);
                }
            }

        }while (!(typ.matches("[id]")));






    }
    private static<E extends Number> void mainMenu(ArrayGList<E>list, boolean isInt) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int input;
        do {
            System.out.println("Enter Action: 1-getLenght; 2-insertLast; 3-getFirst; 4-deleteFirst; 5-search; 6-print; 0-exit");
            input = Integer.parseInt(in.readLine());
            switch (input) {
                case 1 -> System.out.println(list.getLength());
                case 2 -> {
                    System.out.println("enter value");
                    Object value;
                    if (isInt) {
                        value = Integer.parseInt(in.readLine());
                    } else {
                        value = Double.parseDouble(in.readLine());
                    }
                    System.out.println(list.insertLast((E) value));
                }
                case 3 -> System.out.println(list.getFirst());
                case 4 -> System.out.println(list.deleteFirst());
                case 5 -> {
                    System.out.println("enter value to search");
                    Object value;
                    if (isInt){
                        value = Integer.parseInt(in.readLine());
                    } else {
                        value = Double.parseDouble(in.readLine());
                    }
                    System.out.println(list.search((E) value));
                }
                case 6 -> list.print();
                case 0 -> System.out.println("Exiting program...");
                default -> System.out.println("input was trash");
            }
        } while (!(input==0));

    }
}


