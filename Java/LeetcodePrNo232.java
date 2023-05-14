import java.util.Stack;

class MyQueue {

    private Stack<Integer> stack;

    public MyQueue() {
        stack = new Stack<Integer>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        int x = stack.pop();
        if (stack.isEmpty()) {
            return x;
        }
        int result = pop();
        stack.push(x);
        return result;
    }

    public int peek() {
        int x = stack.pop();
        if (stack.isEmpty()) {
            stack.push(x);
            return x;
        }
        int result = peek();
        stack.push(x);
        return result;
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */