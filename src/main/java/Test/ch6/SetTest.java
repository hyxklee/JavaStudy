package Test.ch6;

import java.util.*;

public class SetTest {
    public static void main(String[] args){
        Set<String> s1 = new HashSet<>();
        Set<String> s2 = Set.of("three", "four");

        s1.addAll(Arrays.asList("one","two"));
        s1.addAll(s2);
        s1.add("five");
        s1.add("two");
        s1.remove("five");

        System.out.println("## element of this Set");
        System.out.println(s1);

        s1.stream().forEach(System.out::println);

        System.out.println("## check exist element in this set");
        System.out.println(s1.contains("one"));

        Set<String> lset = new LinkedHashSet<>();
        lset.addAll(Arrays.asList("one","two","three","four"));
        lset.add("five");

        System.out.println("## print element using Iterator");
        Iterator<String> iter = lset.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        Set<Integer> tset = new TreeSet<>();
        tset.addAll(Arrays.asList(50,10,60,20));

        System.out.println("\n## element of this TreeSet");
        System.out.println(tset);

        System.out.println("## Ascending sort with stream api");
        tset.stream().sorted((o1,o2)->o2.toString().compareTo(o1.toString())).forEach(System.out::println);
    }
}
