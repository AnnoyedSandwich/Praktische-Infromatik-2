import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)
            throws IOException
    {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("pls enter stack size");
        //initalize size of array (stack) switch between size input done by user (Aufgabe 1.1) or not
        int stackSize;
        // stackSize = Integer.parseInt(in.readLine());
        stackSize = 6;
        int wert = 10;

        //give stacksize to stack class
        ExtendedStack stack = new ExtendedStack(stackSize, wert);

        int input;
        do {
            System.out.println("Enter action: 1-push|2-pop|3-array-push|4-is Empty|5-print|0-exit");
            input = Integer.parseInt(in.readLine());
            switch (input) {
                case 1 -> {
                    System.out.println("pls enter value");
                    int value = Integer.parseInt(in.readLine());
                    System.out.println(stack.push(value));
                }
                case 2 -> System.out.println(stack.pop());
                case 3 -> {
                    //str array splits out the commas, for loop to make int array out of stirng array
                    //to-do: find smarter way without for loop
                    System.out.println("pls enter array numbers separated by ',' ");
                    String str = in.readLine();
                    String[] strArr = str.split(",");
                    int[] iArr = new int[strArr.length];
                    for (int i = 0; i < strArr.length; i++) iArr[i] = Integer.parseInt(strArr[i]);
                    System.out.println(stack.push(iArr));
                }
                case 4 -> System.out.println(stack.trueEmpty());
                case 5 -> stack.print();
                case 0 -> System.out.println("Exiting program...");
                default -> System.out.println("input was trash");
            }
        } while (!(input==0));
    }
}
