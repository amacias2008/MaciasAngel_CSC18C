/*
 * Author: Angel Macias
 * Date: 3/6/2015
 * RCC ID: 2289992
 * Class/Instructor: CSC18C-Dr. Mark Lehr
 */

package stacks;
import java.util.*;
public class Stacks {

    public static void main(String[] args) {
        
        int choice;
        int sizeArray;
        int inputValue;
        int repeat;     //Used as a flag for the program
        
        Scanner input = new Scanner(System.in);
        
        MyStack stack = new MyStack();
        
        do {
            System.out.println("Enter what you would like to do: ");

            System.out.println("1: Create new stack\n"
                    + "2: Peek at the top of a stack\n"
                    + "3: Display the current stack\n"
                    + "4: Determine if the current stack is empty\n"
                    + "5: Remove the top element of the stack.");
            choice = input.nextInt();

            switch(choice) {
                case 1:  
                    System.out.println("Enter size of your array(no larger than 20): ");
                    sizeArray = input.nextInt();

                    //Create new stack
                    stack = new MyStack(sizeArray);

                    //For loop to continue entering values until array is full
                    for(int i=0;i<sizeArray;i++) {
                        System.out.println("Enter an integer value to enter into the stack: ");
                        inputValue=input.nextInt();
                        stack.push(inputValue);
                    }
                    System.out.println("Your stack is : " + stack.toString());
                    break;
                case 2:
                    System.out.println("Top element of stack: " + stack.peek());
                    break;
                case 3:
                    System.out.println(stack.toString());
                    break;
                case 4:
                    if(!stack.isEmpty())
                        System.out.println("Stack is not empty");
                    else
                        System.out.println("Stack is empty");
                    break;
                case 5:
                    System.out.println("Your stack is " + stack.toString());
                    stack.pop();
                    System.out.println("Now your stack is " + stack.toString());
                    break;
                default: System.out.println("Invalid value.");
            }
        
        System.out.println("Would you like to continue?: "
                + "\n1: yes 2: no");
        repeat=input.nextInt();
        } while(repeat==1);
    }
}