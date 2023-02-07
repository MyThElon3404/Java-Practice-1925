import java.util.Stack;

public class StackJCF {
    public static void main(String[] agrs) {
        Stack<Integer> sj = new Stack<>();
        sj.push(10);    sj.push(20);    sj.push(30);    sj.push(40);    sj.push(50);
        while(!sj.isEmpty()) {
            System.out.print(sj.peek() + " ");
            sj.pop();
        }
    }
}
