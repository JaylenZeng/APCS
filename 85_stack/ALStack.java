import java.util.ArrayList;

public class ALStack<T> implements Stack<T> {
    private ArrayList<T> stack;

    public ALStack () {
        stack = new ArrayList<T>();
    }
    
    public boolean isEmpty() {
        return stack.size() == 0;
    }
    public T peekTop() {
        return stack.get(stack.size()-1);
    }
    public T pop() {
        if (!isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }
    public void push(T x) {
        stack.add(x);
    }

}//end class
