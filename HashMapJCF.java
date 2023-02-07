import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class HashMapJCF {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        //  to key-value pair in map
        hm.put("India", 200);
        hm.put("US", 100);
        hm.put("England", 150);
        hm.put("china", 50);
        System.out.println(hm);

        //  search in map
        if(hm.containsKey("India"))
            System.out.println("Present");
        else
            System.out.println("Absent");
    
        if(hm.containsValue(200))
            System.out.println("Present");
        else
            System.out.println("Absent");
        
        //  Interation in map
        for(Map.Entry<String, Integer> e : hm.entrySet())
            System.out.println(e.getKey() + " = " + e.getValue());

        Set<String> st = hm.keySet();
        for(String str : st) {
            System.out.println(str + " = " + hm.get(str));
        }

        //  to remove element from map
        hm.remove("china");

        System.out.println(hm);
    }
}
