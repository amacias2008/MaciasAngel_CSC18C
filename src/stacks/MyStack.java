/*
 * Author: Angel Macias
 * Date: 3/6/2015
 * RCC ID: 2289992
 * Class/Instructor: CSC18C-Dr. Mark Lehr
 */

package stacks;

import java.util.Arrays;

public class MyStack {
    
    private int index = -1;
    protected final int CAP = 10;
    protected Object[] stack;
    
    //Default constructor for a default size of our array.
    public MyStack () {
        stack = new Object[CAP];
    }
    
    //Size of the array if a parameter is sent in.
    public MyStack(int maxSize) {
        stack = new Object[maxSize];
    }
    
    public boolean isEmpty() {
        if(index==-1)
            return true;
        else
            return false;
    }
    
    public boolean isFull() {
        if(index == (stack.length -1))
            return true;
        else
            return false;
    }
    
    public void push(Object value) {
        index++;
        stack[index]=value;
    }
    
    public void pop() {
        stack[index]=null;
        index--;
    }
    
    public Object peek() {
        Object topElement = null;
        topElement=stack[index];
        return topElement;
    }
   
    public String toString() {
        return Arrays.toString(stack);
    }
    
    
}
