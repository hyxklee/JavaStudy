package Test.ch4;

public class Gun {
    protected String model;
    protected int bulletCount;
    public Gun(String model){
        this.model = model;
        bulletCount = 10;
    }
    public void fire(){
        System.out.println(model+"=>");
        bulletCount-=1;
    }
}
