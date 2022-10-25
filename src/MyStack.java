import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {
    }

    public void push(int x) {
        // push int the q1 front
        while(q1.isEmpty() == false) {
            q2.add(q1.remove());
        }

        q1.add(x);

        while(q2.isEmpty() == false) {
            q1.add( q2.remove());
        }
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
