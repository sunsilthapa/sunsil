import java.util.Arrays;

public class LinearQueue {
    int front=-1;
    int rear=-1;
    int size;
    int queue[];
    LinearQueue(int size){
        this.size= size;
        queue =new int[this.size];
    }

    boolean isEmpty(){
        return front==-1;
    }
    boolean isFull(){
        return  rear== queue.length-1;
    }

    void enqueOperation(int data){
        if(isFull()){
            System.out.println("Stack overflow");
        }else{
            front=0;
            queue[++rear]=data;
        }
    }

    int dequeOperation(){
        if(isEmpty()){
            System.out.println("Queue underflow");
            return -999;
        }
        if(front==rear){
            int x=front;
            front=rear=-1;
            return x;
        }else{
            return queue[front++];
        }
    }

    public static void main(String[] args) {
        LinearQueue linearQueue= new LinearQueue(3);
       linearQueue.enqueOperation(3);
       linearQueue.enqueOperation(3);
       linearQueue.enqueOperation(3);

        System.out.println("Before : " +Arrays.toString(linearQueue.queue));

        System.out.println(linearQueue.dequeOperation());
        System.out.println(linearQueue.dequeOperation());

        System.out.println("After : "+ Arrays.toString(linearQueue.queue));

        System.out.println(linearQueue.front);
        System.out.println(linearQueue.rear);

        System.out.println(linearQueue.dequeOperation());

    }

}
