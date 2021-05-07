import java.util.Arrays;

public class Stack{
    private int [] a;
    private int top;
    public Stack(int stackSize) {
        this.a = new int[stackSize];
        this.top = -1; //has to be -1, 0 doesn't wort bc arrays start at 0. Top keeps track of pushes
    }

    //getter methods
    public int[] getA() {
        return a;
    }

    public int getTop() {
        return top;
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

class ExtendedStack extends Stack {

    public ExtendedStack(int stackSize, int wert) {
        super(stackSize);
        //to fill full stack with numbers, use push mehtod bc less words to type
        for (int i = 0; i < stackSize; i++) {
            push(wert+i);
        }
    }

    public boolean trueEmpty() { return isEmpty(); } //see isEmpty method lol

    //a.lenght-(top+1) is available space (bc top keeps track of how many "entrys" there are
    //for loop to iterate through array and use push mehtod bc less words to type
    public int push(int[] arr) {
        if (arr.length > this.getA().length-(getTop()+1)) { return -1; }
        for (int i : arr) {
            push(i);
        }
        return 0;
    }

    public int pop(int number) {
        if (number > this.getTop()+1) return -1;
        int tmp = 0;
        for (int i = 0; i < number; i++) {
            tmp = pop();
        }
        return tmp;
    }
}