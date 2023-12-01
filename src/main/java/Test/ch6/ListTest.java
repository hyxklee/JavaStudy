package Test.ch6;

import java.util.*;

public class ListTest {
    public static void main(String[] args){
        List<String> l1 = new ArrayList<>();
        List<String> l2 = Arrays.asList("one", "two");
        List<String> l3 = List.of("three", "four");

        l1.addAll(l2);
        l1.addAll(1, l3);
        l1.add("five");

        System.out.println("## element of this list");
        System.out.println(l1);

        LinkedList<String> llist = new LinkedList<>();
        llist.addAll(l2);
        llist.addAll(1, l3);
        llist.add("five");

        System.out.println("## element of linkedlist");
        System.out.println(llist);

        System.out.println("## first element: "+llist.get(0));
        System.out.println("## last index of three: "+llist.lastIndexOf("three"));

        llist.set(0, "zero");
        System.out.println("## after set(): element int Llist");
        System.out.println(llist);

        Collections.sort(llist);
        System.out.println("## Desending sort of llist");
        System.out.println(llist);

        llist.sort(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o2.toString().compareTo(o1.toString());
            }
        });
        System.out.println("##Ascending sort of llist");
        System.out.println(llist);

        Iterator iter = llist.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
