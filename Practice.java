public class Practice {
    int front=-1;
    int rear=-1;
    int a[];
    int size;
    Practice(int size){
        this.size=size;
        a=new int[size];
    }
    boolean isEmpty(){
        return front==-1 && rear==-1;
    }

    boolean isFull(){
        return (rear+1)%size==front;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("overfolow");
        }else{
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            a[rear]=data;
        }
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("underflow");
            return -9999;
        }
        if(front==rear){
            int x=front;
            front=rear=-1;
            return a[x];
        }
        else{
            int x=front;
            front=(front+1)%size;
            return a[x];
        }
    }


}
