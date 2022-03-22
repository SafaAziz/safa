import java.util.Stack;

/**
 * Created by server on 3/19/2022.
 */
public class Removing {

    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<Integer>();
        stack.push(10);
        stack.push(15);
        stack.push(30);
        stack.push(20);
        stack.push(5);
        System.out.println("stack:"+stack);
        System.out.println("popped element:"+stack.pop());
        System.out.println("stack after pop operation"+stack);
    }
}
