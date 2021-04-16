import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        public static void main(String[] args)
            throws IOException
    {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("pls enter stack size, hure");
        int stackSize = Integer.parseInt(in.readLine());

        //give stacksize to stack class
        Stack stack = new Stack(stackSize);

        int input;
        do {
            System.out.println("Enter action: 1-push|2-pop|3-print|0-exit");
            input = Integer.parseInt(in.readLine());
            switch (input) {
                case 1:
                    System.out.println("pls enter value");
                    int value = Integer.parseInt(in.readLine());
                    System.out.println(stack.push(value));
                    break;
                case 2:
                    System.out.println(stack.pop());
                    break;
                case 3:
                    stack.print();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("input was trash");
            }
        } while (!(input==0));




    }
}
