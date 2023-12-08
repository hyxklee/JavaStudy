package Test.ch4;

public class ShotGun extends Gun{
    public ShotGun(String model){
        super(model);
    }
    @Override
    public void fire(){
        bulletCount -= 1;
        System.out.printf("%s =}}}, %d\n", model, bulletCount);
    }
}
