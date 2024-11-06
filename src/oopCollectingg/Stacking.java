package oopCollectingg;

import java.util.ArrayList;

public class Stacking {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(8);
        stack.push(9);
        stack.push(7);
        stack.pop();
        stack.push(8);
        stack.pop();
    }
}

class ArrayStack {  //reprezentuje vlastní kolekci
    int[] data;
    int freeIndex;

    ArrayStack(int capacity){
        data = new int[capacity];
        freeIndex = 0;
    }

    void push(int toAdd){
        if (freeIndex < data.length){
            data[freeIndex] = toAdd;
            freeIndex++;
        } else {
            System.out.println("Out of capacity");
        }
    }

    int pop(){
        if (freeIndex > 0){
            int toReturn = data[freeIndex-1];
            freeIndex--;
            return freeIndex;
            //return data[freeIndex--];
        }
        return 0;
    }

    int peek(){
        if (freeIndex > 0){
            return data[freeIndex-1];
        }
        return -1;
    }
}
