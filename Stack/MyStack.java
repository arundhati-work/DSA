package Stack;

import java.io.*;
import java.util.*;

public class MyStack{

    private int arr[];
    private int top;
    private int capacity;

    public MyStack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public boolean isFull(){
        return top==capacity-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public int getSize(){
        return top+1;
    }

    public void push(int element){
        if (isFull()){
            System.out.println("Stack overflow");
            System.exit(1);
        }
        arr[++top] = element;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack underflow");
            System.exit(1);
        }
        return arr[top--];
    }

    public int search(int element){
        if (isEmpty()) return -1;
        int size = getSize();
        for(int i=0; i<size; i++){
            if (arr[i]==element) return i;
        }
        return -1;
    }

    public int peek(){
        if (isEmpty()) return -1;
        return arr[top];
    }

    public void printStack(){
        int size = getSize();
        for (int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
    }
}