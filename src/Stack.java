import java.util.Scanner;

public class Stack {
    private static final int capacity = 3;
    int arr[] = new int[capacity];
    int top = -1;

    public void push(int ele) {
        if (top < capacity - 1) {
            top++;
            arr[top] = ele;
            System.out.println("Element" + ele + "is pushed to stack");
            printElements();
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public void pop() {
        if (top >= 0) {
            top--;
            System.out.println("pop operation done");
        } else {
            System.out.println("Stack underflow");
        }
    }

    public void printElements() {
        if (top >= 0) {
            System.out.println("Elements in stack");
            for (int i = 0; i <= top; i++) {
                System.out.println(arr[i]);
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter choice 1. Push 2. Pop 3. display 4. Exit");
        Stack st = new Stack();
        while (true) {
            System.out.println("Enter choice");
            int num = in.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Enter elements");
                    int ele = in.nextInt();
                    st.push(ele);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.printElements();
                    break;
                default:
                    System.exit(0);
            }
        }

    }
}






