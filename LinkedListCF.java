import java.util.*;
class LinkedListCF {
    public static void main(String[] agrs) {
        LinkedList<String> ll = new LinkedList<>();
        //  add at begin of list
        ll.addFirst("is");   ll.addFirst("Manaa");
        System.out.println(ll);
        //  add at end of list
        ll.addLast("MyThElon"); ll.addLast("BuGaa");
        System.out.println(ll);
        //  add at index
        ll.add(2, "a");
        System.out.println(ll);
        ll.add("ohkk");
        System.out.println(ll);
        System.out.println(ll.get(0));
        System.out.println(ll.size());
        ll.remove();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);

    }   
}
