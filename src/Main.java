public class Main {
    public static void main(String[] args) {
        //Queue
        MyQueue myQueue = new MyQueue();

        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);

        int popQ = myQueue.pop();

        //Stack
        MyStack myStack = new MyStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        int popS = myStack.pop();
    }
}
