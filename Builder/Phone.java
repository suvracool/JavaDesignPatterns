package Builder2.JavaDesignPatterns;

public class Phone {
    private String os;
    private String make;
    private int battery;

    public Phone(String os,String make,int battery){
        this.os=os;
        this.make=make;
        this.battery=battery;
    }

    @Override
    public String toString(){
        return "Phone [os=" + os + ", make=" + make + ", battery=" + battery + "]";
    }

}
