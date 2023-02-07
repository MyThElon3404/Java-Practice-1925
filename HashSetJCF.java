import java.util.HashSet;
import java.util.Iterator;

public class HashSetJCF {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        //  add element to set
        hs.add(1); hs.add(2); hs.add(3);    hs.add(1);
        System.out.println("The size of HashSet is " + hs.size());
        System.out.println(hs.toString());

        //  search
        if(hs.contains(1))
            System.out.println("Present");

        if(!hs.contains(6))
        System.out.println("Not Present");

        //  delete
        hs.remove(1);
        if(!hs.contains(1)) 
            System.out.println("absent");

        hs.add(10); hs.add(20); hs.add(30);
        Iterator it = hs.iterator();
        while(it.hasNext())
            System.out.print(it.next() + " ");
        
        System.out.println();

        if(!hs.isEmpty())
            System.out.println("set is not empty");

    }
}
