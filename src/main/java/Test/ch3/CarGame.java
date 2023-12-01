package Test.ch3;

public class CarGame {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.setColor("red");
        c1.setModel("sonata");
        c1.setPower(180);

        Car c2 = new Car("blue","520d",210);
        c1.go();
        c2.go();
    }
}
