import java.util.*;

public class queueOperations {
    
    int arr[];
    int max;
    int front;
    int rear;

    //queue constructor
    queueOperations(int n){
        arr = new int[n];
        max=n;
        front=-1;
        rear=-1; 
    }

    //method to check if the queue is empty
    public boolean isEmpty(){
        return front==-1;
    }

    //method to check if the queue is full
    public boolean isFull(){
        return (front==max-1 && rear==max-1);
    }

    //method to insert elements in queue

    public void insert(int x){
        
        if(isFull()){
            System.out.println("Overflow. No more element can be added.");
            System.exit(1);
        }
        else{
             if(front==-1)
                front=0;
            rear++;
            System.out.println("Element inserted: "+ x);
            arr[rear]=x;
        }
    }
    //method to delete elements from queue

    public int delete() {
        int y;

        if(isEmpty()){
            System.out.println("Underflow. No elements to be deleted.");
            return(-1);
        }
        else{
            y=arr[front];
            if(front>=rear)
                front=rear=-1;
            else
                front++;

        System.out.println("Element deleted: "+ y);
        return y;
    }
}
        

    //method to get top element
    public int peekFrontElement() {
    
        if(!isEmpty()){
            return arr[front];
        }
        else{
            System.out.println("Empty queue.");
            System.exit(-1);
        }
        return -1;
    
    }

    //method to return the size of the queue

    public int size(){
        return rear;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the max size of the queue: ");
        int n = sc.nextInt();

        queueOperations queue= new queueOperations(n);

        System.out.println("inserting elements in the queue.");
        queue.insert(5);
        queue.insert(7);
        queue.insert(10);
        queue.insert(33);
        queue.insert(19);

        System.out.println("Element in front of the queue: "+queue.peekFrontElement());
        queue.delete();

        System.out.println("Size of the queue: "+queue
    .size());

    }
}

