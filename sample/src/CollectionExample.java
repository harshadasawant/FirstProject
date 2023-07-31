import java.sql.Array;
import java.util.*;

public class CollectionExample {

    public static void ListFunction(){
        List<String> li = new LinkedList<String>();
        li.add("Harshada");
        li.add("Harshada");
        li.add("Manisha");
        for(String s : li){
            System.out.println(s);
        }
//        li.add(0);
//        li.add(6.5f);
    }

    public static void setFunction(){
        Set<String> setObj = new LinkedHashSet<>();
        setObj.add("abc");
        setObj.add("xyz");
        setObj.add("abc");
        for(String s : setObj){
            System.out.println(s);
        }
    }

    public  static void hashMapFunction(){
        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(1,"Manisha");
        m.put(2, "Harshada");
        m.put(2, "Rekha");
        for(Map.Entry entryMap : m.entrySet()){
            System.out.println(entryMap.getKey() + "  "+entryMap.getValue());
        }

    }


    public static void main(String[] args) {
        ListFunction();
        setFunction();
        hashMapFunction();

    }
}
