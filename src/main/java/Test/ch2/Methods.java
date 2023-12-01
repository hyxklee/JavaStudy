package Test.ch2;

public class Methods {
    String name;
    Methods(){//생성자
        name = "홍길동";
        System.out.printf("#생성자: %s\n", name);
    }
    void printName(){//기본 출력 함수
        System.out.printf("#printName(): %s\n", name);
    }
    void printName(String name){//기본 출력 함수 오버로딩
        System.out.printf("#pringName(String name): %s\n", name);
    }
    void printName(String...name){//기본 출력 함수 오버로딩
        System.out.println("#printName(String...name)");
        for(String s: name){
            System.out.println(s);
        }
    }

    int calc(int num1, int num2){
        return num1+num2;
    }

    public static void main(String[] args){
        Methods m = new Methods();
        m.printName();
        m.printName("김길동");
        m.printName("아무개", "홍길동", "김사랑");
        System.out.printf("#calc(int num1, int num2): %d", m.calc(20,50));
    }
}
