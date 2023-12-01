package Test.ch5;

public class StringTest1 {
    public static void main(String[] args){
        String s1 = new String("hello");
        String s2 = "hello";

        System.out.printf("%s, %s\n", s1.hashCode(), s2.hashCode());

        String s3 = new String("hello");
        String s4 = "hello";
        System.out.printf("%s, %s\n", s3.hashCode(), s4.hashCode());

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));

        System.out.printf("s1 == s2: %s\n", s1 == s2);
        System.out.printf("s1 == s3: %s\n", s1 == s3);
        System.out.printf("s2 == s4: %s\n", s2 == s4);
        System.out.printf("s1.equals(s2): %s\n", s1.equals(s2));

        s2 = s2 + " World";
        String s5 = "hello World";

        System.out.printf("s2 == s5: %s\n", s2 == s5);
        System.out.printf("s2.equals(s5): %s\n", s2.equals(s5));
    }
}
