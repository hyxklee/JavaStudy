package Test.ch4;

public class Rifle extends Gun{
    public Rifle(String model){
        super(model);
        bulletCount = 40;
    }
    @Override
    public void fire(){
        bulletCount -=5;
        System.out.printf("%s => => => => =>, %d\n", model, bulletCount);
    }
}
