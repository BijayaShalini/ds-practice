
import java.util.*;

public class stackOperations {
    
    int arr[];
    int max;
    int top;

    //stack constructor
    stackOperations(int n){
        arr = new int[n];
        max=n;
        top=-1; 
    }

    //method to check if the stack is empty
    public boolean isEmpty(){
        return top==-1;
    }

    //method to check if the stack is full
    public boolean isFull(){
        return top==max-1;
    }

    //method to push elements in stack
    public void push(int x){
        
        if(isFull()){
            System.out.println("Overflow. No more element can be added.");
            System.exit(1);
        }
        System.out.println("Element inserted: "+x);
        arr[++top]=x;
    }

    //method to pop elements from stack
    public int pop() {

        if(isEmpty()){
            System.out.println("Underflow. No elements to be deleted.");
            System.exit(1);
        }
          
        System.out.println("Element deleted: "+peek());
        return arr[top--];
        
    }

    //method to get top element
    public int peek() {
    
        if(!isEmpty()){
            return arr[top];
        }
        else{
            System.out.println("Empty stack.");
            System.exit(-1);
        }
        return -1;
    
    }

    //method to return the size of the stack
    public int size(){
        return top+1;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the max size of the stack: ");
        int n = sc.nextInt();

        stackOperations stack = new stackOperations(n);

        System.out.println("Pushing elements in the stack.");
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(33);
        stack.push(19);

        System.out.println("Top element: "+stack.peek());
        stack.pop();

        System.out.println("Size of the stack: "+stack.size());

    }
}
