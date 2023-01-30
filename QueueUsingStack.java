import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack <Integer> s2 = new Stack<>();


    void enqueElement(int data){
        s1.push(data);
    }

    int dequeElement(){
        while (!s1.empty()){
            s2.push(s1.pop());
        }
        int ans= s2.pop();
        while (!s2.empty()){
            s1.push(s2.pop());
        }
        return ans;
    }

    public static void main(String[] args) {
        QueueUsingStack usingStack= new QueueUsingStack();
        usingStack.enqueElement(1);
        usingStack.enqueElement(2);
        usingStack.enqueElement(3);
        System.out.println(usingStack.dequeElement());
        System.out.println(usingStack.dequeElement());
    }
}
