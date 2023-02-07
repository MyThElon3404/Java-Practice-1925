import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueJCF {
    public static void main(String[] args) {
        // Queue<Integer> qq = new LinkedList<>();
        Queue<Integer> qq = new ArrayDeque<>();
        qq.add(10);
        qq.add(20);
        qq.add(30);
        qq.add(40);
        qq.add(50);

        while(!qq.isEmpty()) {
            System.out.print(qq.peek() + " ");
            qq.remove();
        }
    }
}
