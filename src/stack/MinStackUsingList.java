package stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MinStackUsingList {

    List<Integer> list;

    public MinStackUsingList() {
        list = new LinkedList<>();
    }

    public void push(int val) {
        list.addFirst(val);
    }

    public void pop() {
        list.removeFirst();
    }

    public int top() {
        return list.getFirst();
    }

    public int getMin() {
        return list.stream().sorted().findFirst().get();
    }

    static void main() {
        MinStackUsingList minStack = new MinStackUsingList();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2
    }
}
