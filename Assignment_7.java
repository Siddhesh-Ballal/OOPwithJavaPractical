// A106 Siddhesh Ballal
// 27 May 2022

// Assignment 7
// Design a Base class STACK and Handle runtime anomalies like Overflow when the stack is full
// and underflow when the stack is empty. Display error codes and messages by using appropriate
// try and catch block to handle the exceptions thrown

interface Stack {
    public void push(int x) throws StackException;

    public int pop() throws StackException;
}

class ArrayStack implements Stack {
    public int[] item;
    public int stackTop;

    public ArrayStack(int size) {
        item = new int[size];
        stackTop = 0;
    }

    public void push(int x) throws StackException {
        if (stackTop == item.length) {
            throw new StackException("Stack overflow");
        }
        item[stackTop] = x;
        stackTop++;
    }

    public int pop() throws StackException {
        int returnItem;
        if (stackTop == 0) {
            throw new StackException("Stack underflow");
        }
        returnItem = item[stackTop - 1];
        stackTop--;
        return returnItem;
    }
}

class StackException extends Exception {
    public StackException(String message) {
        super(message);
    }
}

public class Assignment_7 {
    public static void main(String[] args) {
        int x;
        Stack s;
        s = new ArrayStack(6);
        try {
            x = 4;
            s.push(x);
            System.out.println("push(" + x + ");");
            x = 7;
            s.push(x);
            System.out.println("push(" + x + ");");
            x = 8;
            s.push(x);
            System.out.println("push(" + x + ");");
            x = 9;
            s.push(x);
            System.out.println("push(" + x + ");");
            x = 12;
            s.push(x);
            System.out.println("push(" + x + ");");
            x = 91;
            s.push(x);
            System.out.println("push(" + x + ");");
            x = 19;
            s.push(x);
            System.out.println("push(" + x + ");");
            x = s.pop();
            System.out.println("pop() ---> " + x);
            x = s.pop();
            System.out.println("pop() ---> " + x);
            x = s.pop();
            System.out.println("pop() ---> " + x);
            x = s.pop();
            System.out.println("pop() ---> " + x);
            x = s.pop();
            System.out.println("pop() ---> " + x);
        } catch (StackException e) {
            System.out.println("Error detected: " + e.getMessage());
            System.exit(1);
        }
    }
}