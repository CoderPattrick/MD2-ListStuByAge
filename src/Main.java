import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("Anderson",31);
        hashMap.put("Lewis",29);
        hashMap.put("Cook",29);
        System.out.println("Display entries:");
        System.out.println(hashMap+"\n");

        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display in Ascending order of key: ");
        System.out.println(treeMap +"\n");

        Map<String,Integer> linkedHashMap =new LinkedHashMap<>(hashMap);
        System.out.println(linkedHashMap);
        System.out.printf("Age of Anderson is %d",linkedHashMap.get("Anderson"));
    }
}
