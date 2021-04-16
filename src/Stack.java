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
