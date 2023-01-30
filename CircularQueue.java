import java.util.Arrays;

public class CircularQueue {
    int size;
    int front=-1;
    int rear=-1;
    int queue[];
    CircularQueue(int size){
        this.size=size;
        queue=new int[this.size];
    }
    boolean isEmpty(){
        return front==-1 || rear==-1;
    }

    boolean isFull(){
        return (rear+1)%size==front;
    }

    void enqueOperation(int data){
        if(isFull()){
            System.out.println("Queue overflow");
        }
        else{
            if(front==-1)
                front=0;
            rear= (rear+1)%size; // increase in circular mode
            queue[rear]=data;
        }
    }

    int dequeueOperation(){
        if(isEmpty()){
            System.out.println("Queue underflow");
            return -9999;
        }
        if(front==rear){
            int x=front;
            front=rear=-1;
            return queue[x];
        }
        else{
            int x=front;
            front=(front+1)%size;
            return queue[x];
        }
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(4);
        circularQueue.enqueOperation(3);
        circularQueue.enqueOperation(4);
        circularQueue.enqueOperation(2);
        circularQueue.enqueOperation(1);
        System.out.println(circularQueue.dequeueOperation());
        System.out.println(circularQueue.dequeueOperation());
        System.out.println(circularQueue.dequeueOperation());

        System.out.println(Arrays.toString(circularQueue.queue));

        System.out.println(circularQueue.front);
        System.out.println(circularQueue.rear);

        circularQueue.enqueOperation(5);
        circularQueue.enqueOperation(22);
        System.out.println(Arrays.toString(circularQueue.queue));
    }
}
