package Test.ch6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MepTest {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("1", "Iphone");
        map.put("2","Ipad");
        map.put("3", "Galaxy");
        map.put("4", "Tablet");

        System.out.println("1: "+map.get("1"));

        System.out.println("-----------------");

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.printf("%s: %s\n", entry.getKey(), entry.getValue());
        }
        System.out.println("-----------------");
        for(String s:map.keySet()){
            System.out.printf("%s\n", s);
        }
        System.out.println("-----------------");
        for(String s:map.values()){
            System.out.printf("%s\n", s);
        }
    }
}
