import java.util.Arrays;

public class Stack{
    int [] a;
    int top;
    public Stack(int stackSize) {
        this.a = new int[stackSize];
        this.top = -1;
    }

    public boolean isFull() {return (a.length-1 == top);}

    public boolean isEmpty() {return (top == -1);}

    public int push(int value) {
        if (isFull()) { return -1; }
        top++;
        a[top] = value;
        return 0;
    }

    public int pop() {
        if(isEmpty()) { return -1; }
        int temp = a[top];
        a[top] = 0;
        top--;
        return temp;
    }

    public void print() {
        System.out.println(Arrays.toString(a));
    }
}

class ExtendedStack extends Stack {

    public ExtendedStack(int stackSize, int wert) {
        super(stackSize);
        for (int i = 0; i < stackSize; i++) {
            push(wert+i);
        }
    }

    public boolean trueEmpty() { return isEmpty(); } //komplett Lost die Aufgabenstellung

    public int push(int[] arr) {
        if (arr.length > a.length-(top+1)) { return -1; }
        for (int j = 0; j < arr.length; j++) {
            push(arr[j]);
        }
        return 0;
    }
}