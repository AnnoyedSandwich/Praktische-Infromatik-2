import java.util.Arrays;

public class Stack{
    int stackSize;
    private int [] a;
    private int top;

    public Stack(int stackSize) {
        this.stackSize = stackSize;
        this.a = new int[stackSize];
        this.top = -1; //has to be -1, 0 doesn't wort bc arrays start at 0. Top keeps track of pushes

    }

    public boolean isFull() {return (a.length-1 == top);}

    public boolean isEmpty() {return (top == -1);}

    //increment top and a[top] is value
    public int push(int value) {
        if (isFull()) { return -1; }
        top++;
        a[top] = value;
        return 0;
    }

    //tmp = top and reduced top by 1
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