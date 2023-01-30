import java.util.Stack;

//? Stack impementation using array
public class Stacks {
//    int size;
//    int[] arr;
//    int top=-1;
//    Stacks(int size){
//        this.size=size;
//        arr=new int[this.size];
//    }
//    boolean isFull(){
//        return  top==size-1;
//    }
//
//    boolean isEmpty(){
//        return  top==-1;
//    }
//
//    void push(int data){
//        if(isFull()){
//            System.out.println("Stack overflow");
//        }else{
//            top++;
//            arr[top]=data;  // ? or arr[++top]=data;
//        }
//    }
//
//    int pop(){
//        if(isEmpty()){
//            System.out.println("Stack underflow");
//            return -999999;
//        }
//        int result=arr[top];  // ? return arr[top--];
//        top--;
//        return result;
//    }
//
//    int peek(){
//        if(isEmpty()){
//            System.out.println("Stack underflow");
//            return -9999;
//        }
//        return arr[top];
//    }




    public static void main(String[] args) {
//        Stacks stacks= new Stacks(5);
//        stacks.push(10);
//        stacks.push(20);
//        stacks.push(30);
//        System.out.println(stacks.pop());
//        System.out.println(stacks.pop());
//        System.out.println(stacks.peek());

        //? Generic Stack class
        Stack<Integer> stack= new Stack<Integer>();
        System.out.println( stack.push(20));
        System.out.println(stack.pop());


    }
}
