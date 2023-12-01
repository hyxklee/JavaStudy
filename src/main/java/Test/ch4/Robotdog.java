package Test.ch4;

public class Robotdog extends Robot implements Pet{
    public void bark(){
        System.out.println("woof woof");
    }
    void charging(){
        System.out.println(getName()+" go to charging station");
    }
    public static void main(String[] args){
        Robotdog rd = new Robotdog();
        rd.setName("robo dog");
        rd.bark();
        rd.move();
        rd.charging();
    }
}
