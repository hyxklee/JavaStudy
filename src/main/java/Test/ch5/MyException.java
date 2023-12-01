package Test.ch5;

public class MyException extends Exception{
    String exMsg;

    public MyException(String msg){
        exMsg = "MyException: "+ msg;
    }

    public String getMsg(){
        return exMsg;
    }
}
