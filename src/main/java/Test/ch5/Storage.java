package Test.ch5;

public class Storage<T> {
    T item;

    public T getItem(){
        return item;
    }
    public void setItem(T item){
        this.item = item;
    }
}
