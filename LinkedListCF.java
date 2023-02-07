import java.util.LinkedList;

public class StartWithJava {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        //  Performing Various Operations on LinkedList:
        
        // 1. Adding elements
        ll.add(10); ll.add(20); ll.add(1, 100);
        ll.add(30); ll.add(40); ll.add(50);
        System.out.println(ll.toString());

        // 2. Updating elements
        ll.set(0, 1000);
        System.out.println(ll);

        // 3. Removing elements
        ll.remove(0);
        System.out.println(ll);

        // 4. Iterating over elements

        // method 1
        for(int i=0;i<ll.size(); i++)
            System.out.print(ll.get(i) + " ");
        System.out.println();

        // method 2
        for(Integer x : ll)
            System.out.print(x + " ");
        System.out.println();

        // 5. To Array();
        Object[] a = ll.toArray();
        for(Object x : a)
            System.out.print(x + " ");
        System.out.println();

        // 6. Size();
        System.out.println(ll.size());

        // 7. remove First();
        ll.removeFirst();
        System.out.println(ll);

        // 8. remove last();
        ll.removeLast();
        System.out.println(ll);
    }
}
