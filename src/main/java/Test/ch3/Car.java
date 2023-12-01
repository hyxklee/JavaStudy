package Test.ch3;

public class Car {
    private String color;
    private String model;
    private int power;
    private int curSpeed;

    public Car(){//인자 없는 생성자
        curSpeed = 0;
    }
    public Car(String color, String model, int power){//인자 있는 생성자
        this.color = color;
        this.model = model;
        this.power = power;
    }
    public void go(){
        if(power < 200){
            curSpeed += 10;
        }
        else if(power >= 200){
            curSpeed += 20;
        }
        System.out.printf("Accelerate %s, Current Speed %d\n", model,curSpeed);
    }
    public void stop(){
        curSpeed = 0;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setPower(int power){
        this.power = power;
    }
}
